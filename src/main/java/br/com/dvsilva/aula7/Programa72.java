package br.com.dvsilva.aula7;

import java.util.Scanner;

public class Programa72 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o dia da semana");
        int diaDaSemana = scanner.nextInt();

        switch (diaDaSemana){
            case 1 -> System.out.println("Segunda-feira");
            case 2 -> System.out.println("Terça-feira");
            case 3 -> System.out.println("Quarta-feira");
            case 4 -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6 -> System.out.println("Sábado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Dia da semana desconhecido");
        }

    }

}
