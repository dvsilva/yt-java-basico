package br.com.dvsilva.aula4;

public class Programa42 {

    public static void main(String[] args) {
        int resultado1 = 2 + 3;
        System.out.println(resultado1);

        String resultado2 = "abc" + "def";
        System.out.println(resultado2);

        int resultado3 = 2 - 1;
        System.out.println(resultado3);

        int resultado4 = 2 * 10;
        System.out.println(resultado4);

        int resultado5 = 4 / 2;
        System.out.println(resultado5);

        int resultado6 = 9 % 2;
        System.out.println(resultado6);

        System.out.println(1 == 1);
        System.out.println(1 != 2);
        System.out.println(1 < 2);
        System.out.println(1 > 2);
        System.out.println(1 <= 2);
        System.out.println(1 >= 2);

        System.out.println(1 < 2 && 5 > 4);
        System.out.println(1 < 2 && 5 > 6);
        System.out.println(1 < 2 || 5 > 6);

        System.out.println(!(1 < 2));

        int i = 0;
        i += 10;
        System.out.println(i);
        i -= 10;
        System.out.println(i);
        i = 1;
        i *= 10;
        System.out.println(i);
        i /= 10;
        System.out.println(i);
    }
}
