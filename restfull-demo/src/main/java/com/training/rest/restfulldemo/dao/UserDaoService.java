package com.training.rest.restfulldemo.dao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import com.training.rest.restfulldemo.user.User;

@Component
public class UserDaoService {

	private static List<User> users = new ArrayList<>();
	private static int userCount = 106;

	static {

		users.add(new User(101, "Rupa", new Date()));
		users.add(new User(102, "Akshya", new Date()));
		users.add(new User(103, "Ramu", new Date()));
		users.add(new User(104, "Rihan", new Date()));
		users.add(new User(105, "Lolit", new Date()));

	}

	public User saveUser(User user) {
		if (user.getUserId() == null) {
			user.setUserId(++userCount);

		}
		users.add(user);
		return user;
	}

	public List<User> getAllUser() {

		return users;

	}

	public User getUser(int userId) {
		for (User u : users) {
			if (u.getUserId() == userId) {
				return u;
			}

		}
		return null;
	}

	public User deleteUser() {
		return null;
	}

	public User updateuser() {
		return null;
	}

}
