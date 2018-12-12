package com.madhav.project.SpringDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringDemoApplication extends SpringBootServletInitializer {

	public static void main(String... args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return super.configure(builder);
	}
}
