package com.natso.project1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Project1Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Project1Application.class, args);
		
		Alien obj = context.getBean(Alien.class);
		
		obj.code();
	}

}
