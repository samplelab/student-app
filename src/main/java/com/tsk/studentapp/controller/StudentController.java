package com.tsk.studentapp.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tsk.studentapp.dao.StudentRepository;
import com.tsk.studentapp.model.Student;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    
    private final StudentRepository studentRepository;

    public StudentController(StudentRepository studentRepository) {
		super();
		this.studentRepository = studentRepository;
	}

	@GetMapping("/students")
    public List<Student> getStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @PostMapping("/students")
    void addStudent(@RequestBody Student student) {
    	studentRepository.save(student);
    }
}
