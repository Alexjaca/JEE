
package com.formacionbdi.spring.di.inyeccionsimpleatributos;

import com.formacionbdi.spring.di.inyeccionsimpleatributos.entity.Categoria;
import com.formacionbdi.spring.di.inyeccionsimpleatributos.entity.Producto;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

  
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
        Producto producto = (Producto)context.getBean("producto");
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Sku: " + producto.getSku());
        System.out.println("Precio: " + producto.getPrecio());
        System.out.println("Cantidad: " + producto.getCantidad());

        System.out.println("Categorias: ");
        
        for(Categoria cat : producto.getCategoria()){
            System.out.println(cat.getNombre());
        }
    }
    
}
