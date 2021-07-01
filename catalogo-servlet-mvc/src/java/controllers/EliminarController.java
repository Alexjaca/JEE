/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.dao.IProductoDao;
import models.dao.ProductoDaoJDBC;
import models.entity.Producto;

/**
 *
 * @author alex
 */
@WebServlet("/catalogo/eliminar")
public class EliminarController extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        int id = Integer.parseInt(request.getParameter("id"));
        
        
        Producto producto = new Producto();
        IProductoDao dao = new ProductoDaoJDBC();
        producto.setId(id);
        
        dao.eliminar(producto);       
        List<Producto> lista = dao.Listar();
        
        request.setAttribute("productos", lista);
        request.setAttribute("titulo", "Listado de Productos");
        
        request.getRequestDispatcher("/WEB-INF/views/listado.jsp").forward(request, response);   
 
    }

 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }


    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
