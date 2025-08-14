package com.example.lazy.Entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.BatchSize;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Department {

@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


private String name;

@OneToMany(mappedBy = "department",fetch = FetchType.LAZY)
@BatchSize(size = 5)
private List<Employee> employees=new ArrayList<>();
}
