package com.team4.prescription_service;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Date;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class PrescriptionServiceApplicationTests {
    @Autowired
    private PrescriptionService prescriptionService;

    @BeforeAll
    void init(){
        Date date = new Date(System.currentTimeMillis());
        Prescription prescription1 = new Prescription(1L, 1L, 2L, "Panadol", "1 per day", "For headache", "3", date);
        Prescription prescription2 = new Prescription(2L, 2L, 3L, "Asprin", "2 per day", "For Fever", "4", date);
        Prescription prescription3 = new Prescription(3L, 2L, 4L, "Asprin", "2 per day", "For Fever", "5",date);
        prescriptionService.create(prescription1);
        prescriptionService.create(prescription2);
        prescriptionService.create(prescription3);
    }

    @Test
//    should return the prescription with the input ID
    void viewPrescription() {
        Prescription expectedPrescription = prescriptionService.findById(1L);
        assertEquals(1L, expectedPrescription.getPatientId());
        assertEquals(2L, expectedPrescription.getDoctorId());
        assertEquals("Panadol", expectedPrescription.getMedicineName());
        assertEquals("1 per day", expectedPrescription.getPrescriptionDosage());
        assertEquals("For headache", expectedPrescription.getPrescriptionDispense());
        assertEquals("3", expectedPrescription.getPrescriptionRefill());
    }

    @Test
//    should return all prescriptions with the input patientId
    void viewPrescriptionOfPatient() {
        List<Prescription> prescriptions = prescriptionService.findByPatientId(2L);
        assertThat(prescriptions.size()).isEqualTo(2);
    }

    @Test
//    should return all prescriptions with the input doctorId
    void viewDoctorPrescribedPrescription() {
        List<Prescription> prescriptions = prescriptionService.findByDoctorId(3L);
        assertThat(prescriptions.size()).isEqualTo(1);
    }

    @Test
//    should return all prescriptions with the input medicine name
    void findByMedicineName(){
        List<Prescription> prescriptions = prescriptionService.findByMedicineName("Asprin");
        assertThat(prescriptions.size()).isEqualTo(2);
    }

    @Test
//   After call the create function, the new prescription object should be in the database
    void createPrescription() {
        prescriptionService.create(new Prescription(4L, 4L, 5L, "Systane", "2 per day", "For Fever", "5",new Date(System.currentTimeMillis())));
        assertNotNull(prescriptionService.findById(4L));
    }

}
