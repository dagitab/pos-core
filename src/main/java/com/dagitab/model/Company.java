package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Represents a business entity
 *
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="companies")
@Inheritance(strategy=InheritanceType.JOINED)
public class Company extends BaseEntity implements Serializable {
	
	private static final long serialVersionUID = -6961196843507024684L;

	private String name;  
	private Boolean main = false; 

	@Column(nullable=false, length=50, unique=true)
	public String getName() {
		return name;
	}
	
	/**
	 * Indicates if this company represents the main company
	 * 
	 * @return true if this is the main company otherwise false
	 */
	@Column(nullable=false)
	public Boolean getMain() {
		return main;
	}

	public void setMain(Boolean main) {
		this.main = main;
	}

	public void setName(String name) {
		this.name = name;
	}

}
