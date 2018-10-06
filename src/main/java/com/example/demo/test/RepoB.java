package com.example.demo.test;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoB extends  GenericRepo<ClassB>, CrudRepository<ClassB, Long> {

}
