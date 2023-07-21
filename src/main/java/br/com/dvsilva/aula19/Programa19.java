package br.com.dvsilva.aula19;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Programa19 {

    // Vetores - precisa saber o tamanho especifico do vetor/array

    // 1 - List - coleção ordenada que permite elementos duplicados
    //  a - ArrayList - rápido para recuperar os elementos por índice / inserção e remoção podem ser mais lentas
    //  b - LinkedList - inserção e remoção mais rápidas
    // 2 - Set - coleção que não permite elementos duplicados
    //  a - HashSet - armazena em qualquer ordem (não mantém uma ordem específica)
    //  b - TreeSet - armazena em ordem crescente
    // 3 - HashMap - coleção que armazena pares chave-valor e não permite chaves duplicadas
    //  a - HashSet - permite recuperação rápida dos valores por chave
    //  b - TreeMap - armazena em ordem crescente é bom para recuperar os elementos em ordem

    public static void main(String[] args) {
         int[] numeros = {1, 2, 3, 4, 5};

         for (int i = 0; i < numeros.length; i++) {
             System.out.println(numeros[i]);
         }

        System.out.println("======================");

        String[] nomes = new String[3];
        nomes[0] = "Alice";
        nomes[1] = "Bob";
        nomes[2] = "Clara";
//        nomes[3] = "Indice Inválido";

        for(String nome: nomes) {
            System.out.println(nome);
        }

        System.out.println("======================");

        List<String> listaDeNomes = new ArrayList<>();
        listaDeNomes.add("Alice");
        listaDeNomes.add("Bob");
        listaDeNomes.add("Clara");

        for(String nome: listaDeNomes) {
            System.out.println(nome);
        }

        System.out.println("======================");

        List<String> listaDeNomes2 = new LinkedList<>();
        listaDeNomes2.add("Alice");
        listaDeNomes2.add("Bob");
        listaDeNomes2.add("Clara");

        for(String nome: listaDeNomes2) {
            System.out.println(nome);
        }

        System.out.println("======================");

        Set<Integer> setNumeros = new HashSet<>();
        setNumeros.add(10);
        setNumeros.add(20);
        setNumeros.add(30);
        setNumeros.add(30);

        for(Integer numero: setNumeros) {
            System.out.println(numero);
        }

        System.out.println("======================");

        Set<Integer> treeSetNumeros = new TreeSet<>();
        treeSetNumeros.add(30);
        treeSetNumeros.add(10);
        treeSetNumeros.add(20);
        treeSetNumeros.add(30);

        for(Integer numero: treeSetNumeros) {
            System.out.println(numero);
        }

        System.out.println("======================");

        Map<String, Integer> idadePorNome = new HashMap<>();
        idadePorNome.put("Alice", 25);
        idadePorNome.put("Bob", 30);
        idadePorNome.put("Carol", 28);

        for(Map.Entry<String, Integer> entry: idadePorNome.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

//        for(String nome: idadePorNome.keySet()) {
//            System.out.println(nome);
//        }
//        for(Integer idade: idadePorNome.values()) {
//            System.out.println(idade);
//        }

        System.out.println("======================");

        Map<String, String> capitaisPorPais = new TreeMap<>();
        capitaisPorPais.put("EUA", "Washington, D.C.");
        capitaisPorPais.put("França", "Paris");
        capitaisPorPais.put("Brasil", "Brasília");

        for(Map.Entry<String, String> entry: capitaisPorPais.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

}
