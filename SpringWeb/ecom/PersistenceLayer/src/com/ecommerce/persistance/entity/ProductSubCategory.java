package com.ecommerce.persistance.entity;

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
@Table(name="T_PRODUCT_SUBCATEGORY")
public class ProductSubCategory implements Entity{
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ID")
	private Integer Id;
	
	@Column(name="CATEGORY_ID")
	private Integer CategoryId;
	
	@ManyToOne
	@JoinColumn(name="PRODUCT_CAT_ID")
	private ProductCategory productCategory;
	
	//Subcategory can have many products
	@OneToMany(mappedBy="productSubCategory")
	private Set<Product> product;
	
	@Column(name="SUBCATEGORY_TITLE")
	private String SubCategoryTitle;
	
	@Column(name="SUBCATEGORY_KEYWORDS")
	private String SubCategoryKeywords;
	
	@Column(name="SUBCATEGORY_DESC")
	private String SubCategoryDescription;
	
	@Column(name="DATE_ADDED")
	private Date AddedDate;
	
	@Column(name="LAST_UPTO_DATE")
	private Date LastUpdatedDate;

	public Integer getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public Integer getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(int categoryId) {
		CategoryId = categoryId;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Set<Product> getProduct() {
		return product;
	}

	public void setProduct(Set<Product> product) {
		this.product = product;
	}

	public String getSubCategoryTitle() {
		return SubCategoryTitle;
	}

	public void setSubCategoryTitle(String subCategoryTitle) {
		SubCategoryTitle = subCategoryTitle;
	}

	public String getSubCategoryKeywords() {
		return SubCategoryKeywords;
	}

	public void setSubCategoryKeywords(String subCategoryKeywords) {
		SubCategoryKeywords = subCategoryKeywords;
	}

	public String getSubCategoryDescription() {
		return SubCategoryDescription;
	}

	public void setSubCategoryDescription(String subCategoryDescription) {
		SubCategoryDescription = subCategoryDescription;
	}

	public Date getAddedDate() {
		return AddedDate;
	}

	public void setAddedDate(Date addedDate) {
		AddedDate = addedDate;
	}

	public Date getLastUpdatedDate() {
		return LastUpdatedDate;
	}

	public void setLastUpdatedDate(Date lastUpdatedDate) {
		LastUpdatedDate = lastUpdatedDate;
	}
}
