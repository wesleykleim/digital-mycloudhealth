package com.example.digitalmycloudhealth.models;

import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDate;

@Data
@Entity
@Table(name = "USUARIO")
public class UsuarioModel {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String email;

    private String nome;

    private String sobrenome;

    private String  senha;

    private String cpf;

    @Column(columnDefinition = "DATE")
    private LocalDate dataNascimento;

    private Double peso;

    private Double altura;

    private String sexo;

}
