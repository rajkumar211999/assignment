package com.springBeanLifeCycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("lifecycle.xml");
		context.registerShutdownHook();
		
		Example example = (Example) context.getBean("example");
		System.out.println(example);	
	}

}
