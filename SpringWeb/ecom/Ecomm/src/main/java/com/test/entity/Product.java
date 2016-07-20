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
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_PRODUCT")
public class Product implements Entity {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer ProductId;
	
	@ManyToOne
	@JoinColumn(name="PRODUCT_SUB_CAT_ID")
	private ProductSubCategory productSubCategory;
	
	@ManyToOne
	@JoinColumn(name="PRODUCT_CAT_ID")
	private ProductCategory productCategory;
	
	@ManyToOne
	@JoinColumn(name="CART_ID")
	private Cart cart;
	
	//Product can have multiple coupons
	@OneToMany(mappedBy="product")
	private Set<Coupons> coupons;
	
	@Column(name="PRODUCT_TITLE")
	private String ProductTitleText;
	
	@Column(name="PRODUCT_DESC")
	private String ProductDescription;
	
	@Column(name="PRODUCT_KEYWORDS")
	private String ProductKeyWords;
	
	@Column(name="PRODUCT_THUMBNAIL_URL")
	private String ProductThumbnailUrl;
	
	@Column(name="PRODUCT_ZOOM_URL1")
	private String ZoomUrl1;
	
	@Column(name="PRODUCT_ZOOM_URL2")
	private String ZoomUrl2;
	
	@Column(name="PRODUCT_ZOOM_URL3")
	private String ZoomUrl3;

	@Column(name="PRODUCT_SELLING_PRICE")
	private Double SellingPrice;
	
	@Column(name="DATE_ADDED")
	private Date ProductAddedDate;
	
	@Column(name="LAST_UPTO_DATE")
	private Date LastUpdatedDate;

	public Integer getProductId() {
		return ProductId;
	}

	public void setProductId(int productId) {
		ProductId = productId;
	}

	public ProductSubCategory getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(ProductSubCategory productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Set<Coupons> getCoupons() {
		return coupons;
	}

	public void setCoupons(Set<Coupons> coupons) {
		this.coupons = coupons;
	}

	public String getProductTitleText() {
		return ProductTitleText;
	}

	public void setProductTitleText(String productTitleText) {
		ProductTitleText = productTitleText;
	}

	public String getProductDescription() {
		return ProductDescription;
	}

	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}

	public String getProductKeyWords() {
		return ProductKeyWords;
	}

	public void setProductKeyWords(String productKeyWords) {
		ProductKeyWords = productKeyWords;
	}

	public String getProductThumbnailUrl() {
		return ProductThumbnailUrl;
	}

	public void setProductThumbnailUrl(String productThumbnailUrl) {
		ProductThumbnailUrl = productThumbnailUrl;
	}

	public String getZoomUrl1() {
		return ZoomUrl1;
	}

	public void setZoomUrl1(String zoomUrl1) {
		ZoomUrl1 = zoomUrl1;
	}

	public String getZoomUrl2() {
		return ZoomUrl2;
	}

	public void setZoomUrl2(String zoomUrl2) {
		ZoomUrl2 = zoomUrl2;
	}

	public String getZoomUrl3() {
		return ZoomUrl3;
	}

	public void setZoomUrl3(String zoomUrl3) {
		ZoomUrl3 = zoomUrl3;
	}

	public Double getSellingPrice() {
		return SellingPrice;
	}

	public void setSellingPrice(double sellingPrice) {
		SellingPrice = sellingPrice;
	}

	public Date getProductAddedDate() {
		return ProductAddedDate;
	}

	public void setProductAddedDate(Date productAddedDate) {
		ProductAddedDate = productAddedDate;
	}

	public Date getLastUpdatedDate() {
		return LastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		LastUpdatedDate = lastUpdatedDate;
	}
	
}
