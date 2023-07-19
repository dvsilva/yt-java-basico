package br.com.dvsilva.aula6;

import java.util.Scanner;

public class Programa6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        System.out.println("digite seu nome");
//        String entrada = scanner.next();
//        System.out.println("a entrada do usuário foi: " + entrada);

        System.out.println("Digite seu peso (em kg):");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura (em metros):");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        System.out.println("O cálculo de IMC para o peso " + peso + " e altura " + altura + " é de: " + imc);
    }

}
