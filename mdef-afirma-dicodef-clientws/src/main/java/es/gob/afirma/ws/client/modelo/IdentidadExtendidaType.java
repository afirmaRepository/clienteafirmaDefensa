//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.12 at 11:01:51 AM CET 
//


package es.gob.afirma.ws.client.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IdentidadExtendidaType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IdentidadExtendidaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UID" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}UIDType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Nombre" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}CaracteresMayuscula255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Apellido1" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}CaracteresMayuscula255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Apellido2" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}CaracteresMayuscula255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="NombreCompleto" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}NombreCompletoType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="DNI" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}DNIType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Mail" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}MailType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="NumeroEmpleado" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}NumeroEmpleadoType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Sexo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}SexoType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="FechaNacimiento" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}FechaNacimientoType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="SIPERDEFlogin" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IdentidadExtendidaType", propOrder = {
    "uid",
    "nombre",
    "apellido1",
    "apellido2",
    "nombreCompleto",
    "dni",
    "mail",
    "numeroEmpleado",
    "sexo",
    "fechaNacimiento",
    "siperdeFlogin"
})
public class IdentidadExtendidaType {

    @XmlElement(name = "UID")
    protected String uid;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Apellido1")
    protected String apellido1;
    @XmlElement(name = "Apellido2")
    protected String apellido2;
    @XmlElement(name = "NombreCompleto")
    protected String nombreCompleto;
    @XmlElement(name = "DNI")
    protected String dni;
    @XmlElement(name = "Mail")
    protected String mail;
    @XmlElement(name = "NumeroEmpleado")
    protected String numeroEmpleado;
    @XmlElement(name = "Sexo")
    protected String sexo;
    @XmlElement(name = "FechaNacimiento")
    protected String fechaNacimiento;
    @XmlElement(name = "SIPERDEFlogin")
    protected String siperdeFlogin;

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUID(String value) {
        this.uid = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the apellido1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido1() {
        return apellido1;
    }

    /**
     * Sets the value of the apellido1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido1(String value) {
        this.apellido1 = value;
    }

    /**
     * Gets the value of the apellido2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApellido2() {
        return apellido2;
    }

    /**
     * Sets the value of the apellido2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApellido2(String value) {
        this.apellido2 = value;
    }

    /**
     * Gets the value of the nombreCompleto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    /**
     * Sets the value of the nombreCompleto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreCompleto(String value) {
        this.nombreCompleto = value;
    }

    /**
     * Gets the value of the dni property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDNI() {
        return dni;
    }

    /**
     * Sets the value of the dni property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDNI(String value) {
        this.dni = value;
    }

    /**
     * Gets the value of the mail property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Sets the value of the mail property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Gets the value of the numeroEmpleado property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroEmpleado() {
        return numeroEmpleado;
    }

    /**
     * Sets the value of the numeroEmpleado property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroEmpleado(String value) {
        this.numeroEmpleado = value;
    }

    /**
     * Gets the value of the sexo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Sets the value of the sexo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

    /**
     * Gets the value of the fechaNacimiento property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * Sets the value of the fechaNacimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaNacimiento(String value) {
        this.fechaNacimiento = value;
    }

    /**
     * Gets the value of the siperdeFlogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSIPERDEFlogin() {
        return siperdeFlogin;
    }

    /**
     * Sets the value of the siperdeFlogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSIPERDEFlogin(String value) {
        this.siperdeFlogin = value;
    }

}
