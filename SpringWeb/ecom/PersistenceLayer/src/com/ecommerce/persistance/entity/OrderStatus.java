package com.ecommerce.persistance.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_ORDER_STATUS")
public class OrderStatus implements Entity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer OrderStatusId;

	@Column(name="ORDER_STATUS")
	private String OrderStatus;
	
	public Integer getOrderStatusId() {
		return OrderStatusId;
	}
	public void setOrderStatusId(int orderStatusId) {
		OrderStatusId = orderStatusId;
	}
	public String getOrderStatus() {
		return OrderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		OrderStatus = orderStatus;
	}
	
	
}
