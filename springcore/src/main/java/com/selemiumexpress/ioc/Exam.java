package com.selemiumexpress.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	
 public static <ApplicationContext> void main(String[] args) {
	 
	 ApplicationContext context =(ApplicationContext) new ClassPathXmlApplicationContext("config.xml");
	context).getbean("student");
	 
 }

}
