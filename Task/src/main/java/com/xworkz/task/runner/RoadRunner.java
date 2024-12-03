package com.xworkz.task.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.configuration.RoadDto;



public class RoadRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(RoadDto.class);
		Object result=context.getBean(RoadDto.class);
		System.out.println(result);
	}

}
