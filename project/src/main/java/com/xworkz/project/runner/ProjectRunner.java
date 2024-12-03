package com.xworkz.project.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import com.xworkz.project.configuration.ProjectConfiguration;

public class ProjectRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ProjectConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());
		String instances[]= context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instances));
	}
}


