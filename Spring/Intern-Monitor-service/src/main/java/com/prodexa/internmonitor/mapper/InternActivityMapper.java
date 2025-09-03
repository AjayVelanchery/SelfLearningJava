package com.prodexa.internmonitor.mapper;

import com.prodexa.internmonitor.dto.InternActivityDTO;
import com.prodexa.internmonitor.model.InternActivity;
import org.springframework.stereotype.Component;

@Component
public class InternActivityMapper {

    // Convert DTO to Entity
    public InternActivity toEntity(InternActivityDTO dto) {
        if (dto == null) return null;

        InternActivity entity = new InternActivity();
        entity.setId(dto.getId());
        entity.setInternId(dto.getInternId());
        entity.setCpuUsage(dto.getCpuUsage());
        entity.setMemoryUsage(dto.getMemoryUsage());
        entity.setNetworkInKb(dto.getNetworkInKb());
        entity.setNetworkOutKb(dto.getNetworkOutKb());
        entity.setTimestamp(dto.getTimestamp());

        return entity;
    }

    // Convert Entity to DTO
    public InternActivityDTO toDto(InternActivity entity) {
        if (entity == null) return null;

        InternActivityDTO dto = new InternActivityDTO();
        dto.setId(entity.getId());
        dto.setInternId(entity.getInternId());
        dto.setCpuUsage(entity.getCpuUsage());
        dto.setMemoryUsage(entity.getMemoryUsage());
        dto.setNetworkInKb(entity.getNetworkInKb());
        dto.setNetworkOutKb(entity.getNetworkOutKb());
        dto.setTimestamp(entity.getTimestamp());

        return dto;
    }
}
