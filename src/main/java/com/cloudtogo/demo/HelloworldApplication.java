package com.cloudtogo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class HelloworldApplication {



	@RequestMapping("")
	public String helloWorld() {
		return "helloworld";
	}

	public static void main(String[] args) {
		SpringApplication.run(HelloworldApplication.class, args);
	}
}
