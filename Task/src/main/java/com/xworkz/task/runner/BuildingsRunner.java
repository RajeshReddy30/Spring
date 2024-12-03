package com.xworkz.task.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.configuration.BuildingDto;


public class BuildingsRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(BuildingDto.class);
		Object result=context.getBean(BuildingDto.class);
		System.out.println(result);
	}


}
