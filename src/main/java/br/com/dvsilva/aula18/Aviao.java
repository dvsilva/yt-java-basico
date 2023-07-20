package br.com.dvsilva.aula18;

public class Aviao extends Veiculo {

    public Aviao(String nome, String tipo) {
        super(nome, tipo);
    }

    @Override
    public void ligar() {
        System.out.println("ligando o aviao");
    }

    @Override
    public void desligar() {
        System.out.println("desligando o aviao");
    }

    @Override
    public String toString() {
        return "Aviao{" +
                "nome=" + getNome() +
                ", tipo=" + getTipo() +
                '}';
    }
}
