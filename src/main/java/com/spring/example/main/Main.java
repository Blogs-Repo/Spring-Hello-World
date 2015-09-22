package com.spring.example.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.spring.example.config.ApplicationConfig;
import com.spring.examples.HelloSpring;

public class Main {
	public static void main(String[] args){
		ApplicationContext classPathXmlcontext = new ClassPathXmlApplicationContext("spring-beans.xml");
		HelloSpring helloSpring1 = (HelloSpring) classPathXmlcontext.getBean("helloBean", HelloSpring.class);
		helloSpring1.greet();
		
		ApplicationContext fileSystemXmlcontext = new FileSystemXmlApplicationContext("D:\\Old_Machine\\Spring\\Spring-Hello-World\\src\\main\\resources\\spring-beans.xml");
		HelloSpring helloSpring2 = (HelloSpring) fileSystemXmlcontext.getBean("helloBean", HelloSpring.class);
		helloSpring2.greet();
		
		AnnotationConfigApplicationContext annotationConfigContext = new AnnotationConfigApplicationContext();
		annotationConfigContext.register(ApplicationConfig.class);
		annotationConfigContext.refresh();
		HelloSpring helloSpring3 = (HelloSpring) annotationConfigContext.getBean("helloBean", HelloSpring.class);
		helloSpring3.greet();
	}
}
