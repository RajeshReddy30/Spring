package com.xworkz.december.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class DecemberConfiguration {
	public DecemberConfiguration() {
		System.out.println("DecemberConfiguration constructor");
	}

}
