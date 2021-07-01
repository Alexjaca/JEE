
package util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class ConexionJdbcDataSource {
    
    private Connection conn;

    public ConexionJdbcDataSource() throws SQLException {
        conectar();
        
    }
    
    private void conectar() throws SQLException{
        try {
            Context contexto = new InitialContext();
            DataSource ds = (DataSource) contexto.lookup("jdbc/javaCatalogo");
            conn = ds.getConnection();
        } catch (NamingException e) {
            Logger.getLogger(ConexionJdbcDataSource.class.getName()).log(Level.SEVERE, "Error NamingException");
        } catch (SQLException e) {
            Logger.getLogger(ConexionJdbcDataSource.class.getName()).log(Level.SEVERE, "Error en la Base de Datos");
        }
    }
    
    public Connection getConnection(){
        return conn;
    }
    
    
}
