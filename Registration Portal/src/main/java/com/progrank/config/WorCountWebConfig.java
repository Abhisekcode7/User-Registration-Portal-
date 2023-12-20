package com.progrank.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;


public class WorCountWebConfig {//implements WebApplicationInitializer {

//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		// TODO Auto-generated method stub
//		
//		
//		AnnotationConfigWebApplicationContext wac = new AnnotationConfigWebApplicationContext();
//		wac.register(SpringApplicationConfig.class);
//XmlWebApplicationContext webAC = new XmlWebApplicationContext();.
	
//		webAC.setConfigLocation("classpath:appconfig.xml");.

//		DispatcherServlet ds = new DispatcherServlet(wac);
	
//		ServletRegistration.Dynamic servlet = servletContext.addServlet("MYDS", ds);
//		servlet.setLoadOnStartup(1);
//		servlet.addMapping("/wordcount.com/*");
//
//	}

}
