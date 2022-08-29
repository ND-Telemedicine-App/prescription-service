package com.team4.prescription_service;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class PrescriptionController {


    private final PrescriptionService prescriptionService;

    public PrescriptionController(PrescriptionService prescriptionService) {
        this.prescriptionService = prescriptionService;
    }


    @GetMapping(value = "/{patientId}")
    public List<Prescription> viewPrescriptionOfPatient(@PathVariable Long patientId){
        return prescriptionService.findByPatientId(patientId);
    }

    @PostMapping("/createPrescription")
    public Prescription createPrescription(@RequestBody Prescription newPrescription) {
        return prescriptionService.create(newPrescription);

    }

}
