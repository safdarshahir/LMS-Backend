package com.nissan.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tblAdmin")
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adminId;
	
	private String adminName;
	private String phoneNumber;
		
	private int userId;
	
	@JoinColumn(name="userId",insertable = false,updatable = false)
	@OneToOne
	private User user;

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(int adminId, String adminName, String phoneNumber, User user) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.phoneNumber = phoneNumber;
		this.user = user;
	}

	public int getAdminId() {
		return adminId;
	}

	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}

	public String getAdminName() {
		return adminName;
	}

	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}
