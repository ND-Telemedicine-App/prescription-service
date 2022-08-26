package com.team4.prescription_service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PrescriptionCreate_Repository extends JpaRepository<PrescriptionCreate, Long>{


    @Query("SELECT p from PrescriptionCreate p where p.prescription_id = ?1")
    PrescriptionCreate findByPrescriptionId(int prescription_id);

    @Query("SELECT p from PrescriptionCreate p where p.id = ?1")
    PrescriptionCreate findByUserId(int userId);

    @Query("SELECT p from PrescriptionCreate p where p.prescription = ?1")
    PrescriptionCreate findByPrescriptionType(String prescription);

    @Query("SELECT p from PrescriptionCreate p where p.phone = ?1")
    PrescriptionCreate findByPhoneNumber(String phone);

    @Query("SELECT p from PrescriptionCreate p where p.firstName = ?1")
    PrescriptionCreate findByPatientName(String firstName);


}
