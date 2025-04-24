package com.Aula.Prova1.service;

import com.Aula.Prova1.model.Aluno;
import com.Aula.Prova1.model.Curso;
import com.Aula.Prova1.repository.AlunoRepository;
import com.Aula.Prova1.repository.CursoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;
    private final CursoRepository cursoRepository;

    public AlunoService(AlunoRepository alunoRepository, CursoRepository cursoRepository) {
        this.alunoRepository = alunoRepository;
        this.cursoRepository = cursoRepository;
    }

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
        if (aluno.getCurso() != null && aluno.getCurso().getId() != null) {
            Curso cursoCompleto = cursoRepository.findById(aluno.getCurso().getId()).orElse(null);
            aluno.setCurso(cursoCompleto);
        }
        return alunoRepository.save(aluno);
    }

    public void deletarAluno(Long id) {
        alunoRepository.deleteById(id);
    }

    public Aluno buscarAluno(Long id) {
        return alunoRepository.findById(id).orElse(null);
    }
}
