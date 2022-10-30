package com.nissan.model;

import java.util.List;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "tblCustomer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	private String customerName;
	private String gender;
	private String  address;
	private String phoneNumber;
	private String maritalStatus;
	private double salary;
	private String occupation;
		
	private int userId;
	
	@JoinColumn(name="userId",insertable = false,updatable = false)
	@OneToOne
	private User user;


	@JsonIgnore
	@OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
	private List<Loan> loans;

	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String customerName, String gender, String address, String phoneNumber,
			String maritalStatus, double salary, String occupation, User user, List<Loan> loans) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.maritalStatus = maritalStatus;
		this.salary = salary;
		this.occupation = occupation;
		this.user = user;
		this.loans = loans;
	}






	public List<Loan> getLoans() {
		return loans;
	}




	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}




	public int getCustomerId() {
		return customerId;
	}


	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getMaritalStatus() {
		return maritalStatus;
	}


	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getOccupation() {
		return occupation;
	}


	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

	public int getUserId() {
		return userId;
	}

}
