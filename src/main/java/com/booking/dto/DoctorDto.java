package com.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class DoctorDto {
    private Long id;
    private String name;
    private String surname;
    private String specialization;
    private double rating;
}