package com.nissan.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nissan.model.User;


public interface IUserService {

	//find all user
	List<User> getAllUser();
}
