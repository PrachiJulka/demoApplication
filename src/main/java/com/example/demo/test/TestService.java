package com.example.demo.test;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

	@Autowired
	RepoB repoB;

	@Autowired
	RepoC repoC;

	@Transactional
	public void test() {

		Address address = new Address();
		address.setCity("DELHI");
		address.setCountry("India");
		address.getHometype().add(HomeTypeEnum.BUNGLOW);
		address.getHometype().add(HomeTypeEnum.FLAT);

		Address address1 = new Address();
		address1.setCity("DELHI");
		address1.setCountry("India");
		address1.getHometype().add(HomeTypeEnum.BUNGLOW);
//		address1.getHometype().add(HomeTypeEnum.FLAT);

		ClassB regular = new ClassB();
		regular.setCompany_name("Mealpha");
		regular.setSalary(123532);
		regular.setEmpno(0012);
		regular.setRegular_employee("ragghu");
		regular.setAddress(address);
		ClassC contract = new ClassC();
		contract.setCompany_name("maalpha");
		contract.setSalary(58698);
		contract.setContractEmployee("shaan");
		contract.setEmp_no(0011);
		contract.setAddress(address1);
		repoC.save(contract);
		repoB.save(regular);
//		repoC.save(contract);

	}
}
