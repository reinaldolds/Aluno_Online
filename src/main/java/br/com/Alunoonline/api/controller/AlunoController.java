package br.com.Alunoonline.api.controller;


import br.com.Alunoonline.api.model.Aluno;
import br.com.Alunoonline.api.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    AlunoService alunoService;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void criarAluno(@RequestBody Aluno aluno){

        alunoService.criarAluno(aluno);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Aluno> listarTodosAlunos(){
       return alunoService.listarTodosAlunos();
    }

}
