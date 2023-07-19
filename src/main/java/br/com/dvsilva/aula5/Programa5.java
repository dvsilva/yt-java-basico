package br.com.dvsilva.aula5;

public class Programa5 {

    public static void main(String[] args) {
        double peso = 80.0;
        double altura = 1.78;

        // imc = peso / (altura * altura)
        double imc = peso / (altura * altura);
        System.out.println("O resultado do cálculo é: " + imc);
    }

}
