package com.test.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.entity.User;

public class UserDaoImpl  implements IUser{

	 @Autowired
	 private SessionFactory sessionFactory;
	
	@Override
	public User Create(User t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(t);
		
		return t;
	}

	@Override
	public User delete(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> FetchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
