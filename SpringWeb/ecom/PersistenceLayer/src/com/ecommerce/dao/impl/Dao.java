package com.ecommerce.dao.impl;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Dao {
	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory(){
		
		try {
			if(sessionFactory == null){
				sessionFactory = new Configuration().configure().buildSessionFactory();
			}
			
		}catch(ExceptionInInitializerError e){
			
		}
		return sessionFactory;
		
	}
}
