package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Empid;
	private String Empname;
	private int Empage;
	private String Empmobile;
	private double Empsalary;
	
	public Employee() {
		super();
	}

	public Employee(int empid, String empname, int empage, String empmobile, double empsalary) {
		super();
		Empid = empid;
		Empname = empname;
		Empage = empage;
		Empmobile = empmobile;
		Empsalary = empsalary;
	}

	public int getEmpid() {
		return Empid;
	}

	public void setEmpid(int empid) {
		Empid = empid;
	}

	public String getEmpname() {
		return Empname;
	}

	public void setEmpname(String empname) {
		Empname = empname;
	}

	public int getEmpage() {
		return Empage;
	}

	public void setEmpage(int empage) {
		Empage = empage;
	}

	public String getEmpmobile() {
		return Empmobile;
	}

	public void setEmpmobile(String empmobile) {
		Empmobile = empmobile;
	}

	public double getEmpsalary() {
		return Empsalary;
	}

	public void setEmpsalary(double empsalary) {
		Empsalary = empsalary;
	}

	@Override
	public String toString() {
		return "Employee [Empid=" + Empid + ", Empname=" + Empname + ", Empage=" + Empage + ", Empmobile=" + Empmobile
				+ ", Empsalary=" + Empsalary + "]";
	}
	
}
