
package eu.heliovo.dpas.ie.services.hqi.service.net.ivoa.xml.votable.v1;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.ivoa.net/xml/VOTable/v1.1}DESCRIPTION" minOccurs="0"/>
 *         &lt;element ref="{http://www.ivoa.net/xml/VOTable/v1.1}DEFINITIONS" minOccurs="0"/>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{http://www.ivoa.net/xml/VOTable/v1.1}COOSYS"/>
 *           &lt;element ref="{http://www.ivoa.net/xml/VOTable/v1.1}PARAM"/>
 *           &lt;element ref="{http://www.ivoa.net/xml/VOTable/v1.1}INFO"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.ivoa.net/xml/VOTable/v1.1}RESOURCE" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="version">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="1.1"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "description",
    "definitions",
    "coosysOrPARAMOrINFO",
    "resource"
})
@XmlRootElement(name = "VOTABLE")
public class VOTABLE {

    @XmlElement(name = "DESCRIPTION")
    protected AnyTEXT description;
    @XmlElement(name = "DEFINITIONS")
    protected DEFINITIONS definitions;
    @XmlElements({
        @XmlElement(name = "COOSYS", type = COOSYS.class),
        @XmlElement(name = "INFO", type = INFO.class),
        @XmlElement(name = "PARAM", type = PARAM.class)
    })
    protected List<Object> coosysOrPARAMOrINFO;
    @XmlElement(name = "RESOURCE")
    protected List<RESOURCE> resource;
    @XmlAttribute(name = "ID")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "version")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String version;

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link AnyTEXT }
     *     
     */
    public AnyTEXT getDESCRIPTION() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link AnyTEXT }
     *     
     */
    public void setDESCRIPTION(AnyTEXT value) {
        this.description = value;
    }

    /**
     * Gets the value of the definitions property.
     * 
     * @return
     *     possible object is
     *     {@link DEFINITIONS }
     *     
     */
    public DEFINITIONS getDEFINITIONS() {
        return definitions;
    }

    /**
     * Sets the value of the definitions property.
     * 
     * @param value
     *     allowed object is
     *     {@link DEFINITIONS }
     *     
     */
    public void setDEFINITIONS(DEFINITIONS value) {
        this.definitions = value;
    }

    /**
     * Gets the value of the coosysOrPARAMOrINFO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the coosysOrPARAMOrINFO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCOOSYSOrPARAMOrINFO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link COOSYS }
     * {@link INFO }
     * {@link PARAM }
     * 
     * 
     */
    public List<Object> getCOOSYSOrPARAMOrINFO() {
        if (coosysOrPARAMOrINFO == null) {
            coosysOrPARAMOrINFO = new ArrayList<Object>();
        }
        return this.coosysOrPARAMOrINFO;
    }

    /**
     * Gets the value of the resource property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resource property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRESOURCE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RESOURCE }
     * 
     * 
     */
    public List<RESOURCE> getRESOURCE() {
        if (resource == null) {
            resource = new ArrayList<RESOURCE>();
        }
        return this.resource;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

}
