package com.mart.user.dao;

import java.util.List;

import com.mart.user.entity.Entity;

/*
 * Basic CRUD Operations
 */
public interface InterfaceDao<T extends Entity, K>{
	T Create(T t);
	T delete(K id);
	List<T>FetchAll();
	T findByKey(K id);

}
