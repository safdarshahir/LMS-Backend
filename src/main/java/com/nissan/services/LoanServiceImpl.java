package com.nissan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Loan;
import com.nissan.repo.ILoanRepository;

@Service
public class LoanServiceImpl implements ILoanService {

	@Autowired
	ILoanRepository repoLoan;
	
	@Override
	public List<Loan> getAllLoans() {
		// TODO Auto-generated method stub
		return repoLoan.findAll();
	}

}
