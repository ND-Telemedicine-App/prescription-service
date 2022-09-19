package com.team4.prescription_service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PrescriptionControllerTest {
    @Autowired
    private PrescriptionRepository prescriptionRepository;

    @Test
    void viewPrescription() {
        Prescription prescription = new Prescription(1L, 1L, 2L, "Panadol", "1 per day", "For headache", 3);
        prescriptionRepository.save(prescription);
        Prescription expectedPrescription = prescriptionRepository.findPrescriptionById(1L);
        assertEquals(1L, expectedPrescription.getPatientId());
        assertEquals(2L, expectedPrescription.getDoctorId());
        assertEquals("Panadol", expectedPrescription.getMedicineName());
        assertEquals("1 per day", expectedPrescription.getPrescriptionDosage());
        assertEquals("For headache", expectedPrescription.getPrescriptionDispense());
        assertEquals(3, expectedPrescription.getPrescriptionRefill());
    }

    @Test
    void viewPrescriptionOfPatient() {
        Prescription prescription1 = new Prescription(1L, 1L, 2L, "Panadol", "1 per day", "For headache", 3);
        Prescription prescription2 = new Prescription(2L, 1L, 3L, "Asprin", "2 per day", "For Fever", 4);
        prescriptionRepository.save(prescription1);
        prescriptionRepository.save(prescription2);
        List<Prescription> prescriptions = prescriptionRepository.findPrescriptionByPatientId(1L);
        assertThat(prescriptions.size()).isEqualTo(2);
    }

    @Test
    void viewDoctorPrescribedPrescription() {
        Prescription prescription1 = new Prescription(1L, 1L, 3L, "Panadol", "1 per day", "For headache", 3);
        Prescription prescription2 = new Prescription(2L, 2L, 3L, "Asprin", "2 per day", "For Fever", 4);
        Prescription prescription3 = new Prescription(3L, 2L, 3L, "Asprin", "2 per day", "For Fever", 4);
        prescriptionRepository.save(prescription1);
        prescriptionRepository.save(prescription2);
        prescriptionRepository.save(prescription3);
        List<Prescription> prescriptions = prescriptionRepository.findPrescriptionByDoctorId(3L);
        assertThat(prescriptions.size()).isEqualTo(3);
    }

    @Test
    void createPrescription() {
        Prescription prescription = new Prescription(1L, 1L, 2L, "Panadol", "1 per day", "For headache", 3);
        prescriptionRepository.save(prescription);
        assertNotNull(prescriptionRepository.findById(1L).get());
    }
}