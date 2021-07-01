package com.bolsadeideas.tarea4.hibernate.models.dao;

import com.bolsadeideas.tarea4.hibernate.models.entity.Curso;
import java.util.List;

public interface ICursoDao {

    public Curso findById(Integer id);

    public List<Curso> findAll();

    public void save(Curso curso);

    public void delete(Curso curso);
}
