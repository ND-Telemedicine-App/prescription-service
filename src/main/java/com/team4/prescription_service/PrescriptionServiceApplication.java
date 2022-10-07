package com.team4.prescription_service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Date;

@SpringBootApplication
public class PrescriptionServiceApplication implements CommandLineRunner {

    @Autowired
    PrescriptionRepository prescriptionRepo;

    public static void main(String[] args) {
        SpringApplication.run(PrescriptionServiceApplication.class, args);
    }

    public void run(String... args) throws Exception {
        Prescription prescription1 = new Prescription(1L, 4L, 2L, "Aspirin", "1 tablet after every meal", "60 tablets", "1", new Date(System.currentTimeMillis()));
        Prescription prescription2 = new Prescription(1L, 4L, 1L, "Paracetamol", "1 tablet per day", "1 bottle with 28 tablets", "2", new Date(System.currentTimeMillis()));

        prescriptionRepo.save(prescription1);
        prescriptionRepo.save(prescription2);
    }

}
