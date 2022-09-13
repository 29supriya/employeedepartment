package com.mindtree.employeedepartment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")

public class Employee {
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	@Column private String empName;
	@Column private double salary;
	@Column private int age;
	@Column private String gender;
	
	public Employee()
	{
		
	}
  public Employee(int empId, String empName,double salary, int age, String gender) {
	  super();
	  this.empId = empId;
	  this.empName = empName;
	  this.salary = salary;
	  this.age = age;
	  this.gender = gender;
  }
 
	 public String getEmpName() {
		 return empName;
	 }
	 public void SetEmName(String empName) {
		 this.empName =  empName;
	 }
	 public double getSalary() {
		 return salary;
	 }
	 public void SetSalary(double salary) {
		 this.salary =  salary;
	 }
	 public int getAge() {
		 return age;
	 }
	 public void SetAge(int age) {
		 this.age =  age;
	 }
	 public String getGender() {
		 return gender;
	 }
	 public void Setgender(String gender) {
		 this.gender =  gender;
	 }

		public int getEmpId() {
			return empId;
		}
	

}
