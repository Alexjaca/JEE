

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import models.Evento;
import models.EventoDaoHibernateImpl;
import models.IEventoDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import util.CompruebaDatosDB;
import util.HibernateUtil;


public class Main {
    

    public static void main(String[] args) {
        // Creamos y configuramos la tabla de la base de datos.
        
        CompruebaDatosDB.droptable("drop table eventos");
        CompruebaDatosDB.setup("create table eventos (id int NOT NULL GENERATED ALWAYS AS IDENTITY,descripcion varchar(40))");

        // Creamos el SessionFactory y el objeto de Session Hibernate
        IEventoDao eventoDao = new EventoDaoHibernateImpl();

        // ejecutamos el metodo save del DAO para agregar
        System.out.println("Ejecutamos el Metodo Save del");
        Evento evento1 = new Evento();
        evento1.setDescripcion("Curso de Java");
        eventoDao.save(evento1);
        
        Evento evento2 = new Evento();
        evento2.setDescripcion("Aprendiendo Hibernate");
        eventoDao.save(evento2);
      
        // Ejecutamos el metodo FindById del Dao para obtener un evento
        System.out.println("Ejecutamos el metodo finById para obtener un evento");
        Evento eventoObtenido = eventoDao.findById(evento1.getId());
        System.out.println("Nombre del evento encontrado =" + eventoObtenido.getDescripcion());
        
        // Ejecutamos el metodo FindById del Dao para modificar un evento
        System.out.println("Ejecutamos el metodo FindById del Dao para modificar un evento");
        evento1.setDescripcion("Conferencia de Spring");
        eventoDao.save(evento1);
        
        //Ejecutamos el metodo findAll del Dao
        System.out.println("Ejecutamos el metodo findAll del Dao");
        List<Evento> eventoList = eventoDao.findAll();
        System.out.println("Numero de Eventos registrados =" + eventoList.size());
        
        // Desplegamos el listado de cursos registrados
        CompruebaDatosDB.checkData("select * from eventos");
        CompruebaDatosDB.close();
    }

}
