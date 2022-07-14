package com.Johnny_Carvalho.UserDept_Java.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Johnny_Carvalho.UserDept_Java.entities.User;
import com.Johnny_Carvalho.UserDept_Java.repositories.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll() {
		List<User> result = repository.findAll();
		return result;
		
	}

}
