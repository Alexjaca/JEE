
package es.formacionjavaee.vienes.controller;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Produces;
import javax.inject.Named;

@Named("catalogo")
@RequestScoped
public class CatalogoController {
  
    @Produces
    @Named("usuarios")
    @RequestScoped
    public List<Usuario> listarUsuarios(){
        UsuarioWebService webService = new UsuarioWebService();
        return webService.getUsuarioDaoSessionBeanPort().listarUsuario();    }
    
}
