package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.FieldOfficer;
import com.nissan.services.IFieldService;

@CrossOrigin
@RestController
@RequestMapping("api/")
public class FieldOfficerController {
	
	@Autowired
	IFieldService fieldOfficerService;
	
	@GetMapping("field-officers")
	List<FieldOfficer> getAllFieldOfficers(){
		
		return fieldOfficerService.getAllFieldOfficers();
	}
	

}
