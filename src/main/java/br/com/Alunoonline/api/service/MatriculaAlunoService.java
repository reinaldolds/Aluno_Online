package br.com.Alunoonline.api.service;


import br.com.Alunoonline.api.model.MatriculaAluno;
import br.com.Alunoonline.api.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatriculaAlunoService {

    @Autowired
    MatriculaAlunoRepository matriculaAlunoRepository;

    public void criarMatriculaAluno(MatriculaAluno matriculaAluno){

//        matriculaAluno.setStatus(MatriculaAlunoStatus.)
        matriculaAlunoRepository.save(matriculaAluno);
    }
}
