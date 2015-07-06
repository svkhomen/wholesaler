
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}BMECAT"/>
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
    "bmecat"
})
@XmlRootElement(name = "ProductCatalogServiceResponse", namespace = "http://www.htwg-konstanz.de/ebsf/ws/product_catalog")
public class ProductCatalogServiceResponse {

    @XmlElement(name = "BMECAT", required = true)
    protected BMECAT bmecat;

    /**
     * Gets the value of the bmecat property.
     * 
     * @return
     *     possible object is
     *     {@link BMECAT }
     *     
     */
    public BMECAT getBMECAT() {
        return bmecat;
    }

    /**
     * Sets the value of the bmecat property.
     * 
     * @param value
     *     allowed object is
     *     {@link BMECAT }
     *     
     */
    public void setBMECAT(BMECAT value) {
        this.bmecat = value;
    }

}
