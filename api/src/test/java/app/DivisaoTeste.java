package app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import io.jooby.exception.BadRequestException;

public class DivisaoTeste {
    Divisao divisao;
    
    @BeforeEach
    public void antesCadaTeste(){
        divisao = new Divisao();
    }
    @Test
    public void verificaCasoBase() {
        double resultado = divisao.dividir("15", "3");
        assertEquals(5.0, resultado);
    }

    @Test
    public void verificaCasoErro() {
        assertThrows(BadRequestException.class, ()->{
            divisao.dividir("1", "0");
        });
    }

}

