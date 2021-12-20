package com.springBeanLifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example 
{
	private String marks;

	public String getMarks() {
		return marks;
	}

	public void setMarks(String marks) {
		this.marks = marks;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [marks=" + marks + "]";
	}
	
	@PostConstruct
	public void start()
	{
		System.out.println("Starting The Method");
	}
	
	@PreDestroy
	public void end()
	{
		System.out.println("Ending The Method");
	}
	

}
