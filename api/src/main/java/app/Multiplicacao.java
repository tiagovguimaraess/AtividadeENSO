package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/multiplicacao/{m1}/{m2}")
public class Multiplicacao {
    @GET
    public double multiplicar(@PathParam("m1") String m1, @PathParam("m2") String m2){
        
        try {
            double n1 = Double.parseDouble(m1);
            double n2 = Double.parseDouble(m2);
            return n1*n2;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    } 
}
