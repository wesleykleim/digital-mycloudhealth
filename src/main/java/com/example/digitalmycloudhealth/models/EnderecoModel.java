package com.example.digitalmycloudhealth.models;

import jakarta.persistence.*;

import lombok.Data;

@Entity
@Table(name = "ENDERECO") // Adicione esta anotação se desejar especificar o nome da tabela
@Data
public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String logradouro;

    private String numero;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

    // Outros métodos, se necessário
}


