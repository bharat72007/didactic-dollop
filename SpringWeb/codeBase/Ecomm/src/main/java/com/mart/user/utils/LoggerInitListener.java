package com.mart.user.utils;
/*
 * This class initializes the log4j component
 * @Authot BharatJ
 */

import java.io.File;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.PropertyConfigurator;

public class LoggerInitListener implements ServletContextListener{
	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		ServletContext servletContext = arg0.getServletContext();
		String Log4jPropsLocation = servletContext.getInitParameter("Log4jPropertiesLocation");
		
		if(Log4jPropsLocation == null) {
			System.err.println("Log4j Properties not defined");
			BasicConfigurator.configure();
		} else {
			String rootPath = servletContext.getRealPath("/");
			
			File log4jFile = new File(rootPath + Log4jPropsLocation);
			if(log4jFile.exists())
				PropertyConfigurator.configure(rootPath + Log4jPropsLocation);
			else
			{
				System.out.println("Error in reading log4j properties File");
				BasicConfigurator.configure();
			}
		}

		/*// Initialize Application Templates
		AppTemplates.configure(servletContext);*/
	}
}
