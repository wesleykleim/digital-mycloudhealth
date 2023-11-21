package com.example.digitalmycloudhealth.repositories;

import com.example.digitalmycloudhealth.models.HospitalModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HospitalRepository extends JpaRepository<HospitalModel, Integer> {
    // Métodos de consulta personalizados, se necessário
}
