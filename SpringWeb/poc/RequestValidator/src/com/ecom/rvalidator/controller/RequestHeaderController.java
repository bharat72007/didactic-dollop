package com.ecom.rvalidator.controller;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ecom.rvalidator.header.Request;
import com.ecom.rvalidator.service.*;
@Controller
public class RequestHeaderController {
	
	@Autowired
	private RequestHeaderService RequestHeaderService;

	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value = "/header")
	public @ResponseBody void listBooksapi() {
		
		Enumeration<String> headerNames = request.getHeaderNames();
		
		Request req = new Request();
	
		String key = "";
		
		String value = "";

		//Create Request Object
		while(headerNames.hasMoreElements()){
			key = (String) headerNames.nextElement();
			value = request.getHeader(key);
	
			if(key.compareTo("accept") == 0){
				req.setAccept(value);
			}
			else if(key.compareTo("host") == 0){
				req.setHost(value);
			}
			else if(key.compareTo("content-length") ==0){
				req.setContent_Length(Integer.parseInt(value));
			}
			else if(key.compareTo("connection")==0){
				req.setConnection(value);
			}
			else if(key.compareTo("user-agent")==0){
				req.setUser_Agent(value);
			}
			else if(key.compareTo("cache-control") ==0){
				req.setCache_Control(value);
			}
			else if(key.compareTo("origin") == 0){
				req.setOrigin(value);
			}
			else if(key.compareTo("accept-encoding") ==0){
				req.setAccept_Encoding(value);
			}
			else if(key.compareTo("accept-language") ==0){
				req.setAccept_Language(value);
			}
			
			//Adding UUID header to persist 
			else if(key.compareToIgnoreCase("uuid")==0){
				req.setUUID(value);
				
			}
		}
		
		RequestHeaderService.addRequestHeader(req);
		
	}
	
	
}