package com.springcoreAssignments;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class Test 
{
    public static void main( String[] args )
    {
    	@SuppressWarnings("resource")
		ApplicationContext context=new  ClassPathXmlApplicationContext("spring.xml");
        Customer customer = (Customer) context.getBean("customer1");
        System.out.println(customer);
    }
}
