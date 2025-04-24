package com.Aula.Prova1.controller;

import com.Aula.Prova1.model.Curso;
import com.Aula.Prova1.service.CursoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoController {

    private final CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> listar() {
        return cursoService.listarCursos();
    }

    @PostMapping
    public Curso salvar(@RequestBody Curso curso) {
        return cursoService.salvarCurso(curso);
    }

    @GetMapping("/{id}")
    public Curso buscar(@PathVariable Long id) {
        return cursoService.buscarCurso(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        cursoService.deletarCurso(id);
    }
}
