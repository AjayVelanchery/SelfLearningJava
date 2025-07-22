package com.ajay.Responsebody;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller
{

    @PostMapping("/Get")
    public void getBody(@RequestBody Person ob)
    {
        // Print and display the person object
        System.out.println(ob);
    }
}