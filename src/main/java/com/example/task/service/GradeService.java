package com.example.task.service;

import java.util.List;

import com.example.task.model.GradeModel;

public interface GradeService {
	List<GradeModel> getAllGrades();
	GradeModel getGradeById(int id);
	boolean addGrade(GradeModel gradeModel);
}
