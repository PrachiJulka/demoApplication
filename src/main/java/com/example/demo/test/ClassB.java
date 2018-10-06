package com.example.demo.test;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ClassB extends ClassA {

	
	private String regular_employee;
	private int empno;
	@Override
	public String toString() {
		return "ClassB [regular_employee=" + regular_employee + ", empno=" + empno + "]";
	}
	
	
}
