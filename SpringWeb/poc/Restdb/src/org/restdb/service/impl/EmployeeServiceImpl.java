package org.restdb.service.impl;

import java.util.List;

import org.restdb.dao.EmpDao;
import org.restdb.domain.Employee;
import org.restdb.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	EmpDao empDao = null;
	public EmployeeServiceImpl(EmpDao empDao){
		this.empDao = empDao;
	}
	@Override
	public int save(Employee e) {
		// TODO Auto-generated method stub
		return empDao.save(e);
	}

	@Override
	public int delete(Employee e) {
		// TODO Auto-generated method stub
		return empDao.delete(e);
	}

	@Override
	public int update(Employee e) {
		// TODO Auto-generated method stub
		return empDao.update(e);
	}

	@Override
	public Employee get(int Id) {
		// TODO Auto-generated method stub
		return empDao.get(Id);
	}

	@Override
	public List<Employee> search(String params) {
		// TODO Auto-generated method stub
		return null;
	}

}
