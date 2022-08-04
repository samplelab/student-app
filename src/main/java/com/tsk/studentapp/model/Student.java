package com.tsk.studentapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private  String name;
    private  String email;
    
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
    
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + "]";
	}
}
