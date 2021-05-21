package com.cts;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		/*
		 * ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
		 * 
		 * Employee emp=ctx.getBean(Employee.class);
		 * 
		 * System.out.println(emp.getBank());
		 */
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfig.class);
		
		Employee emp=ctx.getBean(Employee.class);
		emp.setName("abc");
		
		System.out.println(emp.getName());
        System.out.println(emp.getBank()); 
         
	}
	
	

}
