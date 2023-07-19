package br.com.dvsilva.aula11;

public class Programa11 {

    // classes - moldes
    // objetos - instâncias das classes (moldes)
    // atributos - as propridades da classe/objeto
    // metodos - funções dentro da classe
    // construtores - são os métodos chamados na inicialização de um objeto

    public static void main(String[] args) {
        Carro carroDoDanyllo = new Carro();
//        carroDoJoao.fabricante = "Fiat";
        carroDoDanyllo.setFabricante("Fiat");
        carroDoDanyllo.setModelo("Uno 2022");
        carroDoDanyllo.print();
        System.out.println(carroDoDanyllo.getFabricante());

        Carro carroDoJoao = new Carro();
        carroDoJoao.setFabricante("Ford");
        carroDoJoao.setModelo("Focus 2021");
        carroDoJoao.print();
        System.out.println(carroDoJoao.getModelo());

        Carro carroDaMaria = new Carro("Chevrolet", "Onix 2020");
        carroDaMaria.print();

        Carro carroDoJoaquim = new Carro("Ka Sedan 2023");
        carroDoJoaquim.print();
    }
}
