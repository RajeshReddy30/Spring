package com.xworkz.task.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.configuration.BuildingDto;
import com.xworkz.task.configuration.ChairDto;

public class ChairsRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ChairDto.class);
		Object result=context.getBean(ChairDto.class);
		System.out.println(result);
	}

}
