package br.com.Alunoonline.api.service;


import br.com.Alunoonline.api.enums.MatriculaStatusEnum;
import br.com.Alunoonline.api.model.MatriculaAluno;
import br.com.Alunoonline.api.repository.MatriculaAlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class MatriculaAlunoService {

    @Autowired
    MatriculaAlunoRepository matriculaAlunoRepository;

    public void criarMatriculaAluno(MatriculaAluno matriculaAluno){

        matriculaAluno.setStatus(MatriculaStatusEnum.MATRICULADO);
        matriculaAlunoRepository.save(matriculaAluno);
    }

    public void trancarMatricula(Long matriculaAlunoId){
        MatriculaAluno matriculaAluno = matriculaAlunoRepository.findById(matriculaAlunoId)
                .orElseThrow(() ->
                        new ResponseStatusException(HttpStatus.NO_CONTENT,
                                "Matricula Aluno não encontrado."));
        if(!MatriculaStatusEnum.MATRICULADO.equals(matriculaAluno.getStatus())){

            throw new ResponseStatusException(HttpStatus.BAD_REQUEST,
                    "Só é possível trancar uma matricula com o status MATRICULADO");

        }

        matriculaAluno.setStatus(MatriculaStatusEnum.TRANCADO);

        matriculaAlunoRepository.save(matriculaAluno);
    }
}
