package com.techouts.service;

import java.util.List;
import java.util.Optional;

import com.techouts.entity.Student;

public interface StudentService 
{
	   public List<Student> findAll();
	   
	   public Optional<Student> findById(Integer theId);
	   
	   public void save(Student student);
	   
	   public void deleteById(int theid);
}
