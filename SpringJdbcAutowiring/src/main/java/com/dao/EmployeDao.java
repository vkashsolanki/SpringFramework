package com.dao;

import java.util.List;

import com.entity.Employee;

public interface EmployeDao {
	
	public int insert(Employee employee);
	public int change(Employee employee);
	public int delete(int id);
	public Employee getEmployee(int id);
	public List<Employee> getAllEmployee();

}
