package com.xworkz.task.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.configuration.CupDto;

public class CupsRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CupDto.class);
		Object result = context.getBean(CupDto.class);
		System.out.println(result);
	}

}
