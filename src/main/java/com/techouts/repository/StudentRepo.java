package com.techouts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techouts.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>
{

}
