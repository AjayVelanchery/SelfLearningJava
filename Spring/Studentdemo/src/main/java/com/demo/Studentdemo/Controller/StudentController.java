package com.demo.Studentdemo.Controller;


import com.demo.Studentdemo.Model.Student;
import com.demo.Studentdemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
    StudentService studentService;


    @GetMapping("/student")

    public List<Student> getStudents(){
        return studentService.showAll();
    }

    @PostMapping("/students")

    public Student createStudent(@RequestBody Student student){
        return studentService.save(student);
    }

    @DeleteMapping("/students/{id}")
     public void deleteStudent(@PathVariable Long id){
        System.out.println(id);
        studentService.delete(id);

    }

    @PutMapping("/students/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student updatedStudent) {
        return studentService.update(id, updatedStudent);
    }
}
