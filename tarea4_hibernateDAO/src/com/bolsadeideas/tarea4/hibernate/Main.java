/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolsadeideas.tarea4.hibernate;

import com.bolsadeideas.tarea4.hibernate.models.dao.CursoDaoHibernateImpl;
import com.bolsadeideas.tarea4.hibernate.models.dao.ICursoDao;
import com.bolsadeideas.tarea4.hibernate.models.entity.Curso;
import com.bolsadeideas.tarea4.hibernate.util.CompruebaDatosDB;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creamos y configuramos la tabla de la base de datos.
        CompruebaDatosDB.droptable("drop table cursos");
        CompruebaDatosDB.setup("create table cursos ( id int, nombre VARCHAR(80), fecha_inicio date)");

        // Creamos el objeto Dao y asignamos el tipo hacia su interface.
        ICursoDao cursoDao = new CursoDaoHibernateImpl();

        Calendar calendar = new GregorianCalendar(2016, 0, 31);

        // Ejecutamos el método save del DAO para agregar un objeto curso
        System.out.println("Ejecutamos el método save del DAO....");
        Curso curso1 = new Curso();
        curso1.setNombre("Curso Spring Framework 4");
        curso1.setFechaInicio(calendar.getTime());
        cursoDao.save(curso1);

        Curso curso2 = new Curso();
        curso2.setNombre("Curso Java EE7 - JSF2 EJB3 JPA2");
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, 1);
        calendar.set(Calendar.DAY_OF_MONTH, 29);
        curso2.setFechaInicio(calendar.getTime());
        cursoDao.save(curso2);
        
        Curso curso3 = new Curso();
        curso3.setNombre("Curso Java EE7 Y Framework MVC");
        calendar.set(Calendar.YEAR, 2016);
        calendar.set(Calendar.MONTH, 2);
        calendar.set(Calendar.DAY_OF_MONTH, 1);
        curso3.setFechaInicio(calendar.getTime());
        cursoDao.save(curso3);

        // Ejecutamos el método findById del DAO para obtener un curso
        System.out.println("Ejecutamos el método findById del DAO...");
        Curso cursoObtenido = cursoDao.findById(curso1.getId());
        System.out.println("Nombre del curso encontrado = " + cursoObtenido.getNombre());

        // Ejecutamos el método findById del DAO para modificar el curso uno.
        System.out.println("Ejecutamos el método findById del DAO...");
        curso1.setNombre("Curso sobre Spring Web MVC");
        cursoDao.save(curso1);

        // Ejecutamos el método findAll del Dao
        System.out.println("Ejecutamos el método findAll del Dao...");
        List<Curso> cursoList = cursoDao.findAll();
        System.out.println("Número de cursos registrados = " + cursoList.size());

        // Desplegamos el listado de cursos registrados
        CompruebaDatosDB.checkData("select id, nombre, fecha_inicio from cursos");
        CompruebaDatosDB.close();
    }

}
