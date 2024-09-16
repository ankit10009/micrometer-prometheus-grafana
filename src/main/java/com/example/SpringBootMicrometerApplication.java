package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootMicrometerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMicrometerApplication.class, args);
	}

	@GetMapping("/message")
	public String getMessage(){
		return "Working..";
	}

}
