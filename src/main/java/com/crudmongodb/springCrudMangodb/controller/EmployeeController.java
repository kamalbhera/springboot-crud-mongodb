package com.crudmongodb.springCrudMangodb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
public class EmployeeController {

    @GetMapping("/employees")
    public String getAllEmployees() {
        return "Working";
    }

    @PostMapping("/employee")
    public static void createEmployee() {
        return;
    }
    @GetMapping("/employee/{id}")
    public static void getEmployee() {
        return;
    }

    public static void updateEmployee() {
        return;
    }

    public static void deleteEmployee() {
        return;
    }
}
