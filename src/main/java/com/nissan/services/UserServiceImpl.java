package com.nissan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.User;
import com.nissan.repo.IUserRepository;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	IUserRepository userRepo;
	
	
	@Override
	public List<User> getAllUser() {
		return userRepo.findAll();
	}

}
