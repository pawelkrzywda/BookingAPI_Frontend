package com.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class OpinionDto {
    private Long id;
    private String description;
    private double rating;
    private Long patientId;
    private Long doctorId;
}