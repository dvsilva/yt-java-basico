package br.com.dvsilva.aula12;

public class Programa12 {

    // classes - moldes
    // objetos - instâncias das classes (moldes)
    // atributos - as propridades da classe/objeto
    // metodos - funções dentro da classe
    // construtores - são os métodos chamados na inicialização de um objeto

    // encapsulamento - proteger os atributos da classe - atributos privados e métodos para acesso seguro das info
    // mnodificadores de acesso - private, public e protected

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
//        carroDoJoaquim.print();
        System.out.println(carroDoJoaquim);

        // funciona quando o atributo é protected
//        String fabricante = carroDoJoaquim.fabricante;
    }
}
