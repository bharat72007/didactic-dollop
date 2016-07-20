package com.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "RequestHeader", schema = "Header")
public class RequestHeader {

	@Id
	@Column(name="ID")
	@GeneratedValue
	private Integer id;
	
	
	private Request request;

	public Request getRequest() {
		return request;
	}

	@Embedded
	public void setRequest(Request request) {
		this.request = request;
	}
	
}
