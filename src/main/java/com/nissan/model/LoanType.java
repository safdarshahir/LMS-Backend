package com.nissan.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="tblLoanType")
public class LoanType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loanTypeId;
	
	private String loanTypeName;
	private double tenure;
	private double interestRate;
	
	
	@JsonIgnore
	@OneToMany(mappedBy = "loanType",cascade = CascadeType.ALL)
	private List<Loan> loans;

	public LoanType() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoanType(int loanTypeId, String loanTypeName, double tenure, double interestRate, List<Loan> loans) {
		super();
		this.loanTypeId = loanTypeId;
		this.loanTypeName = loanTypeName;
		this.tenure = tenure;
		this.interestRate = interestRate;
		this.loans = loans;
	}




	public int getLoanTypeId() {
		return loanTypeId;
	}

	public void setLoanTypeId(int loanTypeId) {
		this.loanTypeId = loanTypeId;
	}

	public String getLoanTypeName() {
		return loanTypeName;
	}

	public void setLoanTypeName(String loanTypeName) {
		this.loanTypeName = loanTypeName;
	}


	public List<Loan> getLoans() {
		return loans;
	}


	public void setLoans(List<Loan> loans) {
		this.loans = loans;
	}

	public double getTenure() {
		return tenure;
	}

	public void setTenure(double tenure) {
		this.tenure = tenure;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	
	
}
