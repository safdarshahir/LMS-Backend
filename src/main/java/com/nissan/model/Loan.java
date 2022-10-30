package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tblLoan")
public class Loan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanId;	
	private double loanAmount;	
		
	private int loanTypeId;	
	private int customerId;
	private int fieldOfficerId;	
		
	private LocalDate requestCreatedDate;	
	private LocalDate acceptDate;
	private LocalDate verifiedDate;
	
	private boolean acceptStatus;
	private String acceptStatusMessage;
	
	private boolean verificationStatus;
	private String verificationStatusMessage;
	

	@JoinColumn(name="customerId",insertable = false,updatable = false)
	@ManyToOne
	private Customer customer;
	
	@JoinColumn(name="fieldOfficerId",insertable = false,updatable = false)
	@ManyToOne
	private FieldOfficer fieldOfficer;
	
	@JoinColumn(name="loanTypeId",insertable = false,updatable = false)
	@ManyToOne
	private LoanType loanType;

	public Loan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Loan(int loanId, double loanAmount, LocalDate requestCreatedDate, LocalDate acceptDate,
			LocalDate verifiedDate, boolean acceptStatus, String acceptStatusMessage, boolean verificationStatus,
			String verificationStatusMessage, Customer customer, FieldOfficer fieldOfficer, LoanType loanType) {
		super();
		this.loanId = loanId;
		this.loanAmount = loanAmount;
		this.requestCreatedDate = requestCreatedDate;
		this.acceptDate = acceptDate;
		this.verifiedDate = verifiedDate;
		this.acceptStatus = acceptStatus;
		this.acceptStatusMessage = acceptStatusMessage;
		this.verificationStatus = verificationStatus;
		this.verificationStatusMessage = verificationStatusMessage;
		this.customer = customer;
		this.fieldOfficer = fieldOfficer;
		this.loanType = loanType;
	}

	public int getLoanId() {
		return loanId;
	}

	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int getFielOfficerId() {
		return fieldOfficerId;
	}

	public void setFielOfficerId(int fielOfficerId) {
		this.fieldOfficerId = fielOfficerId;
	}

	public LocalDate getRequestCreatedDate() {
		return requestCreatedDate;
	}

	public void setRequestCreatedDate(LocalDate requestCreatedDate) {
		this.requestCreatedDate = requestCreatedDate;
	}

	public LocalDate getAcceptDate() {
		return acceptDate;
	}

	public void setAcceptDate(LocalDate acceptDate) {
		this.acceptDate = acceptDate;
	}

	public LocalDate getVerifiedDate() {
		return verifiedDate;
	}

	public void setVerifiedDate(LocalDate verifiedDate) {
		this.verifiedDate = verifiedDate;
	}

	public boolean isAcceptStatus() {
		return acceptStatus;
	}

	public void setAcceptStatus(boolean acceptStatus) {
		this.acceptStatus = acceptStatus;
	}

	public String getAcceptStatusMessage() {
		return acceptStatusMessage;
	}

	public void setAcceptStatusMessage(String acceptStatusMessage) {
		this.acceptStatusMessage = acceptStatusMessage;
	}

	public boolean isVerificationStatus() {
		return verificationStatus;
	}

	public void setVerificationStatus(boolean verificationStatus) {
		this.verificationStatus = verificationStatus;
	}

	public String getVerificationStatusMessage() {
		return verificationStatusMessage;
	}

	public void setVerificationStatusMessage(String verificationStatusMessage) {
		this.verificationStatusMessage = verificationStatusMessage;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public FieldOfficer getFieldOfficer() {
		return fieldOfficer;
	}

	public void setFieldOfficer(FieldOfficer fieldOfficer) {
		this.fieldOfficer = fieldOfficer;
	}

	public LoanType getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanType loanType) {
		this.loanType = loanType;
	}
	
	
	
	

}
