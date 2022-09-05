package app;

import io.jooby.annotations.*;
import io.jooby.exception.BadRequestException;

@Path("/adicao/{a1}/{a2}")

public class Adicao {

    @GET

    public int  calcular(@PathParam("a1") String a1Str, @PathParam("a2") String a2Str){

        try{
            int a1 = Integer.parseInt(a1Str);
            int a2 = Integer.parseInt(a2Str);
    
            int calculo = a1 + a2;
    
            return calculo;
        }catch(NumberFormatException nfe){
            throw new BadRequestException("Número inválido");

        }



    }


    
}
