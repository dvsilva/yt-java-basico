package br.com.dvsilva.aula15.modelo;

public interface OperacoesBancarias {

    void deposito(double valor);

    void saque(double valor);

    void transferencia(double valor);

}
