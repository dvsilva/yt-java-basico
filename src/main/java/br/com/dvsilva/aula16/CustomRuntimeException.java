package br.com.dvsilva.aula16;

public class CustomRuntimeException extends RuntimeException {

    public CustomRuntimeException() {
        super("mensagem da exceção notchecked personalizada");
    }

}
