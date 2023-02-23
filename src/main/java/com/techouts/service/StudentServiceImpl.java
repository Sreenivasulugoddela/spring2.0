package com.techouts.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.techouts.entity.Student;
import com.techouts.repository.StudentRepo;

@Service
public class StudentServiceImpl implements StudentService
{

	private StudentRepo studentRepo;
	
	 public StudentServiceImpl(StudentRepo studentRepo) {
      
		 this.studentRepo=studentRepo;
	}
	
	 
	@Override
	public List<Student> findAll() {
		return studentRepo.findAll();
	}

	@Override
	public Optional<Student> findById(Integer theId) {
	
		return studentRepo.findById(theId);
	}

	@Override
	public void save(Student student) {

		 studentRepo.save(student);
	}

	@Override
	public void deleteById(int theid) 
	{
	   studentRepo.deleteById(theid);	
	}

}
