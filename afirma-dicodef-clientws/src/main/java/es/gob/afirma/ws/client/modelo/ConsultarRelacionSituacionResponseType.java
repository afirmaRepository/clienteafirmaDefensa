//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.03.27 at 03:48:47 PM CEST 
//


package es.gob.afirma.ws.client.modelo;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConsultarRelacionSituacionResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ConsultarRelacionSituacionResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NumeroEmpleado" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}NumeroEmpleadoType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="RelacionCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="RelacionDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EmpleoCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EmpleoDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EjercitoCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EjercitoDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EscalaCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EscalaDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CuerpoEscalaCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CuerpoEscalaDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CuerpoCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="CuerpoDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EspecialidadCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EspecialidadDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EspecialidadComplementariaCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EspecialidadComplementariaDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="UnidadDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="OrganismoDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="OrganismoCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}OrganismoCodigoType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="SituacionCodigo" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="SituacionDescripcion" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *         &lt;element name="EstadoLogico" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}EstadoLogicoType" minOccurs="0" form="unqualified"/>
 *         &lt;element name="Empresa" type="{http://servicios.mdef.es/dicodef/consultarDICODEF.xsd}Caracteres255Type" minOccurs="0" form="unqualified"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConsultarRelacionSituacionResponseType", propOrder = {
    "numeroEmpleado",
    "relacionCodigo",
    "relacionDescripcion",
    "empleoCodigo",
    "empleoDescripcion",
    "ejercitoCodigo",
    "ejercitoDescripcion",
    "escalaCodigo",
    "escalaDescripcion",
    "cuerpoEscalaCodigo",
    "cuerpoEscalaDescripcion",
    "cuerpoCodigo",
    "cuerpoDescripcion",
    "especialidadCodigo",
    "especialidadDescripcion",
    "especialidadComplementariaCodigo",
    "especialidadComplementariaDescripcion",
    "unidadDescripcion",
    "organismoDescripcion",
    "organismoCodigo",
    "situacionCodigo",
    "situacionDescripcion",
    "estadoLogico",
    "empresa"
})
public class ConsultarRelacionSituacionResponseType {

    @XmlElement(name = "NumeroEmpleado")
    protected String numeroEmpleado;
    @XmlElement(name = "RelacionCodigo")
    protected String relacionCodigo;
    @XmlElement(name = "RelacionDescripcion")
    protected String relacionDescripcion;
    @XmlElement(name = "EmpleoCodigo")
    protected String empleoCodigo;
    @XmlElement(name = "EmpleoDescripcion")
    protected String empleoDescripcion;
    @XmlElement(name = "EjercitoCodigo")
    protected String ejercitoCodigo;
    @XmlElement(name = "EjercitoDescripcion")
    protected String ejercitoDescripcion;
    @XmlElement(name = "EscalaCodigo")
    protected String escalaCodigo;
    @XmlElement(name = "EscalaDescripcion")
    protected String escalaDescripcion;
    @XmlElement(name = "CuerpoEscalaCodigo")
    protected String cuerpoEscalaCodigo;
    @XmlElement(name = "CuerpoEscalaDescripcion")
    protected String cuerpoEscalaDescripcion;
    @XmlElement(name = "CuerpoCodigo")
    protected String cuerpoCodigo;
    @XmlElement(name = "CuerpoDescripcion")
    protected String cuerpoDescripcion;
    @XmlElement(name = "EspecialidadCodigo")
    protected String especialidadCodigo;
    @XmlElement(name = "EspecialidadDescripcion")
    protected String especialidadDescripcion;
    @XmlElement(name = "EspecialidadComplementariaCodigo")
    protected String especialidadComplementariaCodigo;
    @XmlElement(name = "EspecialidadComplementariaDescripcion")
    protected String especialidadComplementariaDescripcion;
    @XmlElement(name = "UnidadDescripcion")
    protected String unidadDescripcion;
    @XmlElement(name = "OrganismoDescripcion")
    protected String organismoDescripcion;
    @XmlElement(name = "OrganismoCodigo")
    protected String organismoCodigo;
    @XmlElement(name = "SituacionCodigo")
    protected String situacionCodigo;
    @XmlElement(name = "SituacionDescripcion")
    protected String situacionDescripcion;
    @XmlElement(name = "EstadoLogico")
    protected String estadoLogico;
    @XmlElement(name = "Empresa")
    protected String empresa;

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
     * Gets the value of the relacionCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelacionCodigo() {
        return relacionCodigo;
    }

    /**
     * Sets the value of the relacionCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelacionCodigo(String value) {
        this.relacionCodigo = value;
    }

    /**
     * Gets the value of the relacionDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelacionDescripcion() {
        return relacionDescripcion;
    }

    /**
     * Sets the value of the relacionDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelacionDescripcion(String value) {
        this.relacionDescripcion = value;
    }

    /**
     * Gets the value of the empleoCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpleoCodigo() {
        return empleoCodigo;
    }

    /**
     * Sets the value of the empleoCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpleoCodigo(String value) {
        this.empleoCodigo = value;
    }

    /**
     * Gets the value of the empleoDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpleoDescripcion() {
        return empleoDescripcion;
    }

    /**
     * Sets the value of the empleoDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpleoDescripcion(String value) {
        this.empleoDescripcion = value;
    }

    /**
     * Gets the value of the ejercitoCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjercitoCodigo() {
        return ejercitoCodigo;
    }

    /**
     * Sets the value of the ejercitoCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjercitoCodigo(String value) {
        this.ejercitoCodigo = value;
    }

    /**
     * Gets the value of the ejercitoDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEjercitoDescripcion() {
        return ejercitoDescripcion;
    }

    /**
     * Sets the value of the ejercitoDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEjercitoDescripcion(String value) {
        this.ejercitoDescripcion = value;
    }

    /**
     * Gets the value of the escalaCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalaCodigo() {
        return escalaCodigo;
    }

    /**
     * Sets the value of the escalaCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalaCodigo(String value) {
        this.escalaCodigo = value;
    }

    /**
     * Gets the value of the escalaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEscalaDescripcion() {
        return escalaDescripcion;
    }

    /**
     * Sets the value of the escalaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEscalaDescripcion(String value) {
        this.escalaDescripcion = value;
    }

    /**
     * Gets the value of the cuerpoEscalaCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuerpoEscalaCodigo() {
        return cuerpoEscalaCodigo;
    }

    /**
     * Sets the value of the cuerpoEscalaCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuerpoEscalaCodigo(String value) {
        this.cuerpoEscalaCodigo = value;
    }

    /**
     * Gets the value of the cuerpoEscalaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuerpoEscalaDescripcion() {
        return cuerpoEscalaDescripcion;
    }

    /**
     * Sets the value of the cuerpoEscalaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuerpoEscalaDescripcion(String value) {
        this.cuerpoEscalaDescripcion = value;
    }

    /**
     * Gets the value of the cuerpoCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuerpoCodigo() {
        return cuerpoCodigo;
    }

    /**
     * Sets the value of the cuerpoCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuerpoCodigo(String value) {
        this.cuerpoCodigo = value;
    }

    /**
     * Gets the value of the cuerpoDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCuerpoDescripcion() {
        return cuerpoDescripcion;
    }

    /**
     * Sets the value of the cuerpoDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCuerpoDescripcion(String value) {
        this.cuerpoDescripcion = value;
    }

    /**
     * Gets the value of the especialidadCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecialidadCodigo() {
        return especialidadCodigo;
    }

    /**
     * Sets the value of the especialidadCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecialidadCodigo(String value) {
        this.especialidadCodigo = value;
    }

    /**
     * Gets the value of the especialidadDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecialidadDescripcion() {
        return especialidadDescripcion;
    }

    /**
     * Sets the value of the especialidadDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecialidadDescripcion(String value) {
        this.especialidadDescripcion = value;
    }

    /**
     * Gets the value of the especialidadComplementariaCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecialidadComplementariaCodigo() {
        return especialidadComplementariaCodigo;
    }

    /**
     * Sets the value of the especialidadComplementariaCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecialidadComplementariaCodigo(String value) {
        this.especialidadComplementariaCodigo = value;
    }

    /**
     * Gets the value of the especialidadComplementariaDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEspecialidadComplementariaDescripcion() {
        return especialidadComplementariaDescripcion;
    }

    /**
     * Sets the value of the especialidadComplementariaDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEspecialidadComplementariaDescripcion(String value) {
        this.especialidadComplementariaDescripcion = value;
    }

    /**
     * Gets the value of the unidadDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadDescripcion() {
        return unidadDescripcion;
    }

    /**
     * Sets the value of the unidadDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadDescripcion(String value) {
        this.unidadDescripcion = value;
    }

    /**
     * Gets the value of the organismoDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismoDescripcion() {
        return organismoDescripcion;
    }

    /**
     * Sets the value of the organismoDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismoDescripcion(String value) {
        this.organismoDescripcion = value;
    }

    /**
     * Gets the value of the organismoCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganismoCodigo() {
        return organismoCodigo;
    }

    /**
     * Sets the value of the organismoCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganismoCodigo(String value) {
        this.organismoCodigo = value;
    }

    /**
     * Gets the value of the situacionCodigo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacionCodigo() {
        return situacionCodigo;
    }

    /**
     * Sets the value of the situacionCodigo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacionCodigo(String value) {
        this.situacionCodigo = value;
    }

    /**
     * Gets the value of the situacionDescripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacionDescripcion() {
        return situacionDescripcion;
    }

    /**
     * Sets the value of the situacionDescripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacionDescripcion(String value) {
        this.situacionDescripcion = value;
    }

    /**
     * Gets the value of the estadoLogico property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEstadoLogico() {
        return estadoLogico;
    }

    /**
     * Sets the value of the estadoLogico property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEstadoLogico(String value) {
        this.estadoLogico = value;
    }

    /**
     * Gets the value of the empresa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmpresa() {
        return empresa;
    }

    /**
     * Sets the value of the empresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmpresa(String value) {
        this.empresa = value;
    }

}
