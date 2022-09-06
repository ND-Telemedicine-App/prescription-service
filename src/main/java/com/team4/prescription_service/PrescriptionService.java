package com.team4.prescription_service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescriptionService {

    private final PrescriptionRepository prescriptionRepository;

    public PrescriptionService(PrescriptionRepository prescriptionRepository) {
        this.prescriptionRepository = prescriptionRepository;
    }

    public Prescription findById(Long id) {
        return prescriptionRepository.findPrescriptionById(id);
    }

    public List<Prescription> findByPatientId(Long patientId) {
        return prescriptionRepository.findPrescriptionByPatientId(patientId);
    }

    public List<Prescription> findByDoctorId(Long doctorId) {
        return prescriptionRepository.findPrescriptionByDoctorId(doctorId);
    }

    public List<Prescription> findByMedicineName(String medicineName) {
        return prescriptionRepository.findByMedicineName(medicineName);
    }

    public Prescription create(Prescription newPrescription){
        return prescriptionRepository.save(newPrescription);
    }


}
