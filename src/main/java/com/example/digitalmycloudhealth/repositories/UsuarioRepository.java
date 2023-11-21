package com.example.digitalmycloudhealth.repositories;

import com.example.digitalmycloudhealth.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel,Long> {

//    Optional<UsuarioModel> findByEmail(String )
}
