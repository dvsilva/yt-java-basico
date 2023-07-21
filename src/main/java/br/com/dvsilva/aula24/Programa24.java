package br.com.dvsilva.aula24;

import java.util.Optional;

public class Programa24 {

    public static void main(String[] args) {
        String nome = "joao";
        // apenas para valores nao nulos
//        Optional<String> nomeOp = Optional.of(nome);

        Optional<String> nomeOp = Optional.ofNullable(nome);
        System.out.println("isEmpty: " + nomeOp.isEmpty());
        System.out.println("isPresent: " + nomeOp.isPresent());

        System.out.println(
                nomeOp
                        .orElse("optional is empty")
                        .toLowerCase()
        );

        System.out.println("===================");

        Optional<String> nomeUpperCase = nomeOp.map(String::toUpperCase);
        System.out.println(nomeUpperCase.orElse("optional is empty"));

        Optional<Integer> nomeLenght = nomeOp.flatMap(nomeToLenght -> Optional.ofNullable(nomeToLenght.length()));
        System.out.println(nomeLenght.orElse(0));

        Optional<String> nomeFiltrado = nomeOp.filter(nomeToStart -> nomeToStart.startsWith("j"));
        System.out.println(nomeFiltrado.orElse("vazio"));

        System.out.println("===================");

        nomeOp.ifPresent(System.out::println);

        Optional<String> empty1 = Optional.empty();
        empty1.ifPresentOrElse(
                System.out::println,
                () -> System.out.println("valor vazio")
        );

        System.out.println("===================");

        Optional<String> nomeOptional = Optional.empty();
        String nomeOuCalculado = nomeOptional.orElseGet(() -> "Nome calculado");
        System.out.println(nomeOuCalculado);
//        nomeOptional.orElseThrow(() -> new IllegalArgumentException("nome inválido"));

        System.out.println("===================");

//        Optional<String> empty = Optional.ofNullable(null);
        Optional<String> empty = Optional.empty();

        System.out.println(
                empty
                        .orElse("optional is empty")
                        .toLowerCase()
        );
    }

}
