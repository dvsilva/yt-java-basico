package br.com.dvsilva.aula16;

public class Programa16 {

    public static void main(String[] args) {
        try {
            throw new CustomException();
//            int result = 10 / 0;
//            System.out.println(result);
        }
        catch (ArithmeticException ex) {
            System.out.println("ops, deu na divisão por zero!");
        }
        catch (CustomException ex) {
            System.out.println("ops, lançou nossa exceção personalizada!");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println("ops, deu erro!");
        }
        finally {
            System.out.println("executou de qualquer forma");
        }

        lancarException();
        System.out.println("terminou o programa!");
    }

    private static void lancarException() {
        try {
            throw new CustomRuntimeException();
        }
        catch (CustomRuntimeException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
            System.out.println("ops, deu erro!");
        }

    }
}
