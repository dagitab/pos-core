package com.dagitab.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Represents a form of payment for Items received
 * 
 * @author "James Faeldon"
 *
 */
@Entity
@Table(name="payments")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
	name="payment_type",
	discriminatorType=DiscriminatorType.STRING
)
public class Payment extends BaseEntity implements Serializable {

	private static final long serialVersionUID = 2153295134721795394L;
	private Double amount;
	private Date transactionDate;
	private Invoice invoice;
	private String branch;
	private String terminal;

	public Double getAmount() {
		return amount;
	}

	public String getBranch() {
		return branch;
	}

	@ManyToOne
	@JoinColumn(name="invoice_id")
	public Invoice getInvoice() {
		return invoice;
	}

	public String getTerminal() {
		return terminal;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}

	public void setTerminal(String terminal) {
		this.terminal = terminal;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

}
