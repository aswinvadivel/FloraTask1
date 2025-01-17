package com.employeelogin.flora.service;

import com.employeelogin.flora.model.Employee;
import com.employeelogin.flora.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmplService {
    @Autowired
    public EmployeeRepository repository;



    public Employee saveEmployee(Employee employee){
        return repository.save(employee);
    }
    public List<Employee> getAllEmployees(){
        return repository.findAll();
    }
}
