package com.example.task.serviceimp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.model.GradeModel;
import com.example.task.repository.GradeRepository;
import com.example.task.service.GradeService;
@Service
public class GradeServiceImp implements GradeService {
	@Autowired
	private GradeRepository gradeRepository;

	@Override
	public List<GradeModel> getAllGrades() {
		List<GradeModel> list = new ArrayList<>();
		gradeRepository.findAll().forEach(e->list.add(e));
		return list;
	}

	@Override
	public GradeModel getGradeById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean addGrade(GradeModel gradeModel) {
		gradeRepository.save(gradeModel);
		return true;
	}
}
