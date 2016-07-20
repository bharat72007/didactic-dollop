package com.mart.user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_INVOICE")
public class Invoice implements Entity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="INVOICE_CREATED_DATE")
	private Date InvoiceCreatedDate;
	
	@OneToOne
	@JoinColumn(name="ORDER_ID",unique=true)
	private UserOrder userOrder;
	
	@Column(name="NOTES")
	private String Notes;

	public Integer getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Date getInvoiceCreatedDate() {
		return InvoiceCreatedDate;
	}

	public void setInvoiceCreatedDate(Date invoiceCreatedDate) {
		InvoiceCreatedDate = invoiceCreatedDate;
	}

	public UserOrder getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(UserOrder userOrder) {
		this.userOrder = userOrder;
	}

	public String getNotes() {
		return Notes;
	}

	public void setNotes(String notes) {
		Notes = notes;
	}
}
