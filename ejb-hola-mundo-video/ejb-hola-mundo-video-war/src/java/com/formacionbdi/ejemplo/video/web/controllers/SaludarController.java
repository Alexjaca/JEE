
package com.formacionbdi.ejemplo.video.web.controllers;

import com.formacionbdi.ejemplo.video.ejb3.models.SaludarSessionBeanLocal;
import javax.ejb.EJB;
import javax.enterprise.inject.Model;



@Model
public class SaludarController {
    
       @EJB  /// o @Inject
   private SaludarSessionBeanLocal saludar;

    public SaludarSessionBeanLocal getSaludar() {
        return saludar;
    }
    
}
