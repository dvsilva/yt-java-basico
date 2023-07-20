package br.com.dvsilva.aula17;

public class Programa17 {

    private static final int MINHA_CONSTANTE = 1;

    public static void main(String[] args) {
        int varivel = MINHA_CONSTANTE;
        int outraVariavel = MINHA_CONSTANTE;

//        nao funciona - constantes com final nao mudam de valor
//        MINHA_CONSTANTE = 2;

        // DRY
        printarMensagemPersonalizadaDaFuncao();
        metodo();

        try {
            throw new RuntimeException();
        }
        catch (Exception e) {
            System.out.println("tratou exceção runtime!");
        }
    }

    public static void metodo(){
        // varias linhas de codigo
        printarMensagemPersonalizadaDaFuncao();
        // varias linhas de codigo
    }

    private static void printarMensagemPersonalizadaDaFuncao() {
        System.out.println("faz determinada função!");
    }

    public static void outroMetodo(){
        // varias linhas de codigo
        printarMensagemPersonalizadaDaFuncao();
        // varias linhas de codigo
    }

}
