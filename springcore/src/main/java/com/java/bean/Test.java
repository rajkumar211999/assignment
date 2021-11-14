package com.java.bean;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ConfigurableApplicationContext   context = new ClassPathXmlApplicationContext("com/java/bean/bean.xml");
		 
        Person myperson = context.getBean("personBean", Person.class);
 
        System.out.println("Name= " + myperson.getName());
 
        // Closing the context object.
        context.close();
    }
}