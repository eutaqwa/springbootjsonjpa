package com.example.task.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.model.EmployeeModel;
import com.example.task.repository.EmployeeRepository;
import com.example.task.service.EmployeeService;
@Service
public class EmployeeServiceImp implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeModel> getAllEmployee() {
		List<EmployeeModel> list = new ArrayList<>();
		employeeRepository.findAll().forEach(e->list.add(e));
		return list;
	}

	@Override
	public EmployeeModel getEmployeeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addEmployee(EmployeeModel employee) {
		employeeRepository.save(employee);
		return true;
	}
}
