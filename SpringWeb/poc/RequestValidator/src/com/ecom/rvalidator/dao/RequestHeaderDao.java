package com.ecom.rvalidator.dao;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import com.ecom.rvalidator.header.Request;
import com.ecom.rvalidator.header.RequestHeader;

public interface RequestHeaderDao {
	
	public void addRequestHeader(Request req);
	
}
