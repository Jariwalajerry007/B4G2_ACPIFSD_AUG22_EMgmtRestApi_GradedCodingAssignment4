package com.restemployee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.restemployee.entities.Employee;

@Service
public interface EmployeeService {

	public List<Employee> getEmployee();

	public Employee addEmployee(Employee employee);

	public Employee updateEmployee(Employee employee);

	public void deleteEmployee(Long parseLong);

	Employee getEmployeeById(Long id);
}
