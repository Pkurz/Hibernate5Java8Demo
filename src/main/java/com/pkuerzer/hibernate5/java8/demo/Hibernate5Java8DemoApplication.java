package com.pkuerzer.hibernate5.java8.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pkuerzer.hibernate5.java8.demo.domain.Person;
import com.pkuerzer.hibernate5.java8.demo.repository.PersonRepository;

@SpringBootApplication
public class Hibernate5Java8DemoApplication implements CommandLineRunner{
	
	@Autowired
	PersonRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(Hibernate5Java8DemoApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		Person p = repo.findOne(1);
		System.out.println("Last grading date: " + p.getLastGradingDate());
	}
}
