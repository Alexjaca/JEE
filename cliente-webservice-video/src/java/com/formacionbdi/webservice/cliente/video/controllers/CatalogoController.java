
package com.formacionbdi.webservice.cliente.video.controllers;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Named("catalogo")
@RequestScoped
public class CatalogoController {
    
    @Produces
    @Named("productos")
    @RequestScoped
    public List<Producto> listar(){
        ProductoWebService webService = new ProductoWebService();
        return webService.getProductoDaoSessionBeanPort().listar();
        
    }
    
}
