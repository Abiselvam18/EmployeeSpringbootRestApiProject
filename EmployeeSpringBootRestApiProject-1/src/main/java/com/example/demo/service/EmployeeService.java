package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;

public interface EmployeeService {

	//insert
	Employee saveEmployee(Employee employee);

	//get record
	List<Employee> fetchemployeeList();

	//delete
	void deleteEmployeeById(Integer eid);

	//update
	Employee updateEmployee(Integer eid, Employee employee);

	//get by id
	Employee fetchEmployeeById(Integer eid);

	//get by name
	Employee fetchEmployeeByName(String ename);
	
	//get by age
	Employee fetchEmployeeByAge(int eage);

	//get by mobile number
	Employee fetchEmployeeByMobile(String emob);

	//get by salary
	Employee fetchEmployeeBySalary(double esal);

	
}
