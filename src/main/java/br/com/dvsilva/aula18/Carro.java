package br.com.dvsilva.aula18;

// não funciona herança multimpla em java!!
public class Carro extends Veiculo /*, Aviao */ implements Aceleravel, Freavel {

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
    public void ligar() {
        System.out.println("ligando o carro");
    }

    @Override
    public void desligar() {
        System.out.println("desligando o carro");
    }

    @Override
    public void acelerar() {
        System.out.println("acelerando o carro");
    }

    @Override
    public void frear() {
        System.out.println("freando o carro");
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
