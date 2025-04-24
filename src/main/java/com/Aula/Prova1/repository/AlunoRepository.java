package com.Aula.Prova1.repository;

import com.Aula.Prova1.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
}
