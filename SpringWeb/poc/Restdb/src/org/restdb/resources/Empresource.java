package org.restdb.resources;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.restdb.dao.EmpDao;
import org.restdb.dao.impl.EmpDaoImpl;
import org.restdb.domain.Employee;
import org.restdb.dto.Application;
import org.restdb.service.EmployeeService;
import org.restdb.service.impl.EmployeeServiceImpl;

@Path("/empdetails")

public class Empresource {
	@POST
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String sayPlainTextHello(@FormParam("firstName") String firstName,
		      @FormParam("lastName") String lastName,
		      @FormParam("salary") int salary,
		      @Context HttpServletResponse servletResponse) {
	
		Logger.getLogger("Restdblogger").debug("Start Message");
		EmpDao eDaoImpl = new EmpDaoImpl();
		EmployeeService empSer  = new EmployeeServiceImpl(eDaoImpl);
		Logger.getLogger("Restdblogger").debug("Intermediate Message");
		Employee e = new Employee();
		e.setFirstName(firstName);
		e.setLastName(lastName);
		e.setSalary(salary);
		int id = empSer.save(e);
		System.out.println("Int: " +id);
	    return "EmpId :" + id;
	}

}
