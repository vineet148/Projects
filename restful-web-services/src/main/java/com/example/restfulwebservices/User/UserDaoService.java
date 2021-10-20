package com.example.restfulwebservices.User;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private static int userCount = 4;

	static {
		users.add(new User(1, "vineet", new Date()));
		users.add(new User(2, "Ramesh", new Date()));
		users.add(new User(3, "Rakesh", new Date()));
		users.add(new User(4, "Rajesh", new Date()));

	}

	public List<User> findAll() {
		return users;
	}

	public User save(User user) {
		if (user.getId() == null) {
			user.setId(++userCount);
		}
		users.add(user);
		return user;
	}

	public User findOne(int id)
	{
		for(User user:users)
		{
			if(user.getId()==id)
			{
				return user;
			}
			
		}
		return null;
	}
}
