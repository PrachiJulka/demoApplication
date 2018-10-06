package com.example.demo.test;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean //Read-Only
public interface GenericRepo<EntityType extends ClassA>  extends CrudRepository<EntityType, Long>  {

	@Query("select e from #{#entityName} e") // #{#entityName} will be magically replaced by type arguments in children
    List<EntityType> findThemAll();
}
