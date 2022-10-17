**RMIT SEPT 2021 Major Project Team 4**

**Members:** 
- Doan Yen Nhi (s3880599)   
- Nguyen Hoang Linh (s3880313)
- Jack Dean (s3722961)
- Matthew Rigo (s3840775)
- Mingkai Wang (s3773115)

**Records**
- Github repository : https://github.com/ND-Telemedicine-App
- jira Board : https://septteam4.atlassian.net/jira/software/projects/SEPTT4S/boards/3/roadmap?shared=&atlOrigin=eyJpIjoiMzI5YzNmOWIzODBhNDY1NThhYjAyODczM2NmM2EzNTYiLCJwIjoiaiJ9

**Code documentation - Release 0.1.0 Major changes & Features - Date: 6/9/22**
- Prescription Class
  > Attributes
  > Getters and setters
  > To String method
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
- PrescriptionServiceApplicationTests:
  > Created various tests for the APIs

**Code documentation - Release 0.1.1 Major changes & Features - Date: 19/9/22**
- All classes:
  > Debug and code cleanup
  > Modify and implemented more comments on code
  > CI Build and test
- PrescriptionServiceApplicationTests:
  > Added comments for tests

To run this service locally on MySQL:

1. Setup localhost in MySql Workbench
2. Create new schema nd-telemedicine-app
3. Go to target/classes/application.properties and Edit "spring.datasource.password" field with your own MySql Password
4. Run "PrescriptionServiceApplication" located: src/main/java/com/team4/prescription_service
5. If done correctly you can refresh schemas and there should be a new table under nd-telemedicine-app
