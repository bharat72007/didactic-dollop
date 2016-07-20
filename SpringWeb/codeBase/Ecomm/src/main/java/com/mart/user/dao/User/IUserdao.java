package com.mart.user.dao.User;

import com.mart.user.dao.Dao;
import com.mart.user.entity.Registration;
import com.mart.user.entity.User;
import com.mart.user.service.exception.HibernateException;

public interface IUserdao extends Dao<User,Integer>{
	//Operation when user is registered,hence updating user and registration entities
	void UserRegistration(User user,Registration registration) throws HibernateException;
	User getUserById(String userId);
	String fetchPassByusername(String username);
}
