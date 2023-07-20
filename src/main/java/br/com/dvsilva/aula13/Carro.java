package br.com.dvsilva.aula13;

public class Carro extends Veiculo {

    private double kilometragem;

    public Carro(String nome, String tipo) {
        super(nome, tipo);
    }

    public double getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(double kilometragem) {
        this.kilometragem = kilometragem;
    }

    public void zerarKilometragem(){
        this.kilometragem = 0;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome=" + getNome() +
                ", tipo=" + getTipo() +
                ", kilometragem=" + kilometragem +
                '}';
    }
}
