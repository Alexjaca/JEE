
package com.formacionbdi.spring.di.inyeccionsimpleatributos.entity;

import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("producto")
public class Producto {
    
    @Value("Cámara Reflex T5 + Lente 18-55 + 75-300 Canon") // usando value
    private String nombre;
    private String sku;
    
    @Value("150000")
    private int precio;
    private int cantidad;
    
    @PostConstruct  // usando postconstruct
    public void init(){
        sku = "3871475";
        cantidad = 35;
        
    }
    
    
    private List<Categoria> categorias;

    
    public void setCategorias(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    @Autowired
    public Producto(List<Categoria> categorias) {
        this.categorias = categorias;
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<Categoria> getCategoria() {
        return categorias;
    }

    public void setCategoria(List<Categoria> categoria) {
        this.categorias = categoria;
    }


}
