package com.mart.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mart.user.dao.DaoImpl;
import com.mart.user.dao.InterfaceDao;
import com.mart.user.entity.User;


@Service
public class AddUserServiceImpl implements IAddUserService {

	@Autowired 
	private DaoImpl<User, Integer> IU;

	@Transactional
	public void addUser(User user) {
		// TODO Auto-generated method stub
		IU.Create(user);
	}

}