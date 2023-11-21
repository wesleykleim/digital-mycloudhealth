package com.example.digitalmycloudhealth.repositories;

import com.example.digitalmycloudhealth.models.EnderecoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnderecoRepository extends JpaRepository<EnderecoModel, Integer> {
    List<EnderecoModel> findByCidade(String cidade);
    // Adicione outros métodos de consulta personalizados, se necessário
}
