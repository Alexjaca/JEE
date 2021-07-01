
package models;

import java.io.Serializable;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "facturas")
public class Factura implements Serializable{
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "cliente") // opcional por que su nombre es igual
    private String cliente;
    
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "factura_id")
    private Set<Linea> lineas;

    public Factura() {
    }

    public Factura(String cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Set<Linea> getLineas() {
        return lineas;
    }

    public void setLineas(Set<Linea> lineas) {
        this.lineas = lineas;
    }
    
    
    
}
