package br.com.Alunoonline.api.controller;


import br.com.Alunoonline.api.model.Disciplina;
import br.com.Alunoonline.api.service.DisciplinaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/disciplinas")
public class DisciplinaController {

    @Autowired
    DisciplinaService disciplinaService;
jhgjhgjhg
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void criarDisciplina(@RequestBody Disciplina disciplina){
        disciplinaService.criarDisciplina(disciplina);
    }
}
