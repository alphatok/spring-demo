package com.alphatok.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class DemoApplication {

	@Transactional
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
