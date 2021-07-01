
package es.formacionjava.webservice.ejb3.bienes.models.dao;

import es.formacionjava.webservice.ejb3.bienes.models.entity.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
@WebService (serviceName = "UsuarioWebService")
public class UsuarioDaoSessionBean implements UsuarioDaoSessionBeanLocal {

   @PersistenceContext(unitName = "webservice-ejb-jpa-bienesPU")
   EntityManager entityManager;

    @Override
    @WebMethod(operationName = "listarUsuario")
    public List<Usuario> listar() {
        return entityManager.createQuery("select p from Usuario p").getResultList();
    }

   
}
