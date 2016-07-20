package com.mart.user.dao.User;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.mart.user.controller.UserResource;
import com.mart.user.dao.Hbdao;
import com.mart.user.entity.Registration;
import com.mart.user.entity.User;
import com.mart.user.service.exception.HibernateException;

@Repository
public class Userdao extends Hbdao<User,Integer> implements IUserdao{

	@Autowired
	private SessionFactory sessionFactory;
	
	static Logger log = Logger.getLogger(Userdao.class.getName());
	
	@Override
	public void UserRegistration(User user, Registration registration) throws HibernateException{
		// TODO Auto-generated method stub
		Session session = null;
    	Transaction tx = null;
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			session.save(user);
			session.save(registration);
			tx.commit();
		}catch(Exception e){
			try{
    			tx.rollback();
    		}catch(Exception rbe){
    			
    		}
    		throw new HibernateException("Unable to create  new User, due to Internal Error",e);
    	}finally{
    		if(session!=null){
    			session.close();
    		}
		}
	}
	
	public User getUserByUsername(String username){
		Session session = null;
    	Transaction tx = null;
		User u = null;
    	try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(User.class);
			u = (User)criteria.add(Expression.eq("Name",username)).list().get(0);
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
    	
		return u;
	}

	@Override
	public User getUserById(String userId) {
		// TODO Auto-generated method stub
		Session session = null;
    	Transaction tx = null;
		User u = null;
    	try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(User.class);
			u = (User)criteria.add(Expression.eq("Name",userId)).list().get(0);
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
    	System.out.println(u.getName());
    	log.debug(log.getClass().getName() + ": " + u.getName());
		return u;
	}

	@Override
	public String fetchPassByusername(String username) {
		// TODO Auto-generated method stub
		
		Session session = null;
		Transaction tx = null;
		String password = "";
		try{
			session = sessionFactory.openSession();
			tx = session.beginTransaction();
			Criteria criteria = session.createCriteria(User.class).setProjection(Projections.projectionList().add(Projections.property("Password"), "Password"));
			password = ((User)(criteria.add(Expression.eq("Name", username)).list().get(0))).getPassword();
			
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
		
		return password;
	}
	
	
	
}
