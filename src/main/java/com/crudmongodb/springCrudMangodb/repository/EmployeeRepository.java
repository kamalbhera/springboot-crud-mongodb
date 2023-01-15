package com.crudmongodb.springCrudMangodb.repository;

import com.crudmongodb.springCrudMangodb.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, Long> {
}
