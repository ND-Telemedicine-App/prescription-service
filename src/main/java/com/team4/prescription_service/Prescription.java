package com.team4.prescription_service;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "prescriptions")
public class Prescription {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //user's id is stored when making a prescription
    @Column(nullable = false)
    private Long patientId;

    //user's id is stored when making a prescription
    @Column(nullable = false)
    private Long doctorId;

    //prescription name
    @Column(nullable = false)
    private String medicineName;

    // instructions on how much and when to take medicine
    @Column(nullable = false)
    private String prescriptionDosage;

    //prescription dispense amount
    @Column(nullable = false)
    private String prescriptionDispense;

    //how many more refills are required on the tailored prescribed medicine
    @Column(nullable = false)
    private Integer prescriptionRefill;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getPrescriptionDosage() {
        return prescriptionDosage;
    }

    public void setPrescriptionDosage(String prescriptionDosage) {
        this.prescriptionDosage = prescriptionDosage;
    }

    public String getPrescriptionDispense() {
        return prescriptionDispense;
    }

    public void setPrescriptionDispense(String prescriptionDescription) {
        this.prescriptionDispense = prescriptionDescription;
    }

    public Integer getPrescriptionRefill() {
        return prescriptionRefill;
    }

    public void setPrescriptionRefill(Integer prescriptionRefill) {
        this.prescriptionRefill = prescriptionRefill;
    }

    @Override
    public String toString() {
        return "Prescription{" +
                "id=" + id +
                ", patientId=" + patientId +
                ", doctorId=" + doctorId +
                ", medicineName='" + medicineName + '\'' +
                ", prescriptionDosage='" + prescriptionDosage + '\'' +
                ", prescriptionDescription='" + prescriptionDispense + '\'' +
                ", prescriptionRefill=" + prescriptionRefill +
                '}';
    }
}

