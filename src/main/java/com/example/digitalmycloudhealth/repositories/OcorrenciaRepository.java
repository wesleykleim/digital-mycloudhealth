package com.example.digitalmycloudhealth.repositories;

import com.example.digitalmycloudhealth.models.OcorrenciaModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OcorrenciaRepository extends JpaRepository<OcorrenciaModel, Integer> {
    List<OcorrenciaModel> findByLocalHospitalar(String localHospitalar);
    // Adicione outros métodos de consulta personalizados, se necessário
}
