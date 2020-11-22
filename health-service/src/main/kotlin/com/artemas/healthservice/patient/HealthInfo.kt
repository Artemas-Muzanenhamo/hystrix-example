package com.artemas.healthservice.patient

data class HealthInfo(
        val patient: Patient,
        val condition: Condition
)

data class Patient(
        val id: Long,
        val name: String,
        val surname: String,
)
