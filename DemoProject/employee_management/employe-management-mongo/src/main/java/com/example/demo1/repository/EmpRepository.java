package com.example.demo1.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo1.entity.Employee;


@Repository
public interface EmpRepository extends MongoRepository<Employee, String>{

}
