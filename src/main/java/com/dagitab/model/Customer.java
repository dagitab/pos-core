package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Represents an entity buying tradable items
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="customers")
@Inheritance(strategy=InheritanceType.JOINED)
public class Customer extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 5357962491585942834L;
	
    private Address address = new Address();
    private String email;                       // required; unique
    private String firstName;                   // required
    private String lastName;                    // required
    private String phoneNumber;
    private String website;
	public Address getAddress() {
		return address;
	}
	public String getEmail() {
		return email;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public String getWebsite() {
		return website;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public void setWebsite(String website) {
		this.website = website;
	}

	

}
