package com.mart.user.service.exception;

/*
 * Custom Exception in case of Hibernate Connection failure
 */
public class HibernateException extends Exception{
	
	public HibernateException(){
		super();
	}
	
	public HibernateException(String msg){
		super(msg);
	}

	public HibernateException(String msg,Throwable th){
		super(msg,th);
	}
}
