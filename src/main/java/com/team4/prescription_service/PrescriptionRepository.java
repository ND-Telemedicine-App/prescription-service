package com.team4.prescription_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long>{



    Prescription findPrescriptionById(Long id);


    List<Prescription> findPrescriptionByPatientId(Long patientId);

    List<Prescription> findPrescriptionByDoctorId(Long patientId);

    Prescription findByMedicineName(String medicineName);




}
