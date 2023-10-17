package com.alejandrosanchez.calculadora_alejandrosanchez;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

        private final Calculadora calculadora = new Calculadora();
        @Test
        public void suma_isCorrect() {
            assertEquals("4", calculadora.suma("2", "2"));
        }

        @Test
        public void resta_isCorrect() {
            assertEquals("0", calculadora.resta("2", "2"));
        }

        @Test
        public void multiplicar_isCorrect() {
            assertEquals("4", calculadora.multiplicar("2", "2"));
        }
}
