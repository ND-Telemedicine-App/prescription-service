package com.team4.prescription_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrescriptionRepository extends JpaRepository<Prescription, Long>{

    Prescription findPrescriptionById(Long id);


    List<Prescription> findPrescriptionByPatientId(Long patientId);

    List<Prescription> findPrescriptionByDoctorId(Long doctorId);

    List<Prescription> findByMedicineName(String medicineName);

}
