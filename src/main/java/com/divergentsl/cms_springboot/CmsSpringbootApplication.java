package com.divergentsl.cms_springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CmsSpringbootApplication {

	public static void main(String[] args) {
	ConfigurableApplicationContext context = SpringApplication.run(CmsSpringbootApplication.class, args);
	System.out.println("in main");
	}

}
