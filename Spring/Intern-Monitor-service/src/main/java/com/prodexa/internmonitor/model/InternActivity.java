package com.prodexa.internmonitor.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.data.relational.core.mapping.Column;

import java.time.Instant;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table("intern_activity")
public class InternActivity {

    @Id
    private Long id;

    @Column("intern_id")
    private String internId;

    @Column("timestamp")
    private Instant timestamp;

    @Column("cpu_usage")
    private Double cpuUsage;

    @Column("memory_usage")
    private Double memoryUsage;

    @Column("network_in_kb")
    private Double networkInKb;

    @Column("network_out_kb")
    private Double networkOutKb;
}
