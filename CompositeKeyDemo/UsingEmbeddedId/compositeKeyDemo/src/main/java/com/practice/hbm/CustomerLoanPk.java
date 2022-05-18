package com.practice.hbm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class CustomerLoanPk implements Serializable{
	@Column(name="customer_id")
	private Integer customerId;
	@Column(name="loan_id")
	private Integer loanId;
	
	public CustomerLoanPk() {}
	
	public CustomerLoanPk(Integer customerId, Integer loanId) {
		super();
		this.customerId = customerId;
		this.loanId = loanId;
	}
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getLoanId() {
		return loanId;
	}
	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}
	@Override
	public String toString() {
		return "CustomerLoanPk [customerId=" + customerId + ", loanId=" + loanId + "]";
	}


}

