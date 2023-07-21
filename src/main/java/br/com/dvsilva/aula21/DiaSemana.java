package br.com.dvsilva.aula21;

public enum DiaSemana {

    DOMINGO(1, "Domingo"),
    SEGUNDA(2, "Segunda-feira"),
    TERCA(3, "Terça-feira"),
    QUARTA(4, "Quarta-feira"),
    QUINTA(5, "Quinta-feira"),
    SEXTA(6, "Sexta-feira"),
    SABADO(7, "Sábado");

    private final int identificador;
    private final String nome;

    DiaSemana(int identificador, String nome) {
        this.identificador = identificador;
        this.nome = nome;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNome() {
        return nome;
    }

    public static boolean isDomingo(String diaSemana) {
        return DOMINGO.getNome().equals(diaSemana);
    }

    public static boolean isDomingo(int identificador) {
        return DOMINGO.getIdentificador() == identificador;
    }

    public static boolean isDomingo(DiaSemana diaSemana) {
        return DOMINGO == diaSemana;
    }

    public static DiaSemana[] getDiasUteis(){
        return new DiaSemana[]{
            SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA
        };
    }
}
