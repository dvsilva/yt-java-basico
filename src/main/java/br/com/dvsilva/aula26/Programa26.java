package br.com.dvsilva.aula26;

import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collectors;

public class Programa26 {

    public static void main(String[] args) {
        String frase = "isto é uma frase";
        frase = frase.toUpperCase();
        System.out.println(frase);

        String outraFrase = "outra frase aqui";
//        String resultado = frase + " " + outraFrase;
        String resultado = frase.concat(" ").concat(outraFrase);
        System.out.println(resultado);

        System.out.println("========================");

        String stringNula = null;
        System.out.println(stringNula == null);
//        System.out.println(stringNula.toUpperCase()); // da erro null pointer exception

        System.out.println("========================");

        String stringVazia = " ";
        System.out.println(stringVazia.isEmpty());
        System.out.println(stringVazia.isBlank());

        System.out.println("========================");

        String texto1 = "java";
        String texto2 = "Java";
        String texto3 = texto1;

        System.out.println(texto1 == texto2);
        System.out.println(texto1.equals(texto2));
        System.out.println(texto1.equalsIgnoreCase(texto2));

        System.out.println(texto1 == texto3);
        System.out.println(texto1.equals("java"));
        System.out.println(texto1 == "java");

        System.out.println(texto1.contains("va"));
        System.out.println(texto1.indexOf("va") > 0);

        System.out.println(texto1.indexOf("vsa"));
        System.out.println(texto1.indexOf("vsa") > 0);

        System.out.println("========================");

        String lista = "maçã,banana,uva,morango";
        String[] frutas = lista.split(",");
        System.out.println(frutas[0]);
        System.out.println(Arrays.toString(frutas));

        System.out.println("========================");

        String fraseJava = "Curso C# - este é um curso de C#";
        System.out.println(fraseJava.replaceAll("C#", "Java"));

        String texto = "    Olá, como vai?    ";
        System.out.println(texto.trim());
        System.out.println(texto.replaceAll("\\s+", ""));

        System.out.println("========================");

        String url = "www.example.com";
        System.out.println(url.startsWith("www"));
        System.out.println(url.endsWith(".com"));

        System.out.println("========================");

        String fraseDiferente = "Java é divertido";
        System.out.println(fraseDiferente.toUpperCase());
        System.out.println(fraseDiferente.toLowerCase());

        System.out.println("========================");

        String hello = "Hello, World!";
        System.out.println(hello.indexOf("Hello"));
        System.out.println(hello.charAt(7));
        System.out.println(hello.substring(7));
        System.out.println(hello.substring(7, 10));

        System.out.println("========================");

        String nome = "Alice";
        int idade = 30;
//        String mensagem = "Olá, meu nome é " + nome + " e tenho " + idade + " anos.";
        String mensagem = String.format("Olá, meu nome é %s e tenho %d anos.", nome, idade);
        System.out.println(mensagem);

        double preco = 12.3456;
        String precoFormatado = String.format("Preço: %.2f", preco);
        System.out.println(precoFormatado);
        String precoFormatado2 = String.format("Preço 2: %09.2f", preco);
        System.out.println(precoFormatado2);

        System.out.println("========================");

        List<String> nomes = Arrays.asList("Alice", "Bob", "Carlos");
        String nomesCombinados = String.join(", ", nomes);
        System.out.println(nomesCombinados);

        StringJoiner joiner = new StringJoiner(" - ");
        joiner.add("Alice");
        joiner.add("Bob");
        joiner.add("Carlos");
        System.out.println(joiner);

        String fromStream = nomes.stream()
                .filter(n -> n.contains("o"))
                .collect(Collectors.joining(", "));

        System.out.println(fromStream);

        System.out.println("========================");

        // ideal para ambientes de única thread
        // ideal para string longas
        StringBuilder builder = new StringBuilder();
        builder.append("Texto 1");
        builder.append(",");
        builder.append("Texto 2");
        // Converte o StringBuilder em uma String
        System.out.println(builder);

        // ideal para ambientes multi thread
        StringBuffer buffer = new StringBuffer();
        buffer.append("Texto 1");
        buffer.append(",");
        buffer.append("Texto 2");
        // Converte o StringBuilder em uma String
        System.out.println(buffer);
    }

}
