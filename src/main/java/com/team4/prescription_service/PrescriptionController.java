package com.team4.prescription_service;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PrescriptionController {
    private final PrescriptionService prescriptionService;

    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }

    @GetMapping(value = "/prescription/{id}")
    public Prescription viewPrescription(@PathVariable Long id){
        return prescriptionService.findById(id);
    }

    @GetMapping(value = "/prescription/patient/{patientId}")
    public List<Prescription> viewPrescriptionOfPatient(@PathVariable Long patientId){
        return prescriptionService.findByPatientId(patientId);
    }

    @GetMapping(value = "/prescription/doctor/{doctorId}")
    public List<Prescription> viewDoctorPrescribedPrescription(@PathVariable Long doctorId){
        return prescriptionService.findByDoctorId(doctorId);
    }

    @PostMapping("/createPrescription")
    public Prescription createPrescription(@RequestBody Prescription newPrescription) {
        return prescriptionService.create(newPrescription);
    }

}
