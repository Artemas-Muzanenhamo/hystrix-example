package com.artemas.patientservice.patient

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class PatientEndpoint {
    @PostMapping("/patients/patient")
    fun retrievePatientInformation(patient: Patient) {
        return patientService.getPatientHealthInformation(patient)
    }
}
