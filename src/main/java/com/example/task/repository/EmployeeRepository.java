package com.example.task.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.task.model.EmployeeModel;

public interface EmployeeRepository extends CrudRepository<EmployeeModel, Integer>{

}
