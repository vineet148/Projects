package com.example.restfulwebservices.post;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostService {

	@Autowired
	PostDaoService postDaoService;
	
	@GetMapping(path="/findallposts")
	public List<Post> findPosts()
	{
		return postDaoService.findAllPosts();
	}
	
	@GetMapping(path="/findallpostsbyuser/{userid}")
	public List<Post> findPostbyUserid(@PathVariable Integer userid)
	{
		return postDaoService.findPostByUserId(userid);
	}	
	
}
