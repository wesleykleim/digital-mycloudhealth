package com.example.digitalmycloudhealth.models;

import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name = "PROFISSIONAL")
public class ProfissionalModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String cpf;

    private String crm;

    private String nome;

    private String sobrenome;

    private String especialidade;

    private String email;

    // Outros métodos, se necessário
}
