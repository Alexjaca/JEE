
package com.formacionbdi.spring.holamundo.controllers;


import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HolaMundoController{

       @RequestMapping("hola.htm")
    public ModelAndView holaMundo(ModelAndView mav) throws Exception {
        mav.setViewName("holamundo");        
        mav.addObject("saludo", "Bienvenido usuario del sistema");
        mav.addObject("fecha", new Date());
        return mav;
    }

  
}
