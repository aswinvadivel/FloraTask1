package com.employeelogin.flora.repository;

import com.employeelogin.flora.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
