/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.formacionbdi.ejemplo.servlet;

import com.formacionbdi.ejemplo.servlet.models.Cuenta;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alex
 */
@WebServlet(name = "HolaMundoServlet", urlPatterns = {"/HolaMundo"})
public class HolaMundo extends HttpServlet {

 
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            request.setAttribute("titulo", "Formulario Basico Servlet");
            request.setAttribute("titulo2", "Crear Cuenta ");
            getServletContext().getRequestDispatcher("/WEB-INF/vistas/crearFrom.jsp").forward(request, response);
            
            /* TODO output your page here. You may use following sample code. */
           /* out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta charset=\"ISO-8859-1\">");   
            out.println("<title>Formulario Basico servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Formulario Basico de Servlet</h1>");
            
            out.println("<form action=\"" +request.getContextPath() +"/HolaMundo\" method=\"post\">");
            out.println("<table>");
            out.println("<tr>");
            out.println("<td>Nombre</td>");
            out.println("<td><input type=\"text\" name=\"nombre\" style=\"width: 300px;\"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Email</td>");
            out.println("<td><input type=\"text\" name=\"email\" style=\"width: 300px;\"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Saldo</td>");
            out.println("<td><input type=\"text\" name=\"saldo\" style=\"width: 300px;\"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Nivel Endeudamiento</td>");
            out.println("<td><input type=\"text\" name=\"nivelEndeudamiento\" style=\"width: 300px;\"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Fecha Renovacion</td>");
            out.println("<td><input type=\"text\" name=\"fechaRenovacion\" style=\"width: 300px;\"</td>");
            out.println("</tr>");        
            out.println("<tr>");
            out.println("<td  colspan=\"2\"><input type=\"submit\" value=\"Crear Cuenta\"</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<form>");
            out.println("</body>");
            out.println("</html>");*/
        }
    }

 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        
        String nombre = request.getParameter("nombre");
        String email = request.getParameter("email");
        String saldo = request.getParameter("saldo");
        String nivelEndeudamiento = request.getParameter("nivelEndeudamiento");
        String fechaRenovacionString = request.getParameter("fechaRenovacion");
        
        SimpleDateFormat formatear = new SimpleDateFormat("yyyy-mm-dd");
        
        Date fechaRenovacion = null;
        
        try{
            fechaRenovacion = formatear.parse(fechaRenovacionString);
        }catch(ParseException e){
            
        }
        
        Cuenta cuenta = new Cuenta();
        cuenta.setNombre(nombre);
        cuenta.setEmail(email);
        
        try{
        cuenta.setSaldo(new BigDecimal(saldo));
        cuenta.setNivelEndeudamiento(new BigDecimal(nivelEndeudamiento)); 
        }catch(NumberFormatException e){
            
        }
        
        cuenta.setFechaRenovacion(fechaRenovacion);
        
        request.setAttribute("cuenta", cuenta);
        request.setAttribute("titulo", "Formulario Basico Servlet : Datos Enviados");
        request.setAttribute("titulo2", "Detalle de Cuenta: " + cuenta.getNombre());
        
        getServletContext().getRequestDispatcher("/WEB-INF/vistas/respuesta.jsp").forward(request, response);
    }

  
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
