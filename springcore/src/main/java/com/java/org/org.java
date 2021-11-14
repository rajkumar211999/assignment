package com.java.org;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
public class com.java.org {
	
	
	@Value("${classurl}")
	private String url;
	
	@Value("${classusername}")
	private String username;
	
	@Value("${classpassword}")
	private String pass;
	
	
	
public void Show()
{
	System.out.println("url ="+url+", Username= " +username+ " ,Passoword= "+pass);
	
}
	

}