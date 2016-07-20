package com.mart.user.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_PAYMENT_STATUS")
public class PaymentStatus implements Entity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer PaymentStatusId;
	
	@Column(name="PAYMENT_STATUS")
	private String PaymentStatus;
	public Integer getPaymentStatusId() {
		return PaymentStatusId;
	}
	public void setPaymentStatusId(int paymentStatusId) {
		PaymentStatusId = paymentStatusId;
	}
	public String getPaymentStatus() {
		return PaymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}
	
	
}
