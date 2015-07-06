
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FVALUE"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}SUPPLIER_AID_SUPPLEMENT"/>
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
    "fvalue",
    "supplieraidsupplement"
})
@XmlRootElement(name = "VARIANT")
public class VARIANT {

    @XmlElement(name = "FVALUE", required = true)
    protected String fvalue;
    @XmlElement(name = "SUPPLIER_AID_SUPPLEMENT", required = true)
    protected String supplieraidsupplement;

    /**
     * Gets the value of the fvalue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFVALUE() {
        return fvalue;
    }

    /**
     * Sets the value of the fvalue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFVALUE(String value) {
        this.fvalue = value;
    }

    /**
     * Gets the value of the supplieraidsupplement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSUPPLIERAIDSUPPLEMENT() {
        return supplieraidsupplement;
    }

    /**
     * Sets the value of the supplieraidsupplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSUPPLIERAIDSUPPLEMENT(String value) {
        this.supplieraidsupplement = value;
    }

}
