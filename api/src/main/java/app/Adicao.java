package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/adicao/{a1}/{a2}")

public class Adicao {

    @GET

    public double  somar(@PathParam("a1") String a1Str, @PathParam("a2") String a2Str){

        try{
            double a1 = Double.parseDouble(a1Str);
            double a2 = Double.parseDouble(a2Str);
    
            double calculo = a1 + a2;
    
            return calculo;
        }catch(NumberFormatException nfe){
            throw new BadRequestException("Número inválido");

        }



    }


    
}
