package com.ecommerce.dao;

import java.util.List;

import com.ecommerce.persistance.entity.Entity;
/*
 * Basic CRUD Operations
 */
public interface InterfaceDao<T extends Entity, K>{
	T Create(T t);
	T delete(K id);
	List<T>FetchAll();
	T findByKey(K id);

}
