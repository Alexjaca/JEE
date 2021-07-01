
package com.formacionbdi.ejemplo.video.ejb3.models;

import javax.ejb.Local;


@Local
public interface SaludarSessionBeanLocal {

    String decirHola(String nombre);
    
}
