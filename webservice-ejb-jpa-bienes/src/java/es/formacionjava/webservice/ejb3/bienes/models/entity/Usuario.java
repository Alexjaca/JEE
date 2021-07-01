
package es.formacionjava.webservice.ejb3.bienes.models.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {
    
    private static final long serialVersionUID = 1L;

    @Id
    private String login;
    
    private String contraseña;
    
    private int tipo_usu;
    
    private int cedula_emp;
    
    private int cod_status;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTipo_usu() {
        return tipo_usu;
    }

    public void setTipo_usu(int tipo_usu) {
        this.tipo_usu = tipo_usu;
    }

    public int getCedula_emp() {
        return cedula_emp;
    }

    public void setCedula_emp(int cedula_emp) {
        this.cedula_emp = cedula_emp;
    }

    public int getCod_status() {
        return cod_status;
    }

    public void setCod_status(int cod_status) {
        this.cod_status = cod_status;
    }
    

}
