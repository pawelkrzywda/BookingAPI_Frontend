package com.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class VisitDto {
    private Long id;
    private LocalDate date;
    private LocalTime time;
    private Long patientId;
    private Long doctorId;
}