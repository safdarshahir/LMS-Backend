package com.nissan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.LoanType;
import com.nissan.repo.ILoanTypeRepository;

@Service
public class LoanTypeServiceImpl implements ILoanTypeService {
	
	@Autowired
	ILoanTypeRepository repoLoanType;

	@Override
	public List<LoanType> getAllLoanType() {
		// TODO Auto-generated method stub
		return repoLoanType.findAll();
	}

}
