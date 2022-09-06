package com.team4.prescription_service;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long>{

    Prescription findPrescriptionById(Long id);


    List<Prescription> findPrescriptionByPatientId(Long patientId);

    List<Prescription> findPrescriptionByDoctorId(Long patientId);

    List<Prescription> findByMedicineName(String medicineName);

}
