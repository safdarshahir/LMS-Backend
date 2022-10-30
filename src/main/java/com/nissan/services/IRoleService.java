package com.nissan.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.nissan.model.Role;


public interface IRoleService {
	
	//get all roles
	List<Role> getAllRoles();
}
