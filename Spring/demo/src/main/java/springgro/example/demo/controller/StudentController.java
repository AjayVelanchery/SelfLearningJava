package springgro.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import springgro.example.demo.Entity.Student;
import springgro.example.demo.service.StudentService;

import java.util.List;

@RestController
public class StudentController {


    @Autowired
private StudentService studentService;

@PostMapping("/addStudent")
public Student postDetails(@RequestBody Student student){
    return studentService.saveDetails(student);

}
@GetMapping("/customfetch")
public List<Student> fetchController()
    {
return studentService.fetchAll();
    }


    @GetMapping("/customName")
    public Student fetchName()
    {
        return studentService.fetchUsingName();
    }


    @GetMapping("/customMark/{mark}")
    public Student fetchMark(@PathVariable int mark)
    {
        return studentService.fetchUsingMark(mark);
    }




}
