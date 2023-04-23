package com.example.employeeservice.controller;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {
    private final EmployeeRepository employeeRepository;

    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @PostMapping
    public Employee add(@RequestBody Employee employee) {
        log.info("Employee add: {}", employee);
        return employeeRepository.add(employee);
    }

    @GetMapping
    public List<Employee> findAll() {
        log.info("Employee find:");
        return employeeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Employee findById(@PathVariable Long id) {
        log.info("Employee find: id={}", id);
        return employeeRepository.findById(id);
    }

    @GetMapping("/departments/{departmentId}")
    public List<Employee> findByDepartmentId(@PathVariable Long departmentId) {
        log.info("Employee find: departmentId={}", departmentId);
        return employeeRepository.findByDepartmentId(departmentId);
    }
}
