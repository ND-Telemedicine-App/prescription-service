package com.team4.prescription_service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class PrescriptionServiceApplication {
    PrescriptionRepository prescriptionRepository;

    public static void main(String[] args) {
        SpringApplication.run(PrescriptionServiceApplication.class, args);
    }

}
