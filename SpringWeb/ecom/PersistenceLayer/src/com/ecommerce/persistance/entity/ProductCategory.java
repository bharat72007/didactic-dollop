package com.ecommerce.persistance.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="T_PRODUCT_CATEGORY")
public class ProductCategory implements Entity{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="Id")
	private Integer Id;
	
	@Column(name="CATEGORRY_TITLE")
	private String CategoryTitle;
	
	@Column(name="CATEGORY_DESC")
	private String CategoryDescription;
	
	@Column(name="CATEGORY_KEYWORDS")
	private String CategoryKeywords;
	
	@Column(name="DATE_ADDED")
	private Date DateAdded;
	
	@Column(name="LAST_UPTO_DATE")
	private Date LastUpdateDate;
	
	//Product category can have multiple subcategories
	@OneToMany(mappedBy="productCategory")
	private Set<ProductSubCategory> productSubCategory;
	
	//Product category can have multiple products
	@OneToMany(mappedBy="productCategory")
	private Set<Product> product;

	public Integer getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCategoryTitle() {
		return CategoryTitle;
	}

	public void setCategoryTitle(String categoryTitle) {
		CategoryTitle = categoryTitle;
	}

	public String getCategoryDescription() {
		return CategoryDescription;
	}

	public void setCategoryDescription(String categoryDescription) {
		CategoryDescription = categoryDescription;
	}

	public String getCategoryKeywords() {
		return CategoryKeywords;
	}

	public void setCategoryKeywords(String categoryKeywords) {
		CategoryKeywords = categoryKeywords;
	}

	public Date getDateAdded() {
		return DateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		DateAdded = dateAdded;
	}

	public Date getLastUpdateDate() {
		return LastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		LastUpdateDate = lastUpdateDate;
	}

	public Set<ProductSubCategory> getProductSubCategory() {
		return productSubCategory;
	}

	public void setProductSubCategory(Set<ProductSubCategory> productSubCategory) {
		this.productSubCategory = productSubCategory;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}
}
