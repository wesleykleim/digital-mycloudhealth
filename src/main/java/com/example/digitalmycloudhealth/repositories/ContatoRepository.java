package com.example.digitalmycloudhealth.repositories;

import com.example.digitalmycloudhealth.models.ContatoModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ContatoRepository extends JpaRepository<ContatoModel, Integer> {
    List<ContatoModel> findByTelefone(String telefone);
    // Adicione outros métodos de consulta personalizados, se necessário
}
