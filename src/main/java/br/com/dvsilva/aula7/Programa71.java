package br.com.dvsilva.aula7;

import java.util.Scanner;

public class Programa71 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        if(idade >= 18 && idade < 65) {
            System.out.println("é maior de idade");
        }
        else if(idade >= 65 && idade < 100){
            System.out.println("é aposentado");
        }
        else if(idade > 100){
            System.out.println("é muito sortudo, viveu muito!");
        }
        else {
            System.out.println("é menor de idade");
        }

    }

}
