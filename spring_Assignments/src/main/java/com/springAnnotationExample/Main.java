package com.springAnnotationExample;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app.properties")
@SpringBootConfiguration
public class Main
{
	public static void main(String[] args) 
	{
		
	}

}
