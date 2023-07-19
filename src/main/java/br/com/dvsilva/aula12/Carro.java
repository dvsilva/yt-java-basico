package br.com.dvsilva.aula12;

public class Carro {

    private String fabricante;
    private String modelo;

    public Carro(){}

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public Carro(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void print() {
        System.out.println(
                fabricante
                + " - " +
                modelo
        );
    }

    @Override
    public String toString() {
        return "Carro{" +
                "fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                '}';
    }
}
