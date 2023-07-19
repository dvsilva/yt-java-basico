package br.com.dvsilva.aula9;

public class Programa9 {

    public static void main(String[] args) {
        escreverNome("Danyllo");
        escreverNome("David");
        escreverNome("Maria");
        escreverNome("Josefa");

        System.out.println("=====================");
        soma(5, 6);
        soma(8, 16);
        soma(20, 52);

        System.out.println("=====================");
        int resultado = subtracao(10 , 5);
        System.out.println("subtracao " + resultado);

        System.out.println("=====================");

        int x = 0;
        manipularVariavel(x);
        System.out.println("x fora do metodo: " + x);
    }

    private static void manipularVariavel(int x) {
        System.out.println("manipulando variavel dentro do método");
        x = x + 2;
        System.out.println("x dentro do metodo: " + x);
    }

    public static int subtracao(int a, int b){
        return a - b;
    }

    private static void soma(int a, int b) {
        System.out.println("somando dentro do método");
        int resultado = a + b;
        System.out.println("soma é: " + resultado);
    }

    private static void escreverNome(String nome){
        System.out.println("printando nome dentro do método");
        System.out.println("o nome informado é: " + nome);
    }

}
