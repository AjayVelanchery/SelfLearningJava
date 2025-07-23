package com.rest.restapi.controllers;


import com.rest.restapi.dto.EmployeeDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
//    @GetMapping( "/employees/{id}")
//    public EmployeeDTO getEmployees(@PathVariable("id") long employeeid){
//        return ;
//    }

@GetMapping("/employees")
    public String getData(@PathParam("SortBy")String sortBy){
        return "hello"+sortBy;
}
}
