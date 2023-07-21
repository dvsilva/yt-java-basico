package br.com.dvsilva.aula21;

public class Programa21 {

//    private static final String SEGUNDA_FEIRA = "Segunda-feira";
//    private static final String TERCA_FEIRA = "Terça-feira";

    public static void main(String[] args) {
//        System.out.println(SEGUNDA_FEIRA);
//        System.out.println(TERCA_FEIRA);

        System.out.println(DiaSemana.DOMINGO.getIdentificador());
        System.out.println(DiaSemana.DOMINGO.getNome());

        System.out.println(DiaSemana.isDomingo(1));
        System.out.println(DiaSemana.isDomingo(18));

        System.out.println(DiaSemana.isDomingo("Domingo"));
        System.out.println(DiaSemana.isDomingo("outro dia"));

        DiaSemana domingo = DiaSemana.DOMINGO;
        System.out.println(DiaSemana.isDomingo(domingo));
        System.out.println(DiaSemana.isDomingo(DiaSemana.QUINTA));

        DiaSemana outro = DiaSemana.SEXTA;
        switch (outro){
            case DOMINGO -> System.out.println("é domingo");
            case SEGUNDA -> System.out.println("é segunda");
            case TERCA -> System.out.println("é terça");
            case QUARTA -> System.out.println("é quarta");
            case QUINTA -> System.out.println("é quinta");
            case SEXTA -> System.out.println("é sexta");
            case SABADO -> System.out.println("é sábado");
            case null -> System.out.println("dia inválido");
            case default -> System.out.println("dia desconhecido");
        }

        for(DiaSemana dia : DiaSemana.values()) {
            System.out.println(dia.getIdentificador() + " - " + dia.getNome());
        }

        for(DiaSemana dia : DiaSemana.getDiasUteis()) {
            System.out.println(dia.getIdentificador() + " - " + dia.getNome());
        }
    }

}
