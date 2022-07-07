package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootAzureApplication {
	@RequestMapping(method=RequestMethod.GET,value="/message")
	public String message()
	{
		return"Deployment successfull!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootAzureApplication.class, args);
	}

}
