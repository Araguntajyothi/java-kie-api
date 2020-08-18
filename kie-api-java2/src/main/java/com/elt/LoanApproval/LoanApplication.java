package com.elt.LoanApproval;

import java.io.Serializable;

public class LoanApplication implements Serializable{
	
	private Integer amount;
	private String loanApplicationStatus;
	private String accountType;
	private Integer loanAmount;
	
	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getLoanApplicationStatus() {
		return loanApplicationStatus;
	}
	public void setLoanApplicationStatus(String loanApplicationStatus) {
		this.loanApplicationStatus = loanApplicationStatus;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public Integer getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(Integer loanAmount) {
		this.loanAmount = loanAmount;
	}
	
	

}
