package com.artemas.healthservice.patient

import com.artemas.healthservice.patient.Condition.HEALTHY
import org.springframework.http.MediaType.APPLICATION_JSON_VALUE
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HealthInformationEndpoint {
    @GetMapping("/patients/{id}", produces = [APPLICATION_JSON_VALUE])
    fun patientHealthInformationByPatient(@PathVariable id: Long): HealthInfo {
        return HealthInfo(Patient(id, "artemas", "prime"), HEALTHY)
    }
}

