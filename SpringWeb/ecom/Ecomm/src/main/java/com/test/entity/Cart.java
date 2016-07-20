package com.test.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_CART")
public class Cart  implements Entity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer Id;

	//Cart can have multiple Products
	@OneToMany(mappedBy="cart")
	private Set<Product> product;
	
	//UserId associated with Cart
	@OneToOne
	@JoinColumn(name="USER_ID",unique=true)
	private User user;
	
	@Column(name="DATE_ADDED")
	private Date DateAdded;
	
	@Column(name="LAST_UPTO_DATE")
	private Date LastUpdatedDate;
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getId() {
		return Id;
	}
	
	public void setId(int id) {
		Id = id;
	}
	
	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public Date getDateAdded() {
		return DateAdded;
	}
	
	public void setDateAdded(Date dateAdded) {
		DateAdded = dateAdded;
	}
	
	public Date getLastUpdatedDate() {
		return LastUpdatedDate;
	}
	
	public void setLastUpdatedDate(Date lastUpdatedDate) {
		LastUpdatedDate = lastUpdatedDate;
	}
}
