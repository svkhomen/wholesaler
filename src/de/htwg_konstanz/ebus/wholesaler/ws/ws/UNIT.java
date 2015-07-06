
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}UNIT_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}UNIT_NAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}UNIT_DESCR" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="system">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}dtSTRING">
 *             &lt;maxLength value="20"/>
 *             &lt;minLength value="1"/>
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
    "unitid",
    "unitname",
    "unitdescr"
})
@XmlRootElement(name = "UNIT")
public class UNIT {

    @XmlElement(name = "UNIT_ID", required = true)
    protected String unitid;
    @XmlElement(name = "UNIT_NAME")
    protected String unitname;
    @XmlElement(name = "UNIT_DESCR")
    protected String unitdescr;
    @XmlAttribute(name = "system")
    protected String system;

    /**
     * Gets the value of the unitid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITID() {
        return unitid;
    }

    /**
     * Sets the value of the unitid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITID(String value) {
        this.unitid = value;
    }

    /**
     * Gets the value of the unitname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITNAME() {
        return unitname;
    }

    /**
     * Sets the value of the unitname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITNAME(String value) {
        this.unitname = value;
    }

    /**
     * Gets the value of the unitdescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUNITDESCR() {
        return unitdescr;
    }

    /**
     * Sets the value of the unitdescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUNITDESCR(String value) {
        this.unitdescr = value;
    }

    /**
     * Gets the value of the system property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSystem() {
        return system;
    }

    /**
     * Sets the value of the system property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSystem(String value) {
        this.system = value;
    }

}
