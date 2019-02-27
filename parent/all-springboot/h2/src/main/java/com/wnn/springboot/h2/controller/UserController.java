package com.wnn.springboot.h2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wnn.springboot.h2.entity.User;
import com.wnn.springboot.h2.repository.UserRepository;

@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;
	
	@GetMapping(value="/user/{id}",produces="application/json;charset=UTF-8")
	public User findById(@PathVariable Long id){
		User user = userRepository.getOne(id);
		System.out.println(user.toString());
		//User user = userRepository.findOne(id);
		return user;
	}
}
