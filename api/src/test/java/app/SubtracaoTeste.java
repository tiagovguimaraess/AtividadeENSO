package app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SubtracaoTeste {

    Subtracao subtracao = new Subtracao();
    
    @Test
    public void verificaCasoPositivo() {
        double resultado = subtracao.subtrair("4", "2");
        assertEquals(2.0, resultado);
    }

    @Test
    public void verificaCasoNegativo() {
        double resultado = subtracao.subtrair("-4", "2");
        assertEquals(-6.0, resultado);
    }

}

