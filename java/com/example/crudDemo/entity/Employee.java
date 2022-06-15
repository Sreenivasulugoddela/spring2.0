package com.example.crudDemo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int empId;
    
    private String fistName;
    
    private String lastName;
    

	private String email;
    
    public Employee()
    {
    	
    }
    
    public Employee(int empId, String fistName, String lastName, String email) {
		super();
		this.empId = empId;
		this.fistName = fistName;
		this.lastName = lastName;
		this.email = email;
	}
    
    public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFistName() {
		return fistName;
	}

	public void setFistName(String fistName) {
		this.fistName = fistName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fistName=" + fistName + ", lastName=" + lastName + ", email=" + email
				+ "]";
	}

		
}
