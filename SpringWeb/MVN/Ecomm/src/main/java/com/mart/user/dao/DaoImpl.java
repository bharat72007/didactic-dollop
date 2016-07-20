package com.mart.user.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mart.user.entity.Entity;

@Repository
public class DaoImpl<T extends Entity, I> implements InterfaceDao<T, I>{

	 @Autowired
	 private SessionFactory sessionFactory;
	    
	   
	@Override
	public Entity Create(Entity t) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(t);
		
		/*sessionFactory = Dao.getSessionFactory();
		Session session = sessionFactory.openSession();
		//Integer employeeID = null;
		try{
	         session.beginTransaction();
	         session.save(t); 
	         session.getTransaction().commit();
	      }catch (HibernateException e1) {
	       System.out.println("Not Successful");
	//       return null;
	      }finally {
	         session.close(); 
	      }
*/	   return t;
	}

	@Override
	public Entity delete(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List FetchAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Entity findByKey(Object id) {
		// TODO Auto-generated method stub
		return null;
	}

}
