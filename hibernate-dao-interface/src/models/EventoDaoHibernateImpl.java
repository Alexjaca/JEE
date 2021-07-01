
package models;

import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.HibernateUtil;


public class EventoDaoHibernateImpl implements IEventoDao{

    @Override
    public Evento findById(Integer id) {
       
        SessionFactory sessions = HibernateUtil.getSessionFactory();
        Session session = sessions.openSession();
        
        Evento evento = null;
        Transaction tx = null;
        
        try {
            tx = session.beginTransaction();
            
            evento = (Evento) session.get(Evento.class, id);
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null){
                tx.rollback();
            }
        }finally{
            session.close();           
        }
        return evento;
    }

    @Override
    public List<Evento> findAll() {
       SessionFactory sessions = HibernateUtil.getSessionFactory();
       Session session = sessions.openSession();
       List<Evento> eventos = null;
       Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Query query = session.createQuery("from Evento");
            eventos = query.list();
            tx.commit();
        } catch (Exception e) {
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        return eventos;
    }

    @Override
    public void save(Evento evento) {
       SessionFactory sessions = HibernateUtil.getSessionFactory();
       Session session = sessions.openSession();
 
       Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.saveOrUpdate(evento);
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
    }
       
   
    @Override
    public void delete(Evento evento) {
        
        SessionFactory sessions = HibernateUtil.getSessionFactory();
       Session session = sessions.openSession();
 
       Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.delete(evento);
            tx.commit();
        } catch (HibernateException e) {
            if(tx != null){
                tx.rollback();
            }
            e.printStackTrace();
        }finally{
            session.close();
        }
        
    }
    
}
