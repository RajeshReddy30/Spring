package com.xworkz.december.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
		System.out.println(context.getBeanDefinitionCount());
	}

}
