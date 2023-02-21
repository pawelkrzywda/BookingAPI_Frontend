package com.booking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDate;

@Data
@AllArgsConstructor
public class HolidayDto {

    private Long id;
    private LocalDate date;
}