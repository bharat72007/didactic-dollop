package org.restdb.service;

import java.util.List;

import org.restdb.domain.Employee;

/*
 * Operations exposed by Rest
 */
public interface EmployeeService {
	//Return EmpId on Save
    public int save (Employee e);
	//Return EmpId on Delete
	public int delete (Employee e);
	//Return EmpId on Update
	public int update (Employee e);
	//Return Employee on Retrieve Employee
	public Employee get (int Id);
	//Search for Employees
	public List<Employee> search(String params);


}
