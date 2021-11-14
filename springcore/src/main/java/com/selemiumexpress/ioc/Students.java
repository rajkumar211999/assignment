package com.selemiumexpress.ioc;

public class Students {
	
	private String studentName;
	
	
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public void displayStudentInfo()
	{
		System.out.println("Student name is : " +studentName);
	}

}
