package com.example.restfulwebservices.User;


import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponents;

import com.example.restfulwebservices.exception.UserNotFoundExecption;

@RestController
public class UserResource {

	@Autowired
	UserDaoService userDaoService;
	
	@GetMapping(path="/getallUsers")
	public List<User> findAll(){
		
		return userDaoService.findAll();
		
	}
	
	@GetMapping(path="/get-one-user/{id}")
	public User findOne(@PathVariable int id ){
		
		User user=userDaoService.findOne(id);
	    if(user==null)
	    {
	    	throw new UserNotFoundExecption("id"+id);
	    }
		return user;
		
	}
	
	@PostMapping(path="/create-user")
	public ResponseEntity<Object> findOne(@RequestBody User user ){
		
		User savedUser=userDaoService.save(user);
	    URI location=ServletUriComponentsBuilder.fromCurrentRequest()
		.path("/{id}")
		.buildAndExpand(savedUser.getId()).toUri();
		
		return ResponseEntity.created(location).build();
		
	}
	
	
}
