package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/subtracao/{n1}/{n2}")

public class Subtracao {

    @GET
    public int calculadora(@PathParam("n1") String n1Str, @PathParam("n2") String n2Str){

        try{

            int n1 = Integer.parseInt(n1Str);
            int n2 = Integer.parseInt(n2Str);

            int resultado = n1 - n2;
        
            return resultado;

        } catch (NumberFormatException nfe){

            throw new BadRequestException("Operador inválido.");

        }

    }

}
