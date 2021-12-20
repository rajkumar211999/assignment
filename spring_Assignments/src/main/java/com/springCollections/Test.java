package com.springCollections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("collection.xml");
		Question qsn=(Question) context.getBean("question");
		qsn.displayQsn();
	}

}