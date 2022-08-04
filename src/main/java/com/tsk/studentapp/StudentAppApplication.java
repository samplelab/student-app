package com.tsk.studentapp;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.tsk.studentapp.dao.StudentRepository;
import com.tsk.studentapp.model.Student;

@SpringBootApplication
public class StudentAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentAppApplication.class, args);
	}
	@Bean
	CommandLineRunner init(StudentRepository studentRepository) {
		return args->{
			Stream.of("satish","alok","ashok","shreepad","vikas","venkat").forEach(name->
			{
				Student student = new Student(name,name.toLowerCase()+"@gmail.com");
				studentRepository.save(student);
			});
			studentRepository.findAll().forEach(System.out::println);
		};
		
	}

}
