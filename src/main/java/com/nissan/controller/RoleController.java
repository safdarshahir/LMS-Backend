package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Role;
import com.nissan.services.IRoleService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class RoleController {

	@Autowired
	IRoleService roleService;
	
	@GetMapping("roles")
	List<Role> getAllRoles(){
		return roleService.getAllRoles();
	}
	
}
