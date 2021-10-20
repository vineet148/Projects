package com.example.restfulwebservices.post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PostDaoService {

	private static List<Post> posts = new ArrayList<>();

	static {

		posts.add(new Post(11, 1, new Date()));
		posts.add(new Post(12, 2, new Date()));
		posts.add(new Post(13, 3, new Date()));
		posts.add(new Post(14, 1, new Date()));
	}

	public List<Post> findAllPosts() {
		return posts;
	}

	public List<Post> findPostByUserId(int id) {

		List<Post> list=new ArrayList<>();
		for (Post post : posts) {
			if (post.getUserId() == id) {
				list.add(post);

			}
		}

		return list ;
	}
}
