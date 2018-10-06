package com.example.demo.test;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.TableGenerator;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class ClassA {

	@TableGenerator(name = "VEHICLE_GEN", table = "ID_GEN", pkColumnName = "GEN_NAME", valueColumnName = "GEN_VAL", allocationSize = 1)
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "VEHICLE_GEN")
	int id;
	
	private  String company_name;
	
	@Embedded
	Address address;
	
	private long salary;

	@Override
	public String toString() {
		return "ClassA [id=" + id + ", company_name=" + company_name + ", salary=" + salary + "]";
	}
	
}
