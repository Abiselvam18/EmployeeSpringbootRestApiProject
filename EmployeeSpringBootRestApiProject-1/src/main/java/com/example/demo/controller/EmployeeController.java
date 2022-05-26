package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;

	//inserting record
	@PostMapping("/employee/")
	public Employee employeesave(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}

	//retrieving record
	@GetMapping("/employee/")
	public List<Employee> fetchDepartmetList(){
		return employeeService.fetchemployeeList();
	}

	//delete
	@DeleteMapping("/employee/{id}")
	public String deleteEmployeeById(@PathVariable("id") Integer eid) {
		employeeService.deleteEmployeeById(eid);
		return "employee is deleted";	
	}

	//update
	@PutMapping("/employee/{id}")  
	public Employee updateEmployee(@PathVariable ("id") Integer eid, @RequestBody Employee employee) {	  
		return employeeService.updateEmployee(eid, employee);
	}

	//get record by id
	@GetMapping("/employee/{id}")
	public Employee fetchEmployeeById(@PathVariable("id") Integer eid) {
		return employeeService.fetchEmployeeById(eid);
	}

	//get record by name
	@GetMapping("/employee/name/{name}")
	public Employee fetchEmployeeByName(@PathVariable("name") String ename) {
		return employeeService.fetchEmployeeByName(ename);
	}
	//get record by age
	@GetMapping("/employee/age/{age}")
	public Employee fetchEmployeeByAge(@PathVariable("age") int eage) {
		return employeeService.fetchEmployeeByAge(eage);
	}

	//get record by mobile number
	@GetMapping("/employee/mobile/{mobile}")
	public Employee fetchEmployeeByMobile(@PathVariable("mobile") String emob) {
		return employeeService.fetchEmployeeByMobile(emob);
	}
	//get record by salary
	@GetMapping("/employee/salary/{salary}")
	public Employee fetchEmployeeBySalary(@PathVariable("salary") double esal) {
		return employeeService.fetchEmployeeBySalary(esal);
	}

}
