package br.com.Alunoonline.api.controller;

import br.com.Alunoonline.api.dtos.AtualizarNotasRequest;
import br.com.Alunoonline.api.model.MatriculaAluno;
import br.com.Alunoonline.api.service.MatriculaAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/matriculas-alunos")
public class MatriculaAlunoController {

    @Autowired
    MatriculaAlunoService matriculaAlunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarMatriculaAluno(@RequestBody MatriculaAluno matriculaAluno){
        matriculaAlunoService.criarMatriculaAluno(matriculaAluno);
    }

<<<<<<< HEAD
    @PatchMapping("/{id}")
=======
    @PatchMapping("/trancar/{id}")
>>>>>>> main_reinaldo
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void trancarMatricula(@PathVariable Long id){
        matriculaAlunoService.trancarMatricula(id);
    }
<<<<<<< HEAD
=======

    @PatchMapping("/atualizar-notas/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void atualizarNotas(@RequestBody AtualizarNotasRequest atualizarNotasRequest
    , @PathVariable Long id){
        matriculaAlunoService.atualizarNotas(id, atualizarNotasRequest);
    }

>>>>>>> main_reinaldo
}
