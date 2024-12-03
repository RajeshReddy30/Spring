package com.xworkz.Spring.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Spring.configuration.SpringConfiguration;

public class SpringRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SpringConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());
		String instances[]= context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instances));
	}
}
