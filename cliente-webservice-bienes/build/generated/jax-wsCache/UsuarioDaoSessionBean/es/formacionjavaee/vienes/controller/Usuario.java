
package es.formacionjavaee.vienes.controller;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para usuario complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="usuario"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="cedula_emp" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="cod_status" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="contraseña" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tipo_usu" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "usuario", propOrder = {
    "cedulaEmp",
    "codStatus",
    "contrase\u00f1a",
    "login",
    "tipoUsu"
})
public class Usuario {

    @XmlElement(name = "cedula_emp")
    protected int cedulaEmp;
    @XmlElement(name = "cod_status")
    protected int codStatus;
    protected String contraseña;
    protected String login;
    @XmlElement(name = "tipo_usu")
    protected int tipoUsu;

    /**
     * Obtiene el valor de la propiedad cedulaEmp.
     * 
     */
    public int getCedulaEmp() {
        return cedulaEmp;
    }

    /**
     * Define el valor de la propiedad cedulaEmp.
     * 
     */
    public void setCedulaEmp(int value) {
        this.cedulaEmp = value;
    }

    /**
     * Obtiene el valor de la propiedad codStatus.
     * 
     */
    public int getCodStatus() {
        return codStatus;
    }

    /**
     * Define el valor de la propiedad codStatus.
     * 
     */
    public void setCodStatus(int value) {
        this.codStatus = value;
    }

    /**
     * Obtiene el valor de la propiedad contraseña.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContraseña() {
        return contraseña;
    }

    /**
     * Define el valor de la propiedad contraseña.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContraseña(String value) {
        this.contraseña = value;
    }

    /**
     * Obtiene el valor de la propiedad login.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLogin(String value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad tipoUsu.
     * 
     */
    public int getTipoUsu() {
        return tipoUsu;
    }

    /**
     * Define el valor de la propiedad tipoUsu.
     * 
     */
    public void setTipoUsu(int value) {
        this.tipoUsu = value;
    }

}
