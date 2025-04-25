package com.Aula.Prova1.model;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private int cargaHoraria;

    @OneToMany(mappedBy = "curso")
@JsonManagedReference
private List<Aluno> alunos;

}
