package com.test.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_SHIPMENT_STATUS")
public class ShipmentStatus implements Entity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer ShipmentStatusId;
	
	@Column(name="SHIPMENT_STATUS")
	private String ShipmentStatus;
	
	public Integer getShipmentStatusId() {
		return ShipmentStatusId;
	}
	public void setShipmentStatusId(int shipmentStatusId) {
		ShipmentStatusId = shipmentStatusId;
	}
	public String getShipmentStatus() {
		return ShipmentStatus;
	}
	public void setShipmentStatus(String shipmentStatus) {
		ShipmentStatus = shipmentStatus;
	}
}
