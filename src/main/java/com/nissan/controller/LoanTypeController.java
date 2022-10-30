package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.LoanType;
import com.nissan.services.ILoanTypeService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class LoanTypeController {

	@Autowired
	ILoanTypeService loanTypeService;
	
	@GetMapping("loan-types")
	List<LoanType> getAllLoanType(){
		
		return loanTypeService.getAllLoanType();
	}
}
