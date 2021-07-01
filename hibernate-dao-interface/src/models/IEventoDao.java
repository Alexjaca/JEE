
package models;

import java.util.List;


public interface IEventoDao {
    
    public Evento findById(Integer id);
    
    public List<Evento> findAll();
    
    public void save (Evento evento);
    
    public void delete (Evento evento);
  
}
