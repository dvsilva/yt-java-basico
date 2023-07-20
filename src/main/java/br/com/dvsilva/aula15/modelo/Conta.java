package br.com.dvsilva.aula15.modelo;

public abstract class Conta implements OperacoesBancarias {

    private int numeroDaConta;
    private double saldo;
    private String tipoConta;

    public Conta(int numeroDaConta, double saldo, String tipoConta) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public abstract void exibirInformacoes();

    public void deposito(double valor){
        System.out.println("depositando valor " + valor + ", saldo atual: " + saldo);
        saldo += valor;
        System.out.println("valor deposito com sucesso, saldo atual: " + saldo);
    }

    public void saque(double valor){
        System.out.println("sacando valor " + valor + ", saldo atual: " + saldo);
        saldo -= valor;
        System.out.println("valor sacado com sucesso, saldo atual: " + saldo);
    }

    public void transferencia(double valor){
        System.out.println("transferindo valor " + valor + ", saldo atual: " + saldo);
        saldo -= valor;
        System.out.println("valor transferido com sucesso, saldo atual: " + saldo);
    }


}
