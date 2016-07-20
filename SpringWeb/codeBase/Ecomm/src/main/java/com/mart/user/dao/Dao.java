package com.mart.user.dao;

import java.util.List;

import com.mart.user.entity.Entity;
import com.mart.user.entity.User;

/*
 * Operations common to all Entity
 */
public interface Dao<T extends Entity,I> {

	List<T> findAll(Class<T> t); //List all Entries in Entity
	
	T find(Class<T> t, I id); //Retrieve Entry from entity based on PK
	
	void delete(Class<T> t, I id); //Delete Entry with id from Entity
	
	T save(T t) ; //Save Entry in Entity
	
}
