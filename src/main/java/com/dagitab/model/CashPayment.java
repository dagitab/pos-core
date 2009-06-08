package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Represents cash payment mode
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@DiscriminatorValue("CASH")
public class CashPayment extends Payment implements Serializable {

	private static final long serialVersionUID = -5605769560865493846L;
	
	private Currency currency;
	private Double changeAmount;
	
	public Double getChangeAmount() {
		return changeAmount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setChangeAmount(Double changeAmount) {
		this.changeAmount = changeAmount;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
