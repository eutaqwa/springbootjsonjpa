package com.example.task.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.task.model.EmployeeModel;

public interface EmployeeDao extends CrudRepository<EmployeeModel, Integer> {

}
