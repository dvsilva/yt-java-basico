package br.com.dvsilva.aula10;

import java.util.Scanner;

public class Programa10 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==================");
        System.out.println("CALCULADORA DE IMC");
        System.out.println("==================");

        boolean deveContinuar = true;

        while (deveContinuar) {
            calcularIMC();

            System.out.println("Deseja continar? (Y/n)");
            String continuar = scanner.next();
            deveContinuar = continuar.equalsIgnoreCase("Y");
        }
    }

    private static void calcularIMC() {
        System.out.println("Digite seu peso (em kg):");
        double peso = scanner.nextDouble();
        System.out.println("Digite sua altura (em metros):");
        double altura = scanner.nextDouble();

        double imc = getIMC(peso, altura);
        String resultado = String.format("O cálculo de IMC para o peso %.2f e altura %.2f é de: %.2f",
                peso, altura, imc);
        System.out.println(resultado);
    }

    private static double getIMC(double peso, double altura) {
        return peso / (altura * altura);
    }

}
