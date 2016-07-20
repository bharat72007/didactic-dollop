package com.ecommerce.persistance.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_USER_ADDRESS_TYPE")
public class UserAddressType implements Entity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer UserAddressTypeId;
	
	@Column(name="ADDRESS_TYPE")
	private String UserAddressType;
	
	public Integer getUserAddressTypeId() {
		return UserAddressTypeId;
	}
	public void setUserAddressTypeId(int userAddressTypeId) {
		UserAddressTypeId = userAddressTypeId;
	}
	public String getUserAddressType() {
		return UserAddressType;
	}
	public void setUserAddressType(String userAddressType) {
		UserAddressType = userAddressType;
	}
}
