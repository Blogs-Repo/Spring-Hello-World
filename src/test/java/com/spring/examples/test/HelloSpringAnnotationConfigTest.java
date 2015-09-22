package com.spring.examples.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.example.config.ApplicationConfig;
import com.spring.examples.HelloSpring;

public class HelloSpringAnnotationConfigTest {
	private AnnotationConfigApplicationContext context;

	@Before
	public void setup() {
		context = new AnnotationConfigApplicationContext();
		context.register(ApplicationConfig.class);
		context.refresh();
	}

	@Test
	public void greetTest() {
		HelloSpring helloSpring = (HelloSpring) context.getBean("helloBean", HelloSpring.class);
		helloSpring.greet();
	}

	@After
	public void teardown() {
		context = null;
	}
}
