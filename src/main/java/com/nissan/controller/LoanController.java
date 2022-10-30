package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Loan;
import com.nissan.services.ILoanService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class LoanController {

	@Autowired
	ILoanService loanService;
	
	@GetMapping("loans")
	List<Loan> getAllLoans(){
		return loanService.getAllLoans();
	}
}
