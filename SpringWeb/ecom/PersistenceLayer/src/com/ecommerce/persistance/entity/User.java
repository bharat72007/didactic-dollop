package com.ecommerce.persistance.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	@OneToOne
	@JoinColumn(name="REGISTRATION_ID",unique=true)
	private Registration registration;
	
	//Cart One to One [Every User has one Cart]
	@OneToOne(cascade=CascadeType.REMOVE)
	@JoinColumn(name="CART_ID", unique=true)
	private Cart cart;
	
	//User Can have multiple addresses
	@OneToMany(mappedBy="user")
	private Set<UserAddress> userAddress;
	
	//User can have multiple Logins
	@OneToMany(mappedBy="user")
	private Set<Login> login;
	
	public Set<UserAddress> getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(Set<UserAddress> userAddress) {
		this.userAddress = userAddress;
	}

	public Set<Login> getLogin() {
		return login;
	}

	public void setLogin(Set<Login> login) {
		this.login = login;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
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
