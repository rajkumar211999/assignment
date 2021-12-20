package com.springBeanFactory;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beanfactory.xml");
		
		Person man = context.getBean("personBean", Person.class);
		
		System.out.println("My Name Is " + man.getName());
		
		/*Closing the context Object*/
		context.close();
		
	}

}
