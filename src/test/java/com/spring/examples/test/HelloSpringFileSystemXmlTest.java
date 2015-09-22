package com.spring.examples.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.examples.HelloSpring;

public class HelloSpringFileSystemXmlTest {
	private ApplicationContext context;

	@Before
	public void setup() {
		context = new FileSystemXmlApplicationContext(
				"D:\\Old_Machine\\Spring\\Spring-Hello-World\\src\\main\\resources\\spring-beans.xml");
	}

	@Test
	public void greetTest() {
		HelloSpring helloSpring = (HelloSpring) context
				.getBean(HelloSpring.class);
		helloSpring.greet();
	}

	@After
	public void teardown() {
		context = null;
	}
}
