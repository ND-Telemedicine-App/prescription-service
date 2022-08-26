package com.team4.prescription_service;

import javax.persistence.*;

@Entity
@Table(name = "prescriptions")
public class PrescriptionCreate {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long prescription_id;

    //user's id is stored when making a prescription
    @Column(nullable = false, unique = true, length = 20)
    private Long id;

    //prescription
    @Column(nullable = false, length = 65)
    private String prescription;

    //dosage for how much the patient will take in medication
    @Column(nullable = false, length = 80)
    private String prescriptionDosage;

    //valid/approved prescription by doctor
    @Column(nullable = false)
    private Boolean prescriptionApproved ;

    //how many more refills are required on the tailored prescribed medicene
    @Column(nullable = false)
    private Integer prescriptionRefill ;

    //first name for doctor contact purposes if required
    @Column(nullable = false, length = 25)
    private String firstName;

    //last name for doctor contact purposes if required
    @Column(nullable = false, length = 25)
    private String lastName;

    //contact information for the doctor if required
    @Column(nullable = false, unique = true, length = 45)
    private String phone;

    //allergies on file for the doctor
    @Column
    private String allergies;

    //allergies on file for the doctor
    @Column
    private String diseases;


}
