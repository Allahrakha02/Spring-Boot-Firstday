package com.training.rest.restfulldemo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.training.rest.restfulldemo.dao.UserDaoService;
import com.training.rest.restfulldemo.user.User;

@RestController
@RequestMapping("/users")
public class UserResources {
	
	@Autowired
	private UserDaoService userDao;
	
	
	@GetMapping(path="/allUsers")
	public List<User> getAllUser(){
		
		return userDao.getAllUser();
	}
	
	
	@GetMapping("/oneUser/{userId}")
	public User getOneUser(@PathVariable int userId) {
		return userDao.getUser(userId);
		
	}
	
	@PostMapping("/createUser")
	public void createUser(@RequestBody User user) {
	
		user.setBirthDate(new Date());
		userDao.saveUser(user);
		
	}

}
