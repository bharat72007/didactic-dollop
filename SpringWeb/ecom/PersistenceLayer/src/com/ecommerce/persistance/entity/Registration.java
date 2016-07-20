package com.ecommerce.persistance.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_REGISTRATION")
public class Registration implements Entity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Integer Id;
	
	@Column(name="FIRST_NAME")
	private String FirstName;
	
	@Column(name="MIDDLE_NAME")
	private String MiddleName;
	
	@Column(name="LAST_NAME")
	private String LastName;
	
	@Column(name="PRIMARY_EMAIL")
	private String PrimaryEmail;
	
	@Column(name="SECONDARY_EMAIL")
	private String SecondaryEmail;
	
	@Column(name="MOBILE")
	private String Mobile;
	
	@Column(name="DATE_ACCOUNT_CREATED")
	private Date AccountCreated;

	public Integer getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getMiddleName() {
		return MiddleName;
	}

	public void setMiddleName(String middleName) {
		MiddleName = middleName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPrimaryEmail() {
		return PrimaryEmail;
	}

	public void setPrimaryEmail(String primaryEmail) {
		PrimaryEmail = primaryEmail;
	}

	public String getSecondaryEmail() {
		return SecondaryEmail;
	}

	public void setSecondaryEmail(String secondaryEmail) {
		SecondaryEmail = secondaryEmail;
	}

	public String getMobile() {
		return Mobile;
	}

	public void setMobile(String mobile) {
		Mobile = mobile;
	}

	public Date getAccountCreated() {
		return AccountCreated;
	}

	public void setAccountCreated(Date accountCreated) {
		AccountCreated = accountCreated;
	}

}
