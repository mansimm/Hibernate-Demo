package com.practice.hbm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="loan")
public class Loan {
	
	@Id
	@Column(name="loan_id")
	private Integer loanId;
	
	@Column(name="loan_name")
	private String loanName;
	
	@Column(name="rate_of_interest")
	private Double rateOfInterest;
	
	public Loan() {};
	
	public Loan(Integer loanId, String loanName, Double rateOfInterest) {
		super();
		this.loanId = loanId;
		this.loanName = loanName;
		this.rateOfInterest = rateOfInterest;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	public String getLoanName() {
		return loanName;
	}
	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}
	public Double getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(Double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	
	
	
	

}
