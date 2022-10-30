package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.User;
import com.nissan.services.IUserService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class UserController {

	@Autowired
	IUserService userService;
	
	@GetMapping("users")
	List<User> getAllUser(){
		return userService.getAllUser();
	}
}
