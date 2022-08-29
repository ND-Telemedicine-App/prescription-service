package com.team4.prescription_service;

import javax.persistence.*;

@Entity
@Table(name = "prescriptions")
public class Prescription {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //user's id is stored when making a prescription
    @Column(nullable = false, unique = true, length = 20)
    private Long patientId;

    //user's id is stored when making a prescription
    @Column(nullable = false, unique = true, length = 20)
    private Long doctorId;

    //prescription name
    @Column(nullable = false, length = 65)
    private String medicineName;

    //dosage for how much the patient will take in medication
    @Column(nullable = false, length = 80)
    private String prescriptionDosage;

    //prescription descriptioon
    @Column
    private String prescriptionDescription;

    //how many more refills are required on the tailored prescribed medicene
    @Column(nullable = false)
    private Integer prescriptionRefill ;


}
