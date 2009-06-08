package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Represents payment through check
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@DiscriminatorValue("CHECK")
public class CheckPayment extends Payment implements Serializable {
	
	private static final long serialVersionUID = -8772103614501758849L;
	
	private String checkNumber;
	private String bank;
	private String bankBranch;
	private String acccount;

	public String getAcccount() {
		return acccount;
	}

	public String getBank() {
		return bank;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setAcccount(String acccount) {
		this.acccount = acccount;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

}
