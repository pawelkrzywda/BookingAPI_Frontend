package com.booking.service;

import com.booking.dto.DoctorDto;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;

public class DoctorService {
    private RestTemplate restTemplate;
    private DoctorDto doctorDto;
    private List<DoctorDto> doctors;
    private static DoctorService doctorService;
    private static final String DOCTOR_URL = "http://localhost:8081/v1/doctors/";

    private DoctorService(){
        restTemplate = new RestTemplate();
    }
    public static DoctorService getInstance(){
        return doctorService != null ? doctorService : new DoctorService();
    }

    public List<DoctorDto> getDoctors(){
        ResponseEntity<DoctorDto[]> response =
                restTemplate.exchange(DOCTOR_URL, HttpMethod.GET, null, DoctorDto[].class);
        this.doctors = Arrays.asList(response.getBody());
        return doctors;
    }

}