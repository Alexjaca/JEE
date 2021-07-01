
package com.formacionbdi.jsf2.ejb3.video.models.dao;

import com.formacionbdi.jsf2.ejb3.video.models.entity.Producto;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class ProductoDaoSessionBean implements ProductoDaoSessionBeanLocal {

  @PersistenceContext(unitName = "ejb-jsf2-jpa-video-ejbPU")
  private EntityManager entitiManager;

    @Override
    public List<Producto> listar() {
       return entitiManager.createQuery("select p from Producto p").getResultList();
    }
  
  
}
