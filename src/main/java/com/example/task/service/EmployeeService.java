package com.example.task.service;

import java.util.List;

import com.example.task.model.EmployeeModel;

public interface EmployeeService{
	List<EmployeeModel> getAllEmployee();
	EmployeeModel getEmployeeById(int id);
	boolean addEmployee(EmployeeModel employee);

}
