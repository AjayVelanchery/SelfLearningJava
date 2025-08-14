package com.example.lazy;

import com.example.lazy.Entities.Department;
import com.example.lazy.Entities.Employee;
import com.example.lazy.Repositories.DepartementRepository;
import com.example.lazy.Repositories.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
public class DataLoader implements CommandLineRunner {

    private final DepartementRepository departmentRepo;
    private final EmployeeRepository employeeRepo;

    public DataLoader(DepartementRepository departmentRepo, EmployeeRepository employeeRepo) {
        this.departmentRepo = departmentRepo;
        this.employeeRepo = employeeRepo;
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            Department dept = new Department();
            dept.setName("Department " + i);
            departmentRepo.save(dept);

            for (int j = 1; j <= 5; j++) {
                Employee emp = new Employee();
                emp.setName("Employee " + j + " of Dept " + i);
                emp.setDepartment(dept);
                employeeRepo.save(emp);
            }
        }
    }
}
