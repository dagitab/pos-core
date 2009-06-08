package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Represents currency
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="currencies")
public class Currency extends BaseEntity implements Serializable {
	private static final long serialVersionUID = -8926013569438862219L;
	
	private Double conversionRate;
	private Boolean main = false;
	private String name;
	private String symbol;
	
	public Double getConversionRate() {
		return conversionRate;
	}
	public Boolean getMain() {
		return main;
	}
	
	public String getName() {
		return name;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setConversionRate(Double conversion) {
		this.conversionRate = conversion;
	}
	public void setMain(Boolean main) {
		this.main = main;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

}
