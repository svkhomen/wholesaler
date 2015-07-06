
package de.htwg_konstanz.ebus.wholesaler.ws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ALLOWED_VALUE_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ALLOWED_VALUE_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ALLOWED_VALUE_DESCR" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "allowedvalueid",
    "allowedvaluename",
    "allowedvaluedescr"
})
@XmlRootElement(name = "ALLOWED_VALUE")
public class ALLOWEDVALUE {

    @XmlElement(name = "ALLOWED_VALUE_ID", required = true)
    protected String allowedvalueid;
    @XmlElement(name = "ALLOWED_VALUE_NAME", required = true)
    protected String allowedvaluename;
    @XmlElement(name = "ALLOWED_VALUE_DESCR")
    protected String allowedvaluedescr;

    /**
     * Gets the value of the allowedvalueid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWEDVALUEID() {
        return allowedvalueid;
    }

    /**
     * Sets the value of the allowedvalueid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWEDVALUEID(String value) {
        this.allowedvalueid = value;
    }

    /**
     * Gets the value of the allowedvaluename property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWEDVALUENAME() {
        return allowedvaluename;
    }

    /**
     * Sets the value of the allowedvaluename property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWEDVALUENAME(String value) {
        this.allowedvaluename = value;
    }

    /**
     * Gets the value of the allowedvaluedescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getALLOWEDVALUEDESCR() {
        return allowedvaluedescr;
    }

    /**
     * Sets the value of the allowedvaluedescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setALLOWEDVALUEDESCR(String value) {
        this.allowedvaluedescr = value;
    }

}
