
package com.formacionbdi.webservice.ejb3.video.models.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import com.formacionbdi.webservice.ejb3.video.models.entity.Producto;
import javax.jws.WebMethod;
import javax.jws.WebService;


@Stateless
@WebService(serviceName = "ProductoWebService")
public class ProductoDaoSessionBean implements ProductoDaoSessionBeanLocal {

   @PersistenceContext(unitName="webservice-ejb-jpa-videoPU")
   EntityManager entityManager;

    @Override
    @WebMethod(operationName = "listar")
    public List<Producto> listar() {
        return entityManager.createQuery("Select p from Producto p").getResultList();
    }
   
   
}
