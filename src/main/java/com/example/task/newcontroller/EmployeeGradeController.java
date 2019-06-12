package com.example.task.newcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.task.model.EmployeeModel;
import com.example.task.model.GradeModel;
import com.example.task.service.EmployeeService;
import com.example.task.service.GradeService;

@Controller
@RequestMapping("main")
public class EmployeeGradeController {
	@Autowired
	private EmployeeService employeeService;
	@Autowired
	private GradeService gradeService;
	@GetMapping("/employeelist")
	public ResponseEntity<List<EmployeeModel>> getAllEmployee(){
		List<EmployeeModel> list = employeeService.getAllEmployee();
		return new ResponseEntity<List<EmployeeModel>>(list, HttpStatus.OK);
	}
	@PostMapping("/addemployee")
	public ResponseEntity<Void> addEmployee(@RequestBody EmployeeModel model){
		boolean flag = employeeService.addEmployee(model);
		if(flag == false){
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	@GetMapping("/gradelist")
	public ResponseEntity<List<GradeModel>> getAllGrades(){
		List<GradeModel> list = gradeService.getAllGrades();
		return new ResponseEntity<List<GradeModel>>(list, HttpStatus.OK);
	}
	@PostMapping("/addgrade")
	public ResponseEntity<Void> addGrade(@RequestBody GradeModel model){
		boolean flag = gradeService.addGrade(model);
		if(flag==false){
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
}
