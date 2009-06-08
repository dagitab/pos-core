package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents tradable items
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="items")
@Inheritance(strategy=InheritanceType.JOINED)
public class Item extends BaseEntity implements Serializable {
	private static final long serialVersionUID = -3230098765001589881L;

	private String name;
	private String code;
	private String description;
	private UnitOfMeasure unit;
	private Double unitPrice;
	private Double unitCost;
	
	public String getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}
	public String getName() {
		return name;
	}
	@ManyToOne
	@JoinColumn(name="unitId")
	public UnitOfMeasure getUnit() {
		return unit;
	}
	public Double getUnitCost() {
		return unitCost;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setUnit(UnitOfMeasure unit) {
		this.unit = unit;
	}
	public void setUnitCost(Double unitCost) {
		this.unitCost = unitCost;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
}
