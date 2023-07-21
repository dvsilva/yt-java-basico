package br.com.dvsilva.aula23.servico;

import br.com.dvsilva.aula23.modelo.Aluno;

import java.util.Arrays;
import java.util.List;

public class AlunoService {

    public static final List<Aluno> alunos = Arrays.asList(
            new Aluno("João", 8.5, 'M', 46, true),
            new Aluno("Maria", 9.0, 'F', 21, true),
            new Aluno("Joaquim", 7.0, 'M', 16, true),
            new Aluno("José", 5.0, 'M', 19, false),
            new Aluno("Marcia", 7.0, 'F', 37, true),
            new Aluno("Ana", 8.0, 'F', 68, false),
            new Aluno("Roberto", 3.0, 'M', 25, true)
    );

}
