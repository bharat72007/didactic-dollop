package com.ecom.rvalidator.dao;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ecom.rvalidator.header.Request;
import com.ecom.rvalidator.header.RequestHeader;

@Repository
public class RequestHeaderImpl implements RequestHeaderDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void addRequestHeader(Request req) {
		// TODO Auto-generated method stub
		RequestHeader requestHeader = new RequestHeader();
		
		//Logic for Inserting Infos
		requestHeader.setRequest(req);
		sessionFactory.getCurrentSession().save(requestHeader);
	}


}
