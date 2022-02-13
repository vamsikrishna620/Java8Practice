 package com.learn.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AnsForStreams2 {

public static void main(String[] vamsi) {
	
		List<Employee> empList= new ArrayList<>();
		createEmployeeList(	empList) ;
		
		//program to print Max/min Employee salary from the given collection
		Optional<Employee> highestEmployee = empList.stream().
		collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));
		System.out.println(highestEmployee);
		
		Optional<Employee> lowestEmployee = empList.stream().
				collect(Collectors.minBy(Comparator.comparingDouble(Employee::getSalary)));
				System.out.println(lowestEmployee);
		System.out.println("=======================================");
		
		//program to print the max salary of an employee from each department
		Map<String, Optional<Employee>> output = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.reducing((BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))))));
		output.forEach((key,value)-> System.out.println(key +":" + value));
		System.out.println("=======================================");
		//program to print active and inactive employees in the given collections
		 Map<String, Long> status = empList.stream().collect(Collectors.groupingBy(Employee::getActive,Collectors.counting()));
		status.forEach((key,value)-> System.out.println(key +":" + value));
		System.out.println("=======================================");
		
		//program to print employee details working in each department
		 Map<String, List<Employee>> departmentEmp = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment));
		 departmentEmp.forEach((key,value)->System.out.println(key +":" + value));
		System.out.println("=======================================");
		
		//program to print employee count details working in each department
		Map<String, Long> noOfEmp = empList.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		noOfEmp.forEach((key,value)->System.out.println(key +":" + value));
		System.out.println("=======================================");
		
		 Map<String, Long> hhh = empList.stream().filter(n->n.getAge()>=20).collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		hhh.forEach((key,value)->System.out.println(key + ":" + value));
		System.out.println("=======================================");
		
		Predicate<Employee> p = s->s.age<20 ;
		for(Employee e: empList) {
			if(p.test(e)) {
				System.out.println(e);
			}
		}

}
public static void createEmployeeList(	List<Employee> list) {
	list.add(new Employee(1, "vamsi", 27, "active", "java", 2021,900.0));
	list.add(new Employee(5, "aaa", 23, "active", "java", 2021,850.0));
	list.add(new Employee(2, "sruthi", 30, "active", "pyhton", 2020, 800.0));
	list.add(new Employee(6, "bbb", 30, "active", "pyhton", 2020, 850.0));
	list.add(new Employee(3, "karthi", 20, "NotActive", "Scala", 2025, 700.0));
	list.add(new Employee(7, "ccc", 19, "NotActive", "Scala", 2025, 650.0));
	list.add(new Employee(4, "abhi", 19, "NotActive", "cloud", 2026, 600.0));
	list.add(new Employee(8, "ddd", 19, "NotActive", "cloud", 2026, 750.0));
}
}
