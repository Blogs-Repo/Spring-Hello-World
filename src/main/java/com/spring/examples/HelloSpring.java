package com.spring.examples;

public class HelloSpring {
	private String name;
	
	public void setName(String name){
		this.name = name;
	}
	
	public void greet(){
		System.out.println("Hello, " + name + "! Welcome to Spring!!");
	}
}