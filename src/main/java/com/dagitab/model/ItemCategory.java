package com.dagitab.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 * Represents different categories for tradable items
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="items")
@Inheritance(strategy=InheritanceType.JOINED)
public class ItemCategory extends BaseEntity implements Serializable {
	private static final long serialVersionUID = -3651007611262202499L;

	private String code;
	private String name;
	private String description;
	private Set<Item> items = new HashSet<Item>();
	
	public String getCode() {
		return code;
	}
	public String getDescription() {
		return description;
	}
	@ManyToMany
	@JoinTable(
		name="itemCategories_items",
		joinColumns={@JoinColumn(name="itemCategoryId")},
		inverseJoinColumns={@JoinColumn(name="itemId")}
	)
	public Set<Item> getItems() {
		return items;
	}
	public String getName() {
		return name;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setItems(Set<Item> items) {
		this.items = items;
	}
	public void setName(String name) {
		this.name = name;
	} 

}
