package com.learn.streams;

public class Employee {
int id;
String name;
int age;
String active;
String department;
int yearOfJoining;
double salary;
public Employee(int id, String name, int age, String active, String department, int yearOfJoining, double salary) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.active = active;
	this.department = department;
	this.yearOfJoining = yearOfJoining;
	this.salary = salary;
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getActive() {
	return active;
}
public void setActive(String active) {
	this.active = active;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public int getYearOfJoining() {
	return yearOfJoining;
}
public void setYearOfJoining(int yearOfJoining) {
	this.yearOfJoining = yearOfJoining;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", active=" + active + ", department="
			+ department + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary + "]";
}




}
