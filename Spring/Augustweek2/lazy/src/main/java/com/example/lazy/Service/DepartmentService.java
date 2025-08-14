package com.example.lazy.Service;


import com.example.lazy.Entities.Department;
import com.example.lazy.Repositories.DepartementRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {


    private final DepartementRepository departementRepository;


    public DepartmentService(DepartementRepository departementRepository)
    {

        this.departementRepository=departementRepository;
    }



    @Transactional
    public void nPlusOneProbelemExample(){

        long start=System.nanoTime();

        List<Department> departments = departementRepository.findAll();

        for (Department dept : departments) {
            System.out.println("Department: " + dept.getName());
            // Lazy collection access triggers N queries
            dept.getEmployees().forEach(emp -> System.out.println("  - " + emp.getName()));
        }

        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start)/1_000_000 + " ms");
    }
    @Transactional
    public void joinFetchExample() {
        long start = System.nanoTime();

        // Custom repository query with JOIN FETCH
        List<Department> departments = departementRepository.findAllWithEmployees();

        for (Department dept : departments) {
            System.out.println("Department: " + dept.getName());
            // Employees are already loaded; no extra queries
            dept.getEmployees().forEach(emp -> System.out.println("  - " + emp.getName()));
        }

        long end = System.nanoTime();
        System.out.println("Time taken: " + (end - start) / 1_000_000 + " ms");
    }

    @Transactional
    public void batchSizeExample() {
        long start = System.nanoTime();

        List<Department> departments = departementRepository.findAll(); // lazy fetch

        for (Department dept : departments) {
            System.out.println("Department: " + dept.getName());
            dept.getEmployees().forEach(emp -> System.out.println("  - " + emp.getName()));
        }

        long end = System.nanoTime();
        System.out.println("Time taken (BatchSize): " + (end - start) / 1_000_000 + " ms");
    }

}
