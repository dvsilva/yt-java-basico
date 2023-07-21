package br.com.dvsilva.aula23;

import br.com.dvsilva.aula23.modelo.Aluno;
import br.com.dvsilva.aula23.servico.AlunoService;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Programa23 {

    public static void main(String[] args) {
        List<Aluno> alunos = AlunoService.alunos;

        // 1- trazer nomes dos alunos
        List<String> nomes = alunos.stream()
                .map(Aluno::getNome)
                .toList();
//                .collect(Collectors.toList());

        alunos.stream()
                .map(Aluno::getNome)
                .forEach(System.out::println);

        System.out.println("========================");

        // 2 - trazer nomes dos alunos em maiusculo
        alunos.stream()
                .map(Aluno::getNome)
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("========================");

        // 3 - trazer alunos com nomes que contenham a letra a
        alunos.stream()
                .filter(aluno -> aluno.getNome().toLowerCase().contains("a"))
                .forEach(System.out::println);

        System.out.println("========================");

        // 4 - trazer alunos que comecem com a letra J
        alunos.stream()
                .filter(aluno -> aluno.getNome().toLowerCase().startsWith("j"))
                .forEach(System.out::println);

        System.out.println("========================");

        // 5 - trazer alunos ativos
        alunos.stream()
                .filter(Aluno::isAtivo)
                .forEach(System.out::println);

        System.out.println("========================");

        // 6 - trazer alunos inativos
        alunos.stream()
                .filter(Aluno::isInativo)
                .forEach(System.out::println);

        System.out.println("========================");

        // 7 - trazer alunos homens
        alunos.stream()
                .filter(aluno -> aluno.getSexo() == 'M')
                .forEach(System.out::println);

        System.out.println("========================");

        // 8 - trazer alunos mulheres
        alunos.stream()
                .filter(aluno -> aluno.getSexo() == 'F')
                .forEach(System.out::println);

        System.out.println("========================");

        // 9 - trazer alunos aprovados - notas maiores que 7
        alunos.stream()
                .filter(aluno -> aluno.getNota() >= 7)
                .forEach(System.out::println);

        System.out.println("========================");

        // 10 - trazer alunos reprovados - notas menores que 7
        alunos.stream()
                .filter(aluno -> aluno.getNota() < 7)
                .forEach(System.out::println);

        System.out.println("========================");

        // 11 - trazer nomes 3 primeiros alunos com as notas maiores
        alunos.stream()
//                .sorted((a1, a2) -> a1.getNota().compareTo(a2.getNota()))
                .sorted(Comparator.comparing(Aluno::getNota).reversed())
                .limit(3)
                .forEach(System.out::println);

        System.out.println("========================");

        // 12 - trazer alunos com mais de 50 anos
        alunos.stream()
                .filter(aluno -> aluno.getIdade() > 50)
                .forEach(System.out::println);

        System.out.println("========================");

        // 13 - trazer alunos com menos de 18 anos
        alunos.stream()
                .filter(aluno -> aluno.getIdade() < 18)
                .forEach(System.out::println);

        System.out.println("========================");

        // 14 - trazer soma da idade da turma
        int somaIdade = alunos.stream()
                .map(Aluno::getIdade)
                .reduce(0, Integer::sum);
        System.out.println(somaIdade);

        System.out.println("========================");

        // 14 - trazer média de notas da turma
        double mediaNotas = alunos.stream()
                .mapToDouble(Aluno::getNota)
                .average()
                .orElse(0);
        System.out.println(mediaNotas);

        System.out.println("========================");

        // 15 - agrupar alunos por sexo
        Map<Character, List<Aluno>> alunosPorSexo = alunos.stream().collect(Collectors.groupingBy(Aluno::getSexo));

        for (Map.Entry<Character, List<Aluno>> entry : alunosPorSexo.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        System.out.println("========================");
    }

}
