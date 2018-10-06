package com.example.demo.test;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ClassC extends ClassA {
	private String contractEmployee;
	private int emp_no;
	@Override
	public String toString() {
		return "ClassC [contractEmployee=" + contractEmployee + ", emp_no=" + emp_no + "]";
	}
	
	
	

}
