package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Represents Unit of Measure used by an item
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="units")
public class UnitOfMeasure extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 5268356970501165200L;
	
	private String code;
	private String name;
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
