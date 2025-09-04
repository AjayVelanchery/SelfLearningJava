package com.rest.restapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;


@Data
@AllArgsConstructor
public class EmployeeDTO {

    private Long id;
    private String name;

    private LocalDate dateofJoining;
    private boolean isActive;


}
