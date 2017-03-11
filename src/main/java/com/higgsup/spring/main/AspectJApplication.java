package com.higgsup.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.higgsup.spring")
@EnableAutoConfiguration
public class AspectJApplication {

	public static void main(String[] args) {
		SpringApplication.run(AspectJApplication.class, args);
	}

}
