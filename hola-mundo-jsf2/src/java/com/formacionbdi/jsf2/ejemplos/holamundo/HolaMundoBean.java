
package com.formacionbdi.jsf2.ejemplos.holamundo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Model;
import javax.inject.Named;

@Model
public class HolaMundoBean {
    
    private String saludo = "Hola Mundo Beans";
    
    @PostConstruct
    public void iniciar(){
        saludo = "Hola mundo CDI! desde el PostConstruct";
    }

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
    @PreDestroy
    public void finalizar(){
        System.out.println("Finalizando HolaMundoBeans");
    }
    
}
