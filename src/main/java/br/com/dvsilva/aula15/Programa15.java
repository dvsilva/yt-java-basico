package br.com.dvsilva.aula15;

import br.com.dvsilva.aula15.modelo.ContaCorrente;
import br.com.dvsilva.aula15.modelo.ContaPoupanca;

public class Programa15 {

    // 1 - representar contas bancárias (corrente e poupanca)
    // 2 - criar operações de deposito, saldo e transferencia
    // 3 - criar método para mostrar informações da conta
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(1, 500, "CORRENTE", 100);
        cc.exibirInformacoes();
        cc.deposito(100);
        cc.exibirInformacoes();
        cc.saque(400);
        cc.exibirInformacoes();
        cc.transferencia(50);
        cc.exibirInformacoes();

        ContaPoupanca cp = new ContaPoupanca(2, 200, "POUPANCA", 0.2);
        cp.exibirInformacoes();
        cp.rentabilizar();
        cp.exibirInformacoes();
    }
}
