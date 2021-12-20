package com.springSpel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		ApplicationContext context = new  ClassPathXmlApplicationContext("spel.xml");
        Demo value = context.getBean("demo",Demo.class);
        
        System.out.println(value);
	}

}
