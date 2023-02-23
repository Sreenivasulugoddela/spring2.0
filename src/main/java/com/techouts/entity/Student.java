package com.techouts.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
  
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int rollNum;
	
	private String name;
	
	private  String age;
	
	private String schoolName;
    
	public Student()
	{
		
	}
		
	public Student(int rollNum, String name, String age, String schoolName) {
		super();
		this.rollNum = rollNum;
		this.name = name;
		this.age = age;
		this.schoolName = schoolName;
	}


	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}


	@Override
	public String toString() {
		return "Student [rollNum=" + rollNum + ", name=" + name + ", age=" + age + ", schoolName=" + schoolName + "]";
	}
	
}
