package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//get by name
	public Employee findByEmpname(String ename);
	
	//get by age
	public Employee findByEmpage(int eage);

	//get by mobile number
	public Employee findByEmpmobile(String emob);

	//get by salary
	public Employee findByEmpsalary(double esal);

}
