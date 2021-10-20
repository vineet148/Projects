package com.example.restfulwebservices.post;

import java.util.Date;


public class Post {

	private Integer postId;
	private Integer userId;
	private Date timestamp;


	
	public Post(Integer postId, Integer userId, Date timestamp) {
		super();
		this.postId = postId;
		this.userId = userId;
		this.timestamp = timestamp;
	}

	public Integer getPostId() {
		return postId;
	}

	public void setPostId(Integer postId) {
		this.postId = postId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Post() {

	}

}
