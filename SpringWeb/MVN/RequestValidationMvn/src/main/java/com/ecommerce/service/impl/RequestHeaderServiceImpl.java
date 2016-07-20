package com.ecommerce.service.impl;

import java.util.Enumeration;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ecommerce.dao.RequestHeaderDao;
import com.ecommerce.entity.Request;
import com.ecommerce.service.RequestHeaderService;

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