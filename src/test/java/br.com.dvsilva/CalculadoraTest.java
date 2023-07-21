package br.com.dvsilva;

import br.com.dvsilva.aula20.Calculadora;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;

public class CalculadoraTest {

    private static Calculadora calc;

    @BeforeAll
    public static void setUp(){
        System.out.println("setUp");
        calc = new Calculadora();
    }

    @AfterAll
    public static void shutdown(){
        System.out.println("shutdown");
    }

    @Test
    public void testSoma(){
        // cenario
        double num1 = 2;
        double num2 = 3;
        // acao
        double resultado = calc.soma(num1, num2);
        // verificacao
        assertEquals(5, resultado, 0);
    }

    @Test
    public void testSubtracao() {
        // cenario
        double num1 = 5;
        double num2 = 3;
        // acao
        double resultado = calc.subtracao(num1, num2);
        // verificacao
        assertEquals(2, resultado, 0);
    }

    @Test
    public void testMultiplicacao() {
        // cenario
        double num1 = 5;
        double num2 = 3;
        // acao
        double resultado = calc.multiplicacao(num1, num2);
        // verificacao
        assertEquals(15, resultado, 0);
    }

    @Test
    public void testDivisao() {
        // cenario
        double num1 = 10;
        double num2 = 2;
        // acao
        double resultado = calc.divisao(num1, num2);
        // verificacao
        assertEquals(5.0, resultado, 0);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisaoPorZero() {
        // cenario
        double num1 = 10;
        double num2 = 0;
        // acao
        double resultado = calc.divisao(num1, num2);
        // verificacao
    }

    @ParameterizedTest
    @MethodSource("valoresParaSoma")
    public void testSomaParametrizado(int num1, int num2, int resultadoEsperado) {
        // cenario
        // acao
        double resultado = calc.soma(num1, num2);
        // verificacao
        assertEquals(resultadoEsperado, resultado, 0);
    }

    private static Stream<Arguments> valoresParaSoma() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(0, 0, 0),
                Arguments.of(-1, 1, 0),
                Arguments.of(100, 200, 300)
        );
    }

}
