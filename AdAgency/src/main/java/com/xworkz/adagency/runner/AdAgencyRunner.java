package com.xworkz.adagency.runner;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.adagency.configuration.AdAgencyConfiguration;


public class AdAgencyRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AdAgencyConfiguration.class);
		System.out.println(context.getBeanDefinitionCount());
		String instances[]= context.getBeanDefinitionNames();
		System.out.println(Arrays.toString(instances));
	}
}


