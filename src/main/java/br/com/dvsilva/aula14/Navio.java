package br.com.dvsilva.aula14;

public class Navio extends Veiculo {

    public Navio(String nome, String tipo) {
        super(nome, tipo);
    }

    @Override
    public void ligar() {
        System.out.println("ligando o navio");
    }

    @Override
    public void desligar() {
        System.out.println("desligando o navio");
    }

    @Override
    public String toString() {
        return "Navio{" +
                "nome=" + getNome() +
                ", tipo=" + getTipo() +
                '}';
    }
}
