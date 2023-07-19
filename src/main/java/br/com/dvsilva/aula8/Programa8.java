package br.com.dvsilva.aula8;

public class Programa8 {

    public static void main(String[] args) {
        System.out.println("loop while");
        int contador = 0;

        while (contador < 10){
            System.out.println(contador);
            contador++;
        }

        System.out.println("loop do while");
        contador = 0;

        do {
            System.out.println(contador);
            contador++;
        } while (contador < 10);

        System.out.println("loop for");

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for(int i = 0; i < 10; i+= 2) {
            System.out.println(i);
        }

        System.out.println("loop com continue");
        for(int i = 0; i < 10; i++) {
            if(i % 2 == 0){
                continue;
            }
            System.out.println(i);
        }

        System.out.println("loop com break");
        for(int i = 1; i < 10; i++) {
            if(i % 5 == 0){
               break;
            }
            System.out.println(i);
        }
    }

}
