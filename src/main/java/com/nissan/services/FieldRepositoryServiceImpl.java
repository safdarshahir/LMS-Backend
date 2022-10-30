package com.nissan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.FieldOfficer;
import com.nissan.repo.IFieldRepository;

@Service
public class FieldRepositoryServiceImpl implements IFieldService{

	@Autowired
	IFieldRepository repoFieldOfficers;
	
	@Override
	public List<FieldOfficer> getAllFieldOfficers() {
		// TODO Auto-generated method stub
		return repoFieldOfficers.findAll();
	}

}
