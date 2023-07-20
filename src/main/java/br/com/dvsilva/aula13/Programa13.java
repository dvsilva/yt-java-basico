package br.com.dvsilva.aula13;

public class Programa13 {

    // herança - possibilita objetos (classes) a herdar elementos da classe mãe (atributos e métodos)
    // polimorfismo - visualizar o objeto de formas diferentes através de herança (interfaces)

    public static void main(String[] args) {
        Veiculo aviao = new Veiculo("Avião de carga", "Aéreo");
        System.out.println(aviao);

        Carro fiatUno = new Carro("Fiat Uno", "Terrestre");
        System.out.println(fiatUno);
        fiatUno.setKilometragem(400);
        System.out.println(fiatUno);
        fiatUno.zerarKilometragem();
        System.out.println(fiatUno);

        Veiculo carroUno = criarVeiculo(0);
        System.out.println(carroUno);

        Veiculo navio = criarVeiculo(1);
        System.out.println(navio);
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
