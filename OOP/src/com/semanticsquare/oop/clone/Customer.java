package com.semanticsquare.oop.clone;

import java.util.Arrays;

public class Customer implements Cloneable {
	
	private String acctId;
	private String name;
	private int creditScore;
	
	private String[] accountTypes;
	
	public Customer(String acctId, String name, int creditScore, String[] accountTypes) {
		super();
		this.acctId = acctId;
		this.name = name;
		this.creditScore = creditScore;
		this.accountTypes = accountTypes;
	}

	public String getAcctId() {
		return acctId;
	}

	public void setAcctId(String acctId) {
		this.acctId = acctId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCreditScore() {
		return creditScore;
	}

	public void setCreditScore(int creditScore) {
		this.creditScore = creditScore;
	}
	
	public String[] getAccountTypes() {
		return accountTypes;
	}

	public void setAccountTypes(String[] accountTypes) {
		this.accountTypes = accountTypes;
	}

	@Override
	public String toString() {
		return "Customer [acctId=" + acctId + ","
				+ " name=" + name
				+ ", creditScore=" + creditScore + ","
				+ " accountTypes=" + Arrays.toString(accountTypes) + "]";
	}

	public Customer clone() {
		try {
			return (Customer) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}