
package com.formacionbdi.jsf2.cdi.anotaciones.produces;

import java.util.List;
import javax.enterprise.inject.Model;
import javax.inject.Inject;

@Model
public class UsuarioList {
    
    @Inject
    private List<String> usuarios;

    public List<String> getUsuarios() {
        return usuarios;
    }
    
}
