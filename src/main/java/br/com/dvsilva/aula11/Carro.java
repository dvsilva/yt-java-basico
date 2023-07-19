package br.com.dvsilva.aula11;

public class Carro {

    String fabricante;
    String modelo;

    public Carro(){}

    public Carro(String modelo) {
        this.modelo = modelo;
    }

    public Carro(String fabricante, String modelo) {
        this.fabricante = fabricante;
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void print() {
        System.out.println(
                fabricante
                + " - " +
                modelo
        );
    }

}
