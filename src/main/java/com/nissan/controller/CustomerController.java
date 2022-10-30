package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Customer;
import com.nissan.services.ICustomerService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class CustomerController {
	
	@Autowired
	ICustomerService customerService;
	
	@GetMapping("customers")
	List<Customer> getAllCustomers(){
		
		return customerService.getAllCustomers();
	}

}
