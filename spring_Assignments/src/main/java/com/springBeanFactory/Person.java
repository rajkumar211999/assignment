package com.springBeanFactory;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Person implements DisposableBean, InitializingBean
{
	private String name;
	
	Person()
	{
		System.out.println("Constructor of Person Bean Have Been Invoked");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
    /*Bean Initialization Code*/
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		
	}

	/*Bean Destruction Code*/
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
	}
}
