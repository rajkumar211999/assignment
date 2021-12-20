package com.springAnnotationExample2;

import javax.inject.Inject;

public class Student 
{
  private String name;
  private int age;
  
  @Inject 
  private Address address;
 
  public String getName() {
	return name;
  }
  public void setName(String name) {
	this.name = name;
  }
  public int getAge() {
	return age;
  } 
  public void setAge(int age) {
	this.age = age;
  }
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
 
}
