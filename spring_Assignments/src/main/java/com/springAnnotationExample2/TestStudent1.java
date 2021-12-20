package com.springAnnotationExample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent1 {
	 
   public static void main(String[] args) 
   {
	ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");
    Student1 studentA =(Student1) context.getBean("studentA");
    System.out.println("Name : " + studentA.getName() );
    System.out.println("Age : " + studentA.getAge() );
   }
}
