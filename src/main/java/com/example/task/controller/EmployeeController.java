package com.example.task.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.task.dao.EmployeeDao;
import com.example.task.dao.GradeDao;
import com.example.task.model.EmployeeModel;
import com.example.task.model.GradeModel;


@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private GradeDao gradeDao;
	@GetMapping("/list")
	public List<EmployeeModel> index(){
		return (List<EmployeeModel>) employeeDao.findAll();
	}
	@GetMapping("/grade")
	public List<GradeModel> grade(){
		return (List<GradeModel>) gradeDao.findAll(); 
	}
	@PostMapping("/list")
	public void addEmployee(@Valid@RequestBody EmployeeModel model){
		employeeDao.save(model);
	}
	@PostMapping("/grade")
	public void addGrade(@Valid@RequestBody GradeModel model){
		 gradeDao.save(model);
	}
}
