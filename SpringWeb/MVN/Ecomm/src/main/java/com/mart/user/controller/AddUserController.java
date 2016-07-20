package com.mart.user.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mart.user.entity.Registration;
import com.mart.user.entity.User;
import com.mart.user.service.IAddUserService;
import com.mart.user.service.IRegisterUser;

@Controller
public class AddUserController {
	
	@Autowired
	private IAddUserService AddUserService;

	@Autowired
	private IRegisterUser RegisterUser;
	
	@Autowired
	private HttpServletRequest request;
	
	@RequestMapping(value = "/add")
	public @ResponseBody String listBooksapi() {
		System.out.println("Add");
		Enumeration<String> headerNames = request.getHeaderNames();
		Registration reg = new Registration();
		User user = new User();
		String key = "";
		String value = "";
		//Create Request Object
		while(headerNames.hasMoreElements()){
			key = (String) headerNames.nextElement();
			value = request.getHeader(key);
			if(key.compareToIgnoreCase("FirstName") == 0){
				reg.setFirstName(value);
			}
			else if(key.compareToIgnoreCase("MiddleName") == 0){
				reg.setMiddleName(value);
			}
			else if(key.compareToIgnoreCase("LastName") ==0){
				reg.setLastName(value);
			}
			else if(key.compareToIgnoreCase("PrimaryEmail")==0){
				reg.setPrimaryEmail(value);
			}
			else if(key.compareToIgnoreCase("SecondaryEmail")==0){
				reg.setSecondaryEmail(value);
			}
			else if(key.compareToIgnoreCase("Mobile") ==0){
				reg.setMobile(value);
			}
			else if(key.compareToIgnoreCase("UserName") == 0){
				user.setName(value);
			}
			else if(key.compareToIgnoreCase("Password") == 0){
				user.setPassword(value);
			}
			else if(key.compareToIgnoreCase("CART_ID") == 0){
				//user.setCart(value);
			}
			else if(key.compareToIgnoreCase("REGISTRATION_ID") == 0){
			//	user.setRegistration(value);
			}
		}
		
		RegisterUser.RegisterUser(reg);
		AddUserService.addUser(user);
		return "Hello";
	}
}