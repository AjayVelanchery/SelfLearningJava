package com.example.demo.dto;

import lombok.Data;

@Data
public class UserLocationDTO {


    private long userId;
    private String email;
    private String Place;
    private double longitude;
    private double latitude;
}
