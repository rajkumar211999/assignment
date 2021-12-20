package com.springAnnotationExample2;

import org.springframework.beans.factory.annotation.Required;

public class Student1 
{
	private String name;
	private double marks;
	
	@Required
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Required
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "Student1 [name=" + name + ", marks=" + marks + "]";
	}
	
	

}
