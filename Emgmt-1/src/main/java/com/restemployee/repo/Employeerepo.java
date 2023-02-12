package com.restemployee.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.restemployee.entities.Employee;

public interface Employeerepo extends JpaRepository<Employee, Long> {

}
