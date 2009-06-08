package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Represent discount rule
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="discounts")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	name="discount_type",
	discriminatorType=DiscriminatorType.STRING
)
public class Discount extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -6551571772881096747L;
	private String description;
	private String name;
	private String rule;
	
	public String getDescription() {
		return description;
	}
	public String getName() {
		return name;
	}
	public String getRule() {
		return rule;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRule(String rule) {
		this.rule = rule;
	}

}
