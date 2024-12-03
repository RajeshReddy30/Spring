package com.xworkz.task.runner;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.configuration.TaskConfiguration;

public class TaskRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(TaskConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());
//		String instance[]=context.getBeanDefinitionNames();
//		System.out.println(Arrays.toString(instance));
		Object result=context.getBean("getArraylist");
		System.out.println(result);
	}

}
