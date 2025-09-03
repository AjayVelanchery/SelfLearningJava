package com.prodexa.internmonitor.Service;

import com.prodexa.internmonitor.dto.InternActivityDTO;
import com.prodexa.internmonitor.mapper.InternActivityMapper;
import com.prodexa.internmonitor.model.InternActivity;
import com.prodexa.internmonitor.repository.InternActivityRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Instant;

@Service
@RequiredArgsConstructor
public class InternActivityService {

    private final InternActivityRepository repo;
    private final InternActivityMapper mapper;

    public Mono<InternActivityDTO> saveActivity(InternActivityDTO dto) {
        InternActivity entity = mapper.toEntity(dto);
        System.out.println(">>> Mapped entity: " + entity);

        System.out.println(">>> Mapped entity details: "
                + entity.getInternId() + ", "
                + entity.getCpuUsage() + ", "
                + entity.getMemoryUsage());

        // Validate internId
        if (entity.getInternId() == null || entity.getInternId().isEmpty()) {
            return Mono.error(new IllegalArgumentException("internId cannot be null or empty"));
        }

        // Set timestamp if missing
        if (entity.getTimestamp() == null) {
            entity.setTimestamp(Instant.now());
        }

        System.out.println(">>> Saving entity: " + entity);

        return repo.save(entity).map(mapper::toDto);
    }

    public Mono<InternActivityDTO> getLatest(String internId) {
        return repo.findLatestByInternId(internId).map(mapper::toDto);
    }

    public Flux<InternActivityDTO> getHistory(String internId) {
        return repo.findAllByInternId(internId).map(mapper::toDto);
    }
}
