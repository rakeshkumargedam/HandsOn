package com.ltech.saas.platform.alogo.accountTokenization;

import java.io.Serializable;

public
class Account implements Serializable {

	String accountId;
	boolean isSensitive;
	String accountBalance;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getAccountId() {
		return accountId;
	}

	public
	boolean isSensitive() {
		return isSensitive;
	}

	public
	void setSensitive(boolean sensitive) {
		isSensitive = sensitive;
	}

	public
	String getAccountBalance() {
		return accountBalance;
	}

	public
	void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}

	public Account(String accountId, boolean isSensitive,
	               String accountBalance) {
		this.accountId =accountId;
		this.isSensitive = isSensitive;
		this.accountBalance = accountBalance;
	}
}
