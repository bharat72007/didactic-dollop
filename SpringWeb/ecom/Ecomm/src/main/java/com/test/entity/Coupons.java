package com.test.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_COUPONS")
public class Coupons implements Entity{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="COUPON_CODE")
	private String CouponCode;

	@ManyToOne
	@JoinColumn(name="PRODUCT_ID")
	private Product product;
	
	@Column(name="COUPON_DESC")
	private String CouponDescription;
	
	@Column(name="COUPON_ACTIVATION_DATE")
	private Date CouponACtivationDate;
	
	@Column(name="COUPON_EXPIRY_DATE")
	private Date CouponExpiryDate;
	
	@Column(name="COUPON_CASH_VALUE")
	private Integer CouponCashValue;
	
	@Column(name="DATE_ADDED")
	private Date CouponAddedDate;
	
	@Column(name="LAST_UPTO_DATE")
	private Date LastUpdatedDate;

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCouponCode() {
		return CouponCode;
	}

	public void setCouponCode(String couponCode) {
		CouponCode = couponCode;
	}

	public String getCouponDescription() {
		return CouponDescription;
	}

	public void setCouponDescription(String couponDescription) {
		CouponDescription = couponDescription;
	}

	public Date getCouponACtivationDate() {
		return CouponACtivationDate;
	}

	public void setCouponACtivationDate(Date couponACtivationDate) {
		CouponACtivationDate = couponACtivationDate;
	}

	public Date getCouponExpiryDate() {
		return CouponExpiryDate;
	}

	public void setCouponExpiryDate(Date couponExpiryDate) {
		CouponExpiryDate = couponExpiryDate;
	}

	public Integer getCouponCashValue() {
		return CouponCashValue;
	}

	public void setCouponCashValue(int couponCashValue) {
		CouponCashValue = couponCashValue;
	}

	public Date getCouponAddedDate() {
		return CouponAddedDate;
	}

	public void setCouponAddedDate(Date couponAddedDate) {
		CouponAddedDate = couponAddedDate;
	}

	public Date getLastUpdatedDate() {
		return LastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		LastUpdatedDate = lastUpdatedDate;
	}
	
}
