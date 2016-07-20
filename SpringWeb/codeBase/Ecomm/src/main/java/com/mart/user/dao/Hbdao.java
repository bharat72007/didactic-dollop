package com.mart.user.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.mart.user.entity.Entity;

/*
 * Implementation of common Operations 
 */
@Repository
public class Hbdao<T extends Entity, I> implements Dao<T, I>{

	@Autowired
	private SessionFactory sessionFactory;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll(Class<T> t) {
		// TODO Auto-generated method stub
		Session session = null;
    	Transaction tx = null;
    	List<T> list = null;
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(t);
			list = (List<T>)criteria.list();
			tx.commit();
		}catch(RuntimeException e){
			try{
    			tx.rollback();
    		}catch(RuntimeException rbe){
    			
    		}
    		throw e;
    	}finally{
    		if(session!=null){
    			session.close();
    		}
		}	
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public T find(Class<T> t, I id) {
		// TODO Auto-generated method stub
		Session session = null;
    	Transaction tx = null;
    	T entry  = null;
    	try{
    		session = sessionFactory.openSession();
			tx = session.beginTransaction();
			entry = (T)session.get(t, (Serializable) id);
			tx.commit();
    	}catch(RuntimeException e){
			try{
    			tx.rollback();
    		}catch(RuntimeException rbe){
    			
    		}
    		throw e;
    	}finally{
    		if(session!=null){
    			session.close();
    		}
		}	
		return entry;
	}

	@Override
	public void delete(Class<T> t, I id) {
		// TODO Auto-generated method stub
		Session session = null;
		Transaction tx = null;
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			@SuppressWarnings("unchecked")
			T entry = (T)session.get(t, (Serializable) id);
			session.delete(entry);
			tx.commit();
		}catch(RuntimeException e){
			try{
    			tx.rollback();
    		}catch(RuntimeException rbe){
    			
    		}
    		throw e;
    	}finally{
    		if(session!=null){
    			session.close();
    		}
		}	
	}

	@Override
	public T save(T t) {
		// TODO Auto-generated method stub

		Session session = null;
		Transaction tx = null;
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			@SuppressWarnings("unchecked")
			T entry = (T)session.save(t);
			session.delete(entry);
			tx.commit();
		}catch(RuntimeException e){
			try{
    			tx.rollback();
    		}catch(RuntimeException rbe){
    			
    		}
    		throw e;
    	}finally{
    		if(session!=null){
    			session.close();
    		}
		}	
		return t;
	}
}
