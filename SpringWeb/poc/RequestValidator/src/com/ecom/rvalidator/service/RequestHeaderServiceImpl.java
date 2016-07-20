package com.ecom.rvalidator.service;

import java.util.Enumeration;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecom.rvalidator.dao.RequestHeaderDao;
import com.ecom.rvalidator.header.Request;
import com.ecom.rvalidator.header.RequestHeader;

@Service
public class RequestHeaderServiceImpl implements RequestHeaderService {

	@Autowired 
	private RequestHeaderDao requestHeaderDao;

	@Transactional
	public void addRequestHeader(Request req) {
		// TODO Auto-generated method stub
	
		//Validate Request Before fwding to DAO layer
		if(validate(req)){
			requestHeaderDao.addRequestHeader(req);
		}
		else{
			System.out.println("Headers can't be validated, and hence can't be persisted");
		}
	}


	private boolean validate(Request req) {
		// TODO Auto-generated method stub
		
		if(req.getUUID().length() != 8){
			return false;
		}
		return true;
	}

}