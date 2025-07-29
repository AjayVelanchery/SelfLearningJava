package com.demo.Studentdemo.Service;

import com.demo.Studentdemo.Model.Student;
import com.demo.Studentdemo.repository.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> showAll() {
        return studentRepository.findAll();
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public Student update(Long id, Student updatedStudent) {
        return studentRepository.findById(id)
                .map(existingStudent -> {
                    existingStudent.setName(updatedStudent.getName());
//                    existingStudent.setEmail(updatedStudent.getEmail());
                    // Set other fields here as needed
                    return studentRepository.save(existingStudent);
                })
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
    }

    public void delete(Long id) {
        Student student = studentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + id));
        studentRepository.delete(student);
    }
}
