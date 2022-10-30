package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Admin;
import com.nissan.services.IAdminService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class AdminController {
	
	@Autowired
	IAdminService adminService;
	
	@GetMapping("admins")
	List<Admin> getAllAdmins(){
		return adminService.getAllAdmins();
	}

}
