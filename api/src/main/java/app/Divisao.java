package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/divisao/{d1}/{d2}")
public class Divisao {
    @GET
    public double dividir(@PathParam("d1") String d1, @PathParam("d2") String d2){

        try {
            
            double n1 = Double.parseDouble(d1);
            double n2 = Double.parseDouble(d2);
            if (n2 ==0){
                throw new BadRequestException("O segundo valor não pode ser zero");
            }
            return n1/n2;
        } catch (NumberFormatException nfe) {
            throw new BadRequestException("Operador inválido.");
        }
    } 
}