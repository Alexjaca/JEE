/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolsadeideas.tarea4.hibernate.models.entity;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Andrés Guzmán
 */
public class Curso implements Serializable {

    private Integer id;
    private String nombre;
    private Date fechaInicio;

    public Curso() {

    }

    public Curso(String nombre) {
        this.nombre = nombre;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
