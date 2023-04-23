package com.example.employeeservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Long id;
    private Long departmentId;
    private String name;
    private Integer age;
    private String position;
}
