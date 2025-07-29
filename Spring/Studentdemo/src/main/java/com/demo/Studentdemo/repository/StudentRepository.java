package com.demo.Studentdemo.repository;

import com.demo.Studentdemo.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student,Long> {
}
