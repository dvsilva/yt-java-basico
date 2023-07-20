package br.com.dvsilva.aula18;

public class Programa18 {

    public static void main(String[] args) {
        Veiculo aviao = new Aviao("Avião de carga", "Aéreo");
        System.out.println(aviao);
        aviao.ligar();
        aviao.desligar();

        Carro fiatUno = new Carro("Fiat Uno", "Terrestre");
        System.out.println(fiatUno);
        fiatUno.setKilometragem(400);
        System.out.println("debugando: " + fiatUno.getKilometragem());
        System.out.println(fiatUno);
        fiatUno.zerarKilometragem();
        System.out.println(fiatUno);
        fiatUno.ligar();
        fiatUno.desligar();
        fiatUno.acelerar();

        Veiculo carroUno = criarVeiculo(0);
        System.out.println(carroUno);
        carroUno.ligar();
        carroUno.desligar();

        Veiculo navio = criarVeiculo(1);
        System.out.println(navio);
        navio.ligar();
        navio.desligar();

        Desligavel navioDesligavel = criarDesligavel(1);
        navioDesligavel.desligar();
    }

    private static Desligavel criarDesligavel(int tipo) {
        if(tipo == 0) {
            return new Carro("Fiat Uno Como Método", "Terrestre");
        }
        else {
            return new Navio("Navio Cargueiro", "Marinho");
        }
    }

    private static Veiculo criarVeiculo(int tipo) {
        if(tipo == 0) {
            return new Carro("Fiat Uno Como Método", "Terrestre");
        }
        else {
            return new Navio("Navio Cargueiro", "Marinho");
        }
    }

}
