package org.restdb.dao;

import java.util.List;

import org.restdb.domain.Employee;
/*
 * DataBase Supported operations
 */

public interface EmpDao {
	
	public int save (Employee e);
	
	public int delete (Employee e);
	
	public int update (Employee e);
	
	public Employee get (int Id);
	
	public List<Employee> search(String params);

}
