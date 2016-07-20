package com.mart.user.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*
 * Every Entity Must Follow Entity Contract
 */

@javax.persistence.Entity
@Table(name="T_USERS")
public class User implements Entity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Integer Id;
	
	@Column(name="UserName")
	private String Name;
	
	@Column(name="Password")
	private String Password;
	
	//Registration One to One
	@OneToOne(cascade=CascadeType.ALL)
	@Cascade({org.hibernate.annotations.CascadeType.DELETE_ORPHAN})
	@JoinColumn(name="REGISTRATION_ID",unique=true)
	private Registration registration;
	
	//User Can have multiple addresses
	
	@JsonIgnore
	@OneToMany(mappedBy="user")
	private Set<UserAddress> userAddress;

	public Set<UserAddress> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(Set<UserAddress> userAddress) {
		this.userAddress = userAddress;
	}

	public Registration getRegistration() {
		return registration;
	}

	public void setRegistration(Registration registration) {
		this.registration = registration;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
}
