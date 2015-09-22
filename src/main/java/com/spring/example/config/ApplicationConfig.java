package com.spring.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring.examples.HelloSpring;

@Configuration
public class ApplicationConfig {
	
	@Bean(name="helloBean")
	public HelloSpring helloSpring(){
		HelloSpring helloSpring = new HelloSpring();
		helloSpring.setName("Neeraj");
		return helloSpring;
	}
}
