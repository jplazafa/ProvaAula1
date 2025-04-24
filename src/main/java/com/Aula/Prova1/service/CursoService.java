package com.Aula.Prova1.service;

import com.Aula.Prova1.model.Curso;
import com.Aula.Prova1.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listarCursos() {
        return cursoRepository.findAll();
    }

    public Curso salvarCurso(Curso curso) {
        return cursoRepository.save(curso);
    }

    public void deletarCurso(Long id) {
        cursoRepository.deleteById(id);
    }

    public Curso buscarCurso(Long id) {
        return cursoRepository.findById(id).orElse(null);
    }
}
