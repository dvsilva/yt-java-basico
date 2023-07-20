package br.com.dvsilva.aula13;

public class Navio extends Veiculo {

    public Navio(String nome, String tipo) {
        super(nome, tipo);
    }

    @Override
    public String toString() {
        return "Navio{" +
                "nome=" + getNome() +
                ", tipo=" + getTipo() +
                '}';
    }
}
