package com.carrerera.test;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AwsTestAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsTestAppApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String helloMessage() {
		return "Hello World";
	}
	@GetMapping("/today")
	public String todayDate() {
		return ""+ new Date();
	}

}
