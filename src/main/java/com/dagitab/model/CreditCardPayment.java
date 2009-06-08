package com.dagitab.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Represents payment through credit card
 * 
 * TODO: Persistence annotation
 * TODO: BaseObject requirements
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@DiscriminatorValue("CC")
public class CreditCardPayment extends Payment implements Serializable  {

	private static final long serialVersionUID = 2622968975258904897L;
	
	private String creditCardNumber;
	private String cardIssuer;
	private Date expireDate;
	private String slipNumber;
	
	
	public String getCardIssuer() {
		return cardIssuer;
	}
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public String getSlipNumber() {
		return slipNumber;
	}
	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}
	public void setSlipNumber(String slipNumber) {
		this.slipNumber = slipNumber;
	}

}
