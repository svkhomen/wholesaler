
package de.htwg_konstanz.ebus.wholesaler.ws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}HEADER"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}T_NEW_CATALOG"/>
 *       &lt;/sequence>
 *       &lt;attribute name="version" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}dtSTRING">
 *             &lt;maxLength value="7"/>
 *             &lt;enumeration value="1.01"/>
 *             &lt;enumeration value="1.2"/>
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
    "header",
    "tnewcatalog"
})
@XmlRootElement(name = "BMECAT")
public class BMECAT {

    @XmlElement(name = "HEADER", required = true)
    protected HEADER header;
    @XmlElement(name = "T_NEW_CATALOG", required = true)
    protected TNEWCATALOG tnewcatalog;
    @XmlAttribute(name = "version", required = true)
    protected String version;

    /**
     * Headerdaten werden durch katalogerzeugende Software generiert
     * 
     * @return
     *     possible object is
     *     {@link HEADER }
     *     
     */
    public HEADER getHEADER() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link HEADER }
     *     
     */
    public void setHEADER(HEADER value) {
        this.header = value;
    }

    /**
     * Gets the value of the tnewcatalog property.
     * 
     * @return
     *     possible object is
     *     {@link TNEWCATALOG }
     *     
     */
    public TNEWCATALOG getTNEWCATALOG() {
        return tnewcatalog;
    }

    /**
     * Sets the value of the tnewcatalog property.
     * 
     * @param value
     *     allowed object is
     *     {@link TNEWCATALOG }
     *     
     */
    public void setTNEWCATALOG(TNEWCATALOG value) {
        this.tnewcatalog = value;
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
