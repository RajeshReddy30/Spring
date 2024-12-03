package com.xworkz.task.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.configuration.PaperDto;

public class PaperRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(PaperDto.class);
		Object result=context.getBean(PaperDto.class);
		System.out.println(result);
	}

}
