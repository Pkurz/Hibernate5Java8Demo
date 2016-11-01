package com.pkuerzer.hibernate5.java8.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.pkuerzer.hibernate5.java8.demo.domain.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

}
