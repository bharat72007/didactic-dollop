package com.ecommerce.utils;

import java.io.File;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

public class LogInitialization implements ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
		
		ServletContext servletContext = arg0.getServletContext();
		String Log4jPropsLocation = servletContext.getInitParameter("Log4jPropertiesLocation");
		if(Log4jPropsLocation == null){
			
			System.out.println("Properties not defined");
			BasicConfigurator.configure();
		}
		else{
			String rootPath = servletContext.getRealPath("/");
			
			File log4jFile = new File(rootPath + Log4jPropsLocation);
			if(log4jFile.exists()){
				System.out.println("Log4j File Exists");
				PropertyConfigurator.configure(rootPath + Log4jPropsLocation);
			}
			else{
				System.out.println("Error in reading File");
				BasicConfigurator.configure();
			}
		}
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
