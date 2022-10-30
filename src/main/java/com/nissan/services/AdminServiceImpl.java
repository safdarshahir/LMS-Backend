package com.nissan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Admin;
import com.nissan.repo.IAdminRepository;

@Service
public class AdminServiceImpl implements IAdminService{

	@Autowired
	IAdminRepository repoAdmin;
	
	@Override
	public List<Admin> getAllAdmins() {
		// TODO Auto-generated method stub
		return repoAdmin.findAll();
	}

}
