package com.pkuerzer.hibernate5.java8.demo.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

@Entity
@Table(name="Person")
public class Person {
	
	@Id
	@Column
	private Integer id;

	@Column(name = "last_grading_date", nullable = true)
    @Type(type = "java.time.LocalDate")
    private LocalDate lastGradingDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getLastGradingDate() {
		return lastGradingDate;
	}

	public void setLastGradingDate(LocalDate lastGradingDate) {
		this.lastGradingDate = lastGradingDate;
	}
 
}
