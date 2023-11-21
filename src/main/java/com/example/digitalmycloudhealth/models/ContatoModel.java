package com.example.digitalmycloudhealth.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "CONTATO")
public class ContatoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private  String telefone;

    private String celular;

}
