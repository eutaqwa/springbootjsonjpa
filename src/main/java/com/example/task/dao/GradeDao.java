package com.example.task.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.task.model.GradeModel;

public interface GradeDao extends CrudRepository<GradeModel, Integer> {

}
