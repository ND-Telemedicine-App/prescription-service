package com.team4.prescription_service;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
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
        return  prescriptionService.create(newPrescription);

    }

}
