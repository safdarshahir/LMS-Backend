package com.nissan.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.model.Customer;
import com.nissan.repo.ICustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	ICustomerRepository repoCustomer;
	
	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return repoCustomer.findAll();
	}

}
