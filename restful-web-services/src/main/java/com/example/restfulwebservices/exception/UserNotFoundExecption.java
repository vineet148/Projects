package com.example.restfulwebservices.exception ;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class UserNotFoundExecption extends RuntimeException {

	
	public UserNotFoundExecption(String arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}


	
	
}
