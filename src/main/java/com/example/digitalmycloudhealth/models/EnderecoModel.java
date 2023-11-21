package com.example.digitalmycloudhealth.models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private  String logradouro;

    private String numero;

    private String bairro;

    private String cidade;

    private String estado;

    private String cep;

}
