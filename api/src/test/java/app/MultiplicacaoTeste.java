package app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

public class MultiplicacaoTeste {
    Multiplicacao multiplicacao;
    
    @BeforeEach
    public void antesCadaTeste(){
        multiplicacao = new Multiplicacao();
    }
    @Test
    public void verificaCasoBase() {
        double resultado = multiplicacao.multiplicar("15", "3");
        assertEquals(45.0, resultado);
    }
    @Test
    public void verificaCasoBase2() {
        double resultado = multiplicacao.multiplicar("16", "4");
        assertEquals(64.0, resultado);
    }
    @Test
    public void verificaCasoBase3() {
        double resultado = multiplicacao.multiplicar("12", "4");
        assertEquals(48.0, resultado);
    }
}
