package br.com.dvsilva.aula22;

import java.lang.reflect.Method;
import java.util.Objects;

public class Programa22 {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(new ExemploOverride());
        new ExemploDeprecated().metodoDepreciado();

        Method metodo = ExemploCustomAnnotation.class.getMethod("meuMetodoCustom");
        CustomAnnotation annotation = metodo.getAnnotation(CustomAnnotation.class);
        System.out.println(annotation.valor());

        Method metodoSemAnnotation = ExemploCustomAnnotation.class.getMethod("meuMetodoSemAnnotation");
        CustomAnnotation annotation2 = metodoSemAnnotation.getAnnotation(CustomAnnotation.class);

        if(Objects.nonNull(annotation2)) { // annotation2 != null
            System.out.println(annotation2.valor());
        }
        else {
            System.out.println("Não tem annotation");
        }
    }

}
