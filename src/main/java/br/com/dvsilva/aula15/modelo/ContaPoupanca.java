package br.com.dvsilva.aula15.modelo;

public class ContaPoupanca extends Conta implements Rentavel {

    private double taxaRendimento;

    public ContaPoupanca(int numeroDaConta, double saldo, String tipoConta, double taxaRendimento) {
        super(numeroDaConta, saldo, tipoConta);
        this.taxaRendimento = taxaRendimento;
    }

    public double getTaxaRendimento() {
        return taxaRendimento;
    }

    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    @Override
    public void rentabilizar() {
        System.out.println("rentabilizando, saldo atual: " + getSaldo());
        double valorRentabilizado = getSaldo() * taxaRendimento;
        double novoSaldo = getSaldo() + valorRentabilizado;
        setSaldo(novoSaldo);
        System.out.println("valor rentabilizado com sucesso, saldo atual: " + getSaldo());
    }

    @Override
    public void exibirInformacoes() {
        System.out.println(
                "ContaPoupanca{" +
                        "numeroDaConta=" + getNumeroDaConta() +
                        ", saldo=" + getSaldo() +
                        ", tipoConta=" + getTipoConta() +
                        ", taxaRendimento=" + taxaRendimento +
                        '}'
        );
    }
}
