package com.xworkz.task.runner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.task.configuration.ChairDto;
import com.xworkz.task.configuration.PowerbankDto;

public class PowerBankRunner {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(PowerbankDto .class);
		Object result=context.getBean(PowerbankDto .class);
		System.out.println(result);
	}

}
