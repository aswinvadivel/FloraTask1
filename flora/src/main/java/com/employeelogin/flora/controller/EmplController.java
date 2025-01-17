package com.employeelogin.flora.controller;

import com.employeelogin.flora.model.Employee;
import com.employeelogin.flora.service.EmplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class EmplController {
    @Autowired
    public EmplService service;

    @PostMapping("/employees")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee){

        System.out.println("the new employee:"+employee);
        service.saveEmployee(employee);
        return ResponseEntity.ok("Attendence added succesfully");

    }
    @GetMapping
    public List<Employee> getAllEmployee(){
        return service.getAllEmployees();


    }

}
