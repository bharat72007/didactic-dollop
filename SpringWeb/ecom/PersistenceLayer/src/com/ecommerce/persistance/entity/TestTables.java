package com.ecommerce.persistance.entity;


import java.util.Date;
import com.ecommerce.dao.InterfaceDao;
import com.ecommerce.dao.impl.DaoImpl;

public class TestTables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		InterfaceDao<Entity, ?> Id = new DaoImpl();
		
		
		User u = new User();
		u.setName("TEST1");
		u.setPassword("PASSWORD");
		User u1 = new User();
		u1.setName("TEST2");
		u1.setPassword("PASSWORD2");
		
		Registration r = new Registration();
		r.setFirstName("Test1");
		r.setLastName("LastName of Test1");
		r.setMiddleName("Jain");
		r.setMobile("9652776831");
		r.setPrimaryEmail("bharat@gmail.com");
		r.setSecondaryEmail("martins indi");
		r.setAccountCreated(new Date());
		
		Registration r1 = new Registration();
		r1.setFirstName("Test2");
		r1.setLastName("LastName of Test1");
		r1.setMiddleName("Jain");
		r1.setMobile("9652776831");
		r1.setPrimaryEmail("bharat@gmail.com");
		r1.setSecondaryEmail("martins indi");
		r1.setAccountCreated(new Date());
		
		ProductCategory pc = new ProductCategory();
		pc.setCategoryDescription("Books");
		pc.setCategoryKeywords("Text Books, Magzines");
		pc.setCategoryTitle("Stationary");
		pc.setDateAdded(new Date());
		pc.setLastUpdateDate(new Date());
		
		ProductSubCategory psc = new ProductSubCategory();
		psc.setAddedDate(new Date());
		psc.setLastUpdatedDate(new Date());
		psc.setSubCategoryKeywords("Magzines");
		psc.setSubCategoryTitle("Mag");
		
		ProductSubCategory psc1 = new ProductSubCategory();
		psc1.setAddedDate(new Date());
		psc1.setLastUpdatedDate(new Date());
		psc1.setSubCategoryKeywords("Text Books");
		psc1.setSubCategoryTitle("Text");
		
		Product p1 = new Product();
		p1.setProductTitleText("Book1");
		
		Product p2 = new Product();
		p2.setProductTitleText("Book2");
		
		Product p3 = new Product();
		p3.setProductTitleText("Magzine1");
		
		Product p4 = new Product();
		p4.setProductTitleText("Magzine1");
		
		p1.setProductSubCategory(psc1);
		p2.setProductSubCategory(psc1);
		p3.setProductSubCategory(psc);
		p4.setProductSubCategory(psc);
		
		/*SessionFactory sessionFactory= new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
	
	*/	

		
		//Id.Create(u);
		Id.Create(r);
//		session.save(r);
		Id.Create(r1);
//		session.save(r1);
		u.setRegistration(r);
		u1.setRegistration(r1);
		Id.Create(u);
//		session.save(u);
		Id.Create(u1);
//		session.save(u1);
		Id.Create(pc);
//		session.save(pc);
		psc1.setProductCategory(pc);
		psc.setProductCategory(pc);
		Id.Create(psc);
//		session.save(psc);
		Id.Create(psc1);
//		session.save(psc1);
		Id.Create(p1);
//		session.save(p1);
		Id.Create(p2);
//		session.save(p2);
		Id.Create(p3);
//		session.save(p3);
		Id.Create(p4);
//		session.save(p4);
		
//		session.getTransaction().commit();
//		session.close();
//		session = sessionFactory.openSession();
//		session.beginTransaction();
//		
		System.out.println("Done");
	
		
		
	
	
	}

}
