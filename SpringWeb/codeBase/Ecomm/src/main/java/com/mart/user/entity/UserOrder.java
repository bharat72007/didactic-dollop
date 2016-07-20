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
@Table(name="T_USER_ORDER")
public class UserOrder implements Entity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="USER_ID")
	private Integer UserId;
	
	@Column(name="ORDER_DATE")
	private Date OrderDate;
	
	@Column(name="CART_ID")
	private Integer CartId;
	
	@Column(name="ORDER_STATUS")
	private String OrderStatus;
	
	@Column(name="TOTAL_AMOUNT")
	private Double TotalAmount;
	
	@Column(name="SHIPMENT_STATUS")
	private String ShipmentStatus;
	
	@Column(name="PAYMENT_STATUS")
	private String PaymentStatus;
	
	@OneToOne
	@JoinColumn(name="BILLING_ADDRESS")
	private UserAddress userAddress;
	
	@OneToOne
	@JoinColumn(name="SHIPPING_ADDRESS")
	private UserAddress shippingUserAddress;
	
	@OneToOne
	@JoinColumn(name="INVOICE_ID",unique=true)
	private Invoice invoice;
	
	public UserAddress getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(UserAddress userAddress) {
		this.userAddress = userAddress;
	}
	public UserAddress getShippingUserAddress() {
		return shippingUserAddress;
	}
	public void setShippingUserAddress(UserAddress shippingUserAddress) {
		this.shippingUserAddress = shippingUserAddress;
	}
	public Invoice getInvoice() {
		return invoice;
	}
	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public Integer getUserId() {
		return UserId;
	}
	public void setUserId(int userId) {
		UserId = userId;
	}
	public Date getOrderDate() {
		return OrderDate;
	}
	public void setOrderDate(Date orderDate) {
		OrderDate = orderDate;
	}
	public Integer getCartId() {
		return CartId;
	}
	public void setCartId(int cartId) {
		CartId = cartId;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	public Double getTotalAmount() {
		return TotalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		TotalAmount = totalAmount;
	}
	public String getShipmentStatus() {
		return ShipmentStatus;
	}
	public void setShipmentStatus(String shipmentStatus) {
		ShipmentStatus = shipmentStatus;
	}
	public String getPaymentStatus() {
		return PaymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		PaymentStatus = paymentStatus;
	}
	
}
