package com.client1.client1.controller;

import com.client1.client1.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Client1Controller {
    @GetMapping("/c1")
    public ResponseEntity<String> response (){
        return ResponseEntity.ok("Client 1 Rest Call");
    }
    @GetMapping("/c1/employee")
    public ResponseEntity<Employee> employee (){
        Employee employee = new Employee();
        employee.setId(100L);
        employee.setName("Ankur");
        employee.setCompany("Techwish");
        employee.setPlace("Ranchi");
        return ResponseEntity.ok(employee);
    }
}
