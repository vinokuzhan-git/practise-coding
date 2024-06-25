package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.serivice.NetworkService;

// @SpringBootApplication
public class DemoApplication {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		// NetworkService ns;
		// ns.serviceActivator();
		
		// ApplicationContext ac= ClassPathXMLApplicationContext
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean.xml");
		
		//NetworkService nwservice = context.getBean("nwservice",NetworkService.class);
		NetworkService nwservice = context.getBean(NetworkService.class);
		nwservice.serviceActivator();
		//SpringApplication.run(DemoApplication.class, args);
	}

}
