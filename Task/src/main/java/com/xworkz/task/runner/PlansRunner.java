package com.xworkz.task.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.configuration.PlansDto;

public class PlansRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PlansDto.class);
		Object result = context.getBean(PlansDto.class);
		System.out.println(result);
	}

}
