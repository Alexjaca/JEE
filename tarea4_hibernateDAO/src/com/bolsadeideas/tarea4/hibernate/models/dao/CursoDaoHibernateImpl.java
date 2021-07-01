/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bolsadeideas.tarea4.hibernate.models.dao;

import com.bolsadeideas.tarea4.hibernate.models.entity.Curso;
import com.bolsadeideas.tarea4.hibernate.util.HibernateUtil;
import java.util.List;
import org.hibernate.Transaction;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author Andrés Guzmán
 */
public class CursoDaoHibernateImpl implements ICursoDao {

    public Curso findById(Integer id) {

        SessionFactory sessions = HibernateUtil.getSessionFactory();
        Session session = sessions.openSession();

        Curso curso = null;
        Transaction tx = null;

        try {
            tx = session.beginTransaction();

            curso = (Curso) session.load(Curso.class, id);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            //session.close();
        }
        return curso;
    }

    public List<Curso> findAll() {

        SessionFactory sessions = HibernateUtil.getSessionFactory();
        Session session = sessions.openSession();
        List<Curso> cursos = null;
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("from Curso");
            cursos = query.list();
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
        return cursos;
    }

    public void save(Curso curso) {
        SessionFactory sessions = HibernateUtil.getSessionFactory();
        Session session = sessions.openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(curso);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public void delete(Curso curso) {
        SessionFactory sessions = HibernateUtil.getSessionFactory();
        Session session = sessions.openSession();

        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(curso);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
