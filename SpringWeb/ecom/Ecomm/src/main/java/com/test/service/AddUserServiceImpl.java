package com.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.dao.DaoImpl;
import com.test.dao.InterfaceDao;
import com.test.entity.User;


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