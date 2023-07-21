package br.com.dvsilva.aula20;

public class Calculadora {

    public double soma(double num1, double num2) {
        return num1 + num2;
    }

    public double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    public double divisao(double num1, double num2) {
        if (num2 == 0.0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }

        return num1 / num2;
    }

}
