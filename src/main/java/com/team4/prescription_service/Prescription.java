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

    public String getPrescriptionDescription() {
        return prescriptionDescription;
    }

    public void setPrescriptionDescription(String prescriptionDescription) {
        this.prescriptionDescription = prescriptionDescription;
    }

    public Integer getPrescriptionRefill() {
        return prescriptionRefill;
    }

    public void setPrescriptionRefill(Integer prescriptionRefill) {
        this.prescriptionRefill = prescriptionRefill;
    }
}
