package com.natso.sbjdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.natso.sbjdbc.dao.AlienDAO;
import com.natso.sbjdbc.model.Alien;

@SpringBootApplication
public class SpringBootJdbcApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJdbcApplication.class, args);
		
		Alien alien1 = context.getBean(Alien.class);
		alien1.setId(103);
		alien1.setName("Mojo");
		alien1.setTech("JavaScript");
		
		AlienDAO repo = context.getBean(AlienDAO.class);
		repo.save(alien1);
		
		System.out.println(repo.findAll());
	}

}
