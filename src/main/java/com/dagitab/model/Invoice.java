package com.dagitab.model;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Represents business transaction
 * composed of many invoice items
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="invoices")
@Inheritance(strategy=InheritanceType.JOINED)
public class Invoice extends BaseEntity implements Serializable {

	private static final long serialVersionUID = -2762420699378305643L;
	
	private String branch;
	private String terminal;
	private User user;
	private Boolean isVoid;
	private Customer customer;
	private Set<InvoiceItem> invoiceItems = new HashSet<InvoiceItem>();
	private Set<Payment> payments = new HashSet<Payment>();
	private String orderNumber;
	private String receiptNumber;
	private String invoiceNumber;
	private Date transactionDate;
	private Date paymentDate;
	
	private Double totalGrossPrice;
	private Double totalDiscountPrice;
	private Double totalVatSales;
	private Double totalVatOutput;
	private Double totalNonVatSales;
	private Double totalNetPrice;
	private Double totalPaymentAmount;
	private Double totalChangeAmount;
	
	public String getBranch() {
		return branch;
	}
	@ManyToOne
	@JoinColumn(name="customerId")
	public Customer getCustomer() {
		return customer;
	}
	@OneToMany(mappedBy="invoice", fetch=FetchType.EAGER)
	public Set<InvoiceItem> getInvoiceItems() {
		return invoiceItems;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public Boolean getIsVoid() {
		return isVoid;
	}
	public String getOrderNumber() {
		return orderNumber;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	@OneToMany(mappedBy="invoice", fetch=FetchType.EAGER)
	public Set<Payment> getPayments() {
		return payments;
	}
	public String getReceiptNumber() {
		return receiptNumber;
	}
	public String getTerminal() {
		return terminal;
	}
	public Double getTotalChangeAmount() {
		return totalChangeAmount;
	}
	public Double getTotalDiscountPrice() {
		return totalDiscountPrice;
	}
	public Double getTotalGrossPrice() {
		return totalGrossPrice;
	}
	public Double getTotalNetPrice() {
		return totalNetPrice;
	}
	public Double getTotalNonVatSales() {
		return totalNonVatSales;
	}
	public Double getTotalPaymentAmount() {
		return totalPaymentAmount;
	}
	public Double getTotalVatOutput() {
		return totalVatOutput;
	}
	public Double getTotalVatSales() {
		return totalVatSales;
	}
	public Date getTransactionDate() {
		return transactionDate;
	}
	@ManyToOne
	@JoinColumn(name="userId")
	public User getUser() {
		return user;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public void setInvoiceItems(Set<InvoiceItem> invoiceItems) {
		this.invoiceItems = invoiceItems;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public void setIsVoid(Boolean isVoid) {
		this.isVoid = isVoid;
	}
	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public void setPayments(Set<Payment> payments) {
		this.payments = payments;
	}
	public void setReceiptNumber(String receiptNumber) {
		this.receiptNumber = receiptNumber;
	}
	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}
	public void setTotalChangeAmount(Double totalChangeAmount) {
		this.totalChangeAmount = totalChangeAmount;
	}
	public void setTotalDiscountPrice(Double totalDiscountPrice) {
		this.totalDiscountPrice = totalDiscountPrice;
	}
	public void setTotalGrossPrice(Double totalGrossPrice) {
		this.totalGrossPrice = totalGrossPrice;
	}
	public void setTotalNetPrice(Double totalNetPrice) {
		this.totalNetPrice = totalNetPrice;
	}
	public void setTotalNonVatSales(Double totalNonVatSales) {
		this.totalNonVatSales = totalNonVatSales;
	}
	public void setTotalPaymentAmount(Double totalPaymentAmount) {
		this.totalPaymentAmount = totalPaymentAmount;
	}
	public void setTotalVatOutput(Double totalVatOutput) {
		this.totalVatOutput = totalVatOutput;
	}
	public void setTotalVatSales(Double totalVatSales) {
		this.totalVatSales = totalVatSales;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}
	public void setUser(User user) {
		this.user = user;
	}

	
}
