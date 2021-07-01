
package com.formacionbdi.ejemplo.video.ejb3.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.ejb.Stateless;


@Stateless
public class SaludarSessionBean implements SaludarSessionBeanLocal {

    @Override
    public String decirHola(String nombre) {
        
        List<String> saludos = new ArrayList();
        saludos.add("Hola! ");
        saludos.add("Hola que tal! ");
        saludos.add("Hola que hace! ");
        saludos.add("Hola! Hola Mundo! ");
        saludos.add("Hi! Hello world! ");
        saludos.add("Que tal amigo! ");
        saludos.add("Como te va! ");
        saludos.add("Como estas! ");
        saludos.add("Que tal te ha ido! ");
        saludos.add("Hola compa! ");
        saludos.add("Hola bro! ");
        saludos.add("Buenas compadre, que tiempo! ");
        
        Random random = new Random();
        String mensaje = null;
        
        if(saludos.size()>0){
            final int randomMessage = random.nextInt(saludos.size());
            mensaje = saludos.get(randomMessage);
        }
        return mensaje + nombre;   
    }

    
}
