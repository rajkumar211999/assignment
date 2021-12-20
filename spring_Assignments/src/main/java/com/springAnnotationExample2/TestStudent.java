package com.springAnnotationExample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {


public static void main(String[] args) {

    @SuppressWarnings("resource")
	ApplicationContext context = new ClassPathXmlApplicationContext("annotation.xml");

    Student student = (Student)context.getBean("student");

    if(student.getAddress()==null){
     System.out.println("The Employee Name : " + student.getName());
     System.out.println("The Employee Age : " + student.getAge());
     System.out.println("The Employee Address : " + "is not provided");
    }
    else{
     System.out.println("The Employee Name : " + student.getName());
     System.out.println("The Employee Age : " + student.getAge());
     System.out.println("The Employee Address : " +   
    		 student.getAddress().getStreet() + " " +
    		 student.getAddress().getCity() + " " +
    		 student.getAddress().getState());
}
}}
