package com.example.lazy;

import com.example.lazy.Service.DepartmentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements CommandLineRunner {

    private final DepartmentService service;

    public AppRunner(DepartmentService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {  System.out.println("=== N+1 Problem Example ===");
        service.nPlusOneProbelemExample();

        System.out.println("\n=== JOIN FETCH Solution ===");
        service.joinFetchExample();
        System.out.println("\n=== @BatchSize Solution ===");
        service.batchSizeExample();
    }
}
