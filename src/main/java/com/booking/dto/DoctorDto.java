package com.booking.dto;

import lombok.Data;

@Data
public class DoctorDto {
    private Long id;
    private String name;
    private String surname;
    private String specialization;
    private double rating;
}