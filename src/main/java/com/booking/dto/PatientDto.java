package com.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PatientDto {
    private Long id;
    private String name;
    private String surname;
    private Long pesel;
    private String phoneNumber;
}