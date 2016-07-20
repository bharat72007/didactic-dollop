package com.ecommerce.persistance.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_USER_ADDRESS")
public class UserAddress implements Entity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer Id;
	
	@ManyToOne
	@JoinColumn(name="USER_ID")
	private User user;
	
	@ManyToOne
	@JoinColumn(name="PIN_ID")
	private Pin pin;
	
	@Column(name="ADDRESS_TYPE")
	private String AddressType;
	
	@Column(name="ADDRESS_LINE1")
	private String AddressLine1;
	
	@Column(name="ADDRESS_LINE2")
	private String AddressLine2;
	
	@Column(name="LANDMARK")
	private String LandMark;
	
	@Column(name="CITY")
	private String City;
	
	@Column(name="DISTRICT")
	private String District;
	
	@Column(name="STATE")
	private String State;
	
	@Column(name="COUNTRY")
	private String Country;

	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setPin(Pin pin) {
		this.pin = pin;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	
	public String getAddressType() {
		return AddressType;
	}
	public void setAddressType(String addressType) {
		AddressType = addressType;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getLandMark() {
		return LandMark;
	}
	public void setLandMark(String landMark) {
		LandMark = landMark;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getDistrict() {
		return District;
	}
	public void setDistrict(String district) {
		District = district;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Pin getPin() {
		return pin;
	}
	
}
