package com.tsk.studentapp.dao;

import org.springframework.data.repository.CrudRepository;

import com.tsk.studentapp.model.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{}
