package com.Aula.Prova1.repository;

import com.Aula.Prova1.model.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CursoRepository extends JpaRepository<Curso, Long> {
}
