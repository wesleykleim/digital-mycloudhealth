package com.example.digitalmycloudhealth.repositories;

import com.example.digitalmycloudhealth.models.UsuarioModel;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Integer> {

    Optional<UsuarioModel> findByEmail(String email);
}