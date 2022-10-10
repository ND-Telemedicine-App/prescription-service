**RMIT SEPT 2021 Major Project Team 4**

**Members:**
-Doan Yen Nhi (s3880599)
-Nguyen Hoang Linh (s3880313)
-Jack Dean (s3722961)
-Matthew Rigo (s3840775)
-Mingkai Wang (s3773115)

**Records**
Github repository : https://github.com/ND-Telemedicine-App
jira Board : https://septteam4.atlassian.net/jira/software/projects/SEPTT4S/boards/3/roadmap?shared=&atlOrigin=eyJpIjoiMzI5YzNmOWIzODBhNDY1NThhYjAyODczM2NmM2EzNTYiLCJwIjoiaiJ9
Google Docs : https://drive.google.com/xxxx

**Code documentation - Release 0.1.0 - date**
- Prescription Class
- Prescription Controller:
  > Prescription View API (All Prescriptions, Prescriptions by Id, Prescriptions by Doctor Id)
  > Prescription Create API
- Prescription Service:
  > findById method
  > findByPatientId method
  > findByDoctorId method
  > findByMedicineName method
  > create method
- Prescription Repository:
  > findPrescriptionById
  > findPrescriptionByPatientId
  > findPrescriptionByDoctorId
  > findByMedicineName

To run the application locally :

1. Setup localhost in MySql Workbench
2. Create new shcema nd-telemedicine-app
3. run "PrescriptionServiceApplication" located: src/main/java/com/team4/prescription_service