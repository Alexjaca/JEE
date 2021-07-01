
package com.formacionbdi.jsf2.ejb3.video.models.dao;

import com.formacionbdi.jsf2.ejb3.video.models.entity.Producto;
import java.util.List;
import javax.ejb.Local;


@Local
public interface ProductoDaoSessionBeanLocal {

    List<Producto> listar();
    
}
