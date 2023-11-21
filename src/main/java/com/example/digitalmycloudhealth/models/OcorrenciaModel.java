package com.example.digitalmycloudhealth.models;


import jakarta.persistence.*;
import java.time.LocalDate;
import lombok.Data;

@Data
@Entity
@Table(name = "OCORRENCIA")
public class OcorrenciaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDate data;

    private String localHospitalar;

    private String nomeMedico;

    private String receita;

    private String laudoExame;

    private String encaminhamento;

    private String descricaoAtendimento;

    private String crm;

    // Outros métodos, se necessário
}
