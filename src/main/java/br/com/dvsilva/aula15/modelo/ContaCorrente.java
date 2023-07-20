package br.com.dvsilva.aula15.modelo;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(int numeroDaConta, double saldo, String tipoConta, double limite) {
        super(numeroDaConta, saldo, tipoConta);
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(
                "ContaCorrente{" +
                "numeroDaConta=" + getNumeroDaConta() +
                ", saldo=" + getSaldo() +
                ", tipoConta=" + getTipoConta() +
                ", limite=" + limite +
                '}'
        );
    }

}
