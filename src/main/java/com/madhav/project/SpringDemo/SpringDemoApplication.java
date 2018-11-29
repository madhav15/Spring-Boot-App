package com.madhav.project.SpringDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner{

	public static void main(String... args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@Override
	public void run(String... str) throws Exception {
		System.out.println("#Debug:: Running Spring Boot Application...");
	}
}
