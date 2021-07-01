
package com.formacionbdi.jsf2.web.video.controllers;

import com.formacionbdi.jsf2.ejb3.video.models.dao.ProductoDaoSessionBeanLocal;
import com.formacionbdi.jsf2.ejb3.video.models.entity.Producto;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.inject.Inject;

@RequestScoped
@Named("catalogo")
public class CatalogoController {
    
    @Inject  /// o @EJB
    private ProductoDaoSessionBeanLocal productoDao;
    
    @Produces  /// guarda en el contexto cdi
    @Named("productos")
    @RequestScoped
    public List<Producto> listar(){
        return productoDao.listar();
    }
}
