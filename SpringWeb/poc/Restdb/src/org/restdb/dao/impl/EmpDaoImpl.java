package org.restdb.dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.restdb.dao.*;
import org.restdb.domain.Employee;

public class EmpDaoImpl implements EmpDao {

	@Override
	public int save(Employee e) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = Dao.getSessionFactory();
		Session session = sessionFactory.openSession();
		Integer employeeID = null;
		try{
	         session.beginTransaction();
	         employeeID = (Integer) session.save(e); 
	         session.getTransaction().commit();
	      }catch (HibernateException e1) {
	       System.out.println("Id");  
	      }finally {
	         session.close(); 
	      }
	   return employeeID;
	}

	@Override
	public int delete(Employee e) {
		// TODO Auto-generated method stub
		return -99999;
	}

	@Override
	public int update(Employee e) {
		// TODO Auto-generated method stub
		return -99999;
	}

	@Override
	public Employee get(int Id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> search(String params) {
		// TODO Auto-generated method stub
		return null;
	}

}
