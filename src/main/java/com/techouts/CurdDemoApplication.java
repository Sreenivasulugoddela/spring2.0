package com.techouts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class CurdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurdDemoApplication.class, args);
		System.out.println("Hello");
	}
}
