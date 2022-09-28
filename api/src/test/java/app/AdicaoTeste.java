package app;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


public class AdicaoTeste {
    Adicao  adicao = new Adicao();
    
    @Test
    public void verificaCasoBase() {
        double resultado = adicao.somar("15", "3");
        assertEquals(18.0, resultado);
    }

    @Test
    public void verificaOutroCaso() {
        double resultado = adicao.somar("90", "2");
        assertEquals(92.0, resultado);
    }

}
