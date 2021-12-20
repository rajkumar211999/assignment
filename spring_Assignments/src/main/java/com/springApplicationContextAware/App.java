package com.springApplicationContextAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args)
    {
		@SuppressWarnings("resource")
		ApplicationContext context=new  ClassPathXmlApplicationContext("bean.xml");
        ApplicationClass n = (ApplicationClass) context.getBean("noob");
        n.walk();
        
        Build a = (Build) context.getBean("pro");
        a.Slow();
	}

}
