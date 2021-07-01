package com.formacionbdi.jsf2.ejemplos.injectinterface;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@RequestScoped
@Named
@Formal
public class FormalSaludo implements SaludoInterface {
    @Override
    public String saludar(String nombre){
        return "Formal Hola, que tal - Saludo Formal " + nombre;
    }
}
