package com.practice.hbm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="customer_loan")
@IdClass(value=CustomerLoanPk.class)
public class CustomerLoan {
	@Id
	@Column(name="customer_id")
	private Integer customerId;
	
	@Id
	@Column(name="loan_id")
	private Integer loanId;
	
	@Column(name="eligible_amount")
	private Double eligibleAmount;
	
	@Column(name="availed_Amount")
	private Double availedAmount;
	
	@Column(name="tenure_in_years")
	private Integer tenureInYears;

	public CustomerLoan() {}
	public CustomerLoan(Integer customerId, Integer loanId, Double eligibleAmount, Double availedAmount,
			Integer tenureInYears) {
		super();
		this.customerId = customerId;
		this.loanId = loanId;
		this.eligibleAmount = eligibleAmount;
		this.availedAmount = availedAmount;
		this.tenureInYears = tenureInYears;
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

	public Double getEligibleAmount() {
		return eligibleAmount;
	}

	public void setEligibleAmount(Double eligibleAmount) {
		this.eligibleAmount = eligibleAmount;
	}

	public Double getAvailedAmount() {
		return availedAmount;
	}

	public void setAvailedAmount(Double availedAmount) {
		this.availedAmount = availedAmount;
	}

	public Integer getTenureInYears() {
		return tenureInYears;
	}

	public void setTenureInYears(Integer tenureInYears) {
		this.tenureInYears = tenureInYears;
	}
	@Override
	public String toString() {
		return "CustomerLoan [customerId=" + customerId + ", loanId=" + loanId + ", eligibleAmount=" + eligibleAmount
				+ ", availedAmount=" + availedAmount + ", tenureInYears=" + tenureInYears + "]";
	}
	
	
	
}
