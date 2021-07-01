/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.formacionjava.webservice.ejb3.bienes.models.dao;

import es.formacionjava.webservice.ejb3.bienes.models.entity.Usuario;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author alex
 */
@Local
public interface UsuarioDaoSessionBeanLocal {

    List<Usuario> listar();
    
    
}
