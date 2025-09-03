package com.prodexa.internmonitor.controller;

import com.prodexa.internmonitor.Service.InternActivityService;
import com.prodexa.internmonitor.dto.InternActivityDTO;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/monitoring/heartbeats")
@RequiredArgsConstructor
public class InternActivityController {

    private final InternActivityService service;

    @PostMapping
    public Mono<InternActivityDTO> save(@Valid @RequestBody InternActivityDTO dto) {
        System.out.println(">>> Received DTO: " + dto);return service.saveActivity(dto);
    }

    @GetMapping("/latest/{internId}")
    public Mono<InternActivityDTO> latest(@PathVariable String internId) {
        return service.getLatest(internId);
    }

    @GetMapping("/{internId}")
    public Flux<InternActivityDTO> history(@PathVariable String internId) {
        return service.getHistory(internId);
    }
}
