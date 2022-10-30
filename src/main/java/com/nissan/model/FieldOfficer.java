package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
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
@Table(name="tblFieldOfficer")
public class FieldOfficer {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int fieldOfficerId;
	private String fieldOfficerName;
	private String phoneNumber;
		
	private int userId;
	
	@JoinColumn(name="userId",insertable = false,updatable = false)
	@OneToOne
	private User user;
	
	@JsonIgnore
	@OneToMany(mappedBy = "fieldOfficer",cascade = CascadeType.ALL)
	private List<Loan> loans;

	public FieldOfficer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public FieldOfficer(int fielOfficerId, String fieldOfficerName, String phoneNumber, int userId, User user,
			List<Loan> loans) {
		super();
		this.fieldOfficerId = fielOfficerId;
		this.fieldOfficerName = fieldOfficerName;
		this.phoneNumber = phoneNumber;
		this.userId = userId;
		this.user = user;
		this.loans = loans;
	}
	
	public int getFielOfficerId() {
		return fieldOfficerId;
	}

	public void setFielOfficerId(int fielOfficerId) {
		this.fieldOfficerId = fielOfficerId;
	}

	public String getFielOfficerName() {
		return fieldOfficerName;
	}

	public void setFielOfficerName(String fielOfficerName) {
		this.fieldOfficerName = fielOfficerName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getUserId() {
		return userId;
	}

	public User getUser() {
		return user;
	}


	
	public List<Loan> getLoans() {
		return loans;
	}

	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	


}
