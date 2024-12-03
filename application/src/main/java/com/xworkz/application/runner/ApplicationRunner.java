package com.xworkz.application.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ApplicationRunner {
public static void main(String[] args) {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext();
	System.out.println(context.getBeanDefinitionCount());
	}
}
