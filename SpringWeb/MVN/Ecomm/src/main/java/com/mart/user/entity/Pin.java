package com.mart.user.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_PIN")
public class Pin implements Entity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="PINCODE")
	private Integer Pincode;
	
	@Column(name="AREA")
	private String Area;
	
	//Pin can have multiple User Addresses
	@OneToMany(mappedBy="pin")
	private Set<UserAddress> userAddress;

	public Integer getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Integer getPincode() {
		return Pincode;
	}

	public void setPincode(int pincode) {
		Pincode = pincode;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public Set<UserAddress> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(Set<UserAddress> userAddress) {
		this.userAddress = userAddress;
	}
}
