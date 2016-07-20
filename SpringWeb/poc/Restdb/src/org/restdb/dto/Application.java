package org.restdb.dto;



//import org.example.dto.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.restdb.domain.Employee;

public class Application {

	private static SessionFactory sessionFactory;
	
	private static SessionFactory getSessionFactory(){
		try{
			if(sessionFactory == null){
				sessionFactory = new Configuration().configure().buildSessionFactory();
			}
		}catch(ExceptionInInitializerError e){
			
		}
		return sessionFactory;
	}
	
	
	
	public static Integer addEmployee(String fname, String lname, int salary){
		System.out.println("Call addEmployee");
		Session session = getSessionFactory().openSession();
		System.out.println("Session :" +session);
		//Transaction tx = null;
		Integer employeeID = null;
		try{
	         session.beginTransaction();
	         Employee employee = new Employee(fname, lname, salary);
	         employeeID = (Integer) session.save(employee); 
	         session.getTransaction().commit();
	      }catch (HibernateException e) {
	    	  if (session.getTransaction()!=null) session.getTransaction().rollback();
	          e.printStackTrace(); 
	      }finally {
	         session.close(); 
	      }
	      return employeeID;
	}
	
	public void deleteEmployee(){
		
	}
	
	public void retrieveEmployee(){
		
	}
	
	public void updateEmployee(){
		
	}
	
}