package br.com.dvsilva.aula16;

public class CustomException extends Exception {

    public CustomException() {
        super("mensagem da exceção checked personalizada");
    }

}
