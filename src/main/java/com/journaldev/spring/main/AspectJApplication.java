package com.journaldev.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@ComponentScan(basePackages = "com.journaldev.spring")
@EnableAutoConfiguration
public class AspectJApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectJApplication.class, args);
	}

}
