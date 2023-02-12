package com.restemployee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restemployee.entities.Employee;
import com.restemployee.exception.ResourceNotFoundException;
import com.restemployee.repo.Employeerepo;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private Employeerepo employeeRepo;

	public EmployeeServiceImpl(Employeerepo employeeRepo) {

		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public List<Employee> getEmployee() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {

		return employeeRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Employee", "Id", id));
	}

	@Override
	public Employee addEmployee(Employee employee) {

		employeeRepo.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		employeeRepo.save(employee);
		return employee;
	}

	@Override
	public void deleteEmployee(Long parseLong) {

		Employee entity = employeeRepo.getOne(parseLong);

		employeeRepo.delete(entity);
	}

}
