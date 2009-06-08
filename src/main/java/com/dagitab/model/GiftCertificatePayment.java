package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * Represents payment through gift certificates
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@DiscriminatorValue("GC")
public class GiftCertificatePayment extends Payment implements Serializable {
	private static final long serialVersionUID = 5513915975085216805L;
	
	private String gcNumber;

	public String getGcNumber() {
		return gcNumber;
	}

	public void setGcNumber(String gcNumber) {
		this.gcNumber = gcNumber;
	}
}
