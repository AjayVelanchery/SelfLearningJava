package com.example.demo.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Locations")
public class Location {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String Place;
    private String description;
    private double longitude;
    private double latitude;
}
