package com.prodexa.internmonitor.repository;

import com.prodexa.internmonitor.model.InternActivity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.data.r2dbc.repository.Query;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InternActivityRepository extends R2dbcRepository<InternActivity, Long> {

    // Fetch all activities for an intern, latest first
    @Query("SELECT * FROM intern_activity WHERE intern_id = :internId ORDER BY timestamp DESC")
    Flux<InternActivity> findAllByInternId(String internId);

    // Fetch the latest activity for an intern
    @Query("SELECT * FROM intern_activity WHERE intern_id = :internId ORDER BY timestamp DESC LIMIT 1")
    Mono<InternActivity> findLatestByInternId(String internId);
}
