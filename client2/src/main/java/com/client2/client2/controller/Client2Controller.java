package com.client2.client2.controller;

import com.client2.client2.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Client2Controller {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/c2")
    public ResponseEntity<String> response(){
        String s= restTemplate.getForObject("http://localhost:1819/c1",String.class);
        return ResponseEntity.ok(s);
    }
    @GetMapping("/c2/employee")
    public ResponseEntity<Employee> employee(){
        Employee s= restTemplate.getForObject("http://localhost:1819/c1/employee",Employee.class);
        return ResponseEntity.ok(s);
    }
}
