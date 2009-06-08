package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Stores system configuration
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="configurations")
public class Configuration extends BaseEntity implements Serializable {
	private static final long serialVersionUID = 2663134181821825198L;
	
	private String config;
	private String value;
	
	public String getConfig() {
		return config;
	}
	public String getValue() {
		return value;
	}
	public void setConfig(String config) {
		this.config = config;
	}
	public void setValue(String value) {
		this.value = value;
	}

}
