package com.nissan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Role;
import com.nissan.repo.IRoleRepository;

@Service
public class RoleServiceImpl implements IRoleService {

	@Autowired
	IRoleRepository roleRepo;
	
	@Override
	public List<Role> getAllRoles() {
		return roleRepo.findAll();
	}

}
