package com.mart.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mart.user.dao.DaoImpl;
import com.mart.user.entity.Registration;


@Service
public class RegisterUserImpl implements IRegisterUser {

	@Autowired 
	private DaoImpl<Registration, Integer> IR;

	@Transactional
	public void RegisterUser(Registration reg) {
		// TODO Auto-generated method stub
		IR.Create(reg);
	}

	
}