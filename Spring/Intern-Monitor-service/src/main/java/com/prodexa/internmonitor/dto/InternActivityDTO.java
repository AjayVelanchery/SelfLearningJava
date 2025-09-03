package com.prodexa.internmonitor.dto;

import lombok.*;
import java.time.Instant;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InternActivityDTO {
    private Long id;            // ✅ Add this
    private String internId;
    private Double cpuUsage;
    private Double memoryUsage;
    private Double networkInKb;
    private Double networkOutKb;
    private Instant timestamp;
}
