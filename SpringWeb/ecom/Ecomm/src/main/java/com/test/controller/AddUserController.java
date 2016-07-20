package com.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.entity.User;
import com.test.service.IAddUserService;

@Controller
public class AddUserController {
	
	@Autowired
	private IAddUserService AddUserService;

	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value = "/add")
	public @ResponseBody String listBooksapi() {
		System.out.println("Add");
		/*Enumeration<String> headerNames = request.getHeaderNames();
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
		*/
		User user = new User();
		user.setName("DALEY BLIND");
		user.setPassword("MARTINS INDI");
		
		AddUserService.addUser(user);
		return "Hello";
	}
}