package com.example.restfulwebservices.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloContoller {

	
	@GetMapping(path="/hello-world")
	public String hello()
	{
		
		return "hello world";
	}
	
	@GetMapping(path="/hello-world-bean")
	public HelloWorldBean HelloWorldBean()
	{
		
		return new HelloWorldBean("hello world-bean");
	}
	
	@GetMapping(path="/hello-world-bean/path-varible/{name}")
	public HelloWorldBean HelloWorlPathVariable(@PathVariable String name)
	{
		
		return new HelloWorldBean(String.format("hello %s",name));
	}
}
