package com.dagitab.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents tradable items delivered to a customer
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="invoiceItems")
@Inheritance(strategy=InheritanceType.JOINED)
public class InvoiceItem extends BaseEntity implements Serializable {
	private static final long serialVersionUID = -6971881759092599974L;

	private Invoice invoice;
	private Item item;
	private Double quantity;
	private UnitOfMeasure unit;
	private String discountDetails;
	private Double unitPrice;
	private Double grossPrice;
	private Double discountPrice;
	private Double vatSales;
	private Double vatOutput;
	private Double nonVatSales;
	private Double netPrice;

	/**
	 * Contains the details of the computation based on discount
	 * 
	 * @return details of discount computation
	 */
	public String getDiscountDetails() {
		return discountDetails;
	}
	public Double getDiscountPrice() {
		return discountPrice;
	}
	public Double getGrossPrice() {
		return grossPrice;
	}
	@ManyToOne
	@JoinColumn(name="invoiceId")
	public Invoice getInvoice() {
		return invoice;
	}
	@ManyToOne
	@JoinColumn(name="itemId")
	public Item getItem() {
		return item;
	}
	public Double getNetPrice() {
		return netPrice;
	}
	public Double getNonVatSales() {
		return nonVatSales;
	}
	public Double getQuantity() {
		return quantity;
	}
	@ManyToOne
	@JoinColumn(name="unitOfMeasureId")
	public UnitOfMeasure getUnit() {
		return unit;
	}
	public Double getUnitPrice() {
		return unitPrice;
	}
	public Double getVatOutput() {
		return vatOutput;
	}
	public Double getVatSales() {
		return vatSales;
	}
	public void setDiscountDetails(String discountDetails) {
		this.discountDetails = discountDetails;
	}
	public void setDiscountPrice(Double discountPrice) {
		this.discountPrice = discountPrice;
	}
	public void setGrossPrice(Double grossPrice) {
		this.grossPrice = grossPrice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public void setNetPrice(Double netPrice) {
		this.netPrice = netPrice;
	}
	public void setNonVatSales(Double nonVatSales) {
		this.nonVatSales = nonVatSales;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public void setUnit(UnitOfMeasure unit) {
		this.unit = unit;
	}
	public void setUnitPrice(Double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public void setVatOutput(Double vatOutput) {
		this.vatOutput = vatOutput;
	}
	public void setVatSales(Double vatSales) {
		this.vatSales = vatSales;
	}
	

}
