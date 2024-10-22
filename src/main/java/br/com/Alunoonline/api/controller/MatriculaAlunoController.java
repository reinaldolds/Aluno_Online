package br.com.Alunoonline.api.controller;

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
}
