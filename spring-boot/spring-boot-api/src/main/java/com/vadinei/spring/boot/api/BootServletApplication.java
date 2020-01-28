package com.vadinei.spring.boot.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.vadinei.spring.boot.api"})
public class BootServletApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BootServletApplication.class, args);	
	}
	
}
