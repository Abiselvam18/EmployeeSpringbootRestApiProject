package com.example.demo.service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepo; 

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<Employee> fetchemployeeList() {
		return employeeRepo.findAll();
	}

	@Override
	public void deleteEmployeeById(Integer eid) {
		employeeRepo.deleteById(eid);
	}

	@SuppressWarnings("unlikely-arg-type")
	@Override
	public Employee updateEmployee(Integer eid, Employee employee) {
		Optional<Employee> employee1= employeeRepo.findById(eid);
		Employee empDB=null;
		if(employee1.isPresent()) {
			empDB=	employeeRepo.findById(eid).get();
			if(Objects.nonNull(employee.getEmpname()) && !"".equalsIgnoreCase(employee.getEmpname())) {
				empDB.setEmpname(employee.getEmpname());

			}
			if(Objects.nonNull(employee.getEmpage()) && !"".equals(employee.getEmpage())) {
				empDB.setEmpage(employee.getEmpage());
				System.out.println(employee.getEmpage());
			}
			if(Objects.nonNull(employee.getEmpmobile()) && !"".equalsIgnoreCase(employee.getEmpmobile())) {
				empDB.setEmpmobile(employee.getEmpmobile());
				System.out.println(employee.getEmpmobile());
			}
			if(Objects.nonNull(employee.getEmpsalary()) && !"".equals(employee.getEmpsalary())) {
				empDB.setEmpsalary(employee.getEmpsalary());
				System.out.println(employee.getEmpsalary());
			}

		}
		return employeeRepo.save(empDB);
	}

	@Override
	public Employee fetchEmployeeById(Integer eid) {
		return employeeRepo.findById(eid).get();
	}

	@Override
	public Employee fetchEmployeeByName(String ename) {
		return employeeRepo.findByEmpname(ename);
	}
	
	@Override
	public Employee fetchEmployeeByAge(int eage) {
		return employeeRepo.findByEmpage(eage);
	}

	@Override
	public Employee fetchEmployeeByMobile(String emob) {
		return  employeeRepo.findByEmpmobile(emob);
	}

	@Override
	public Employee fetchEmployeeBySalary(double esal) {
		return employeeRepo.findByEmpsalary(esal);
	}		
	
}
