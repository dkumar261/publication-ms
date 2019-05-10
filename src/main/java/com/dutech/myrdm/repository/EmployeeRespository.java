package com.dutech.myrdm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dutech.myrdm.domain.Employee;

public interface EmployeeRespository extends JpaRepository<Employee, Integer> {

}
