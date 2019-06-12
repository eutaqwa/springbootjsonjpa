package com.example.task.model;

import java.io.Serializable;
//import java.util.Set;

import javax.persistence.Entity;
//import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="grade")
public class GradeModel implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	
	private String name;
	private double salary;
	//@OneToMany(targetEntity=EmployeeModel.class, mappedBy = "id",orphanRemoval=false,fetch=FetchType.LAZY)
	//private EmployeeModel employees;
	
	public GradeModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GradeModel(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
}
