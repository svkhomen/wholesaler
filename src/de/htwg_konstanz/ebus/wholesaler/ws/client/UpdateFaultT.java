
package de.htwg_konstanz.ebus.wholesaler.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateFault_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateFault_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="authentivationFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processingFault" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateFault_t", propOrder = {
    "authentivationFault",
    "processingFault"
})
public class UpdateFaultT {

    protected String authentivationFault;
    protected String processingFault;

    /**
     * Gets the value of the authentivationFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthentivationFault() {
        return authentivationFault;
    }

    /**
     * Sets the value of the authentivationFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthentivationFault(String value) {
        this.authentivationFault = value;
    }

    /**
     * Gets the value of the processingFault property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessingFault() {
        return processingFault;
    }

    /**
     * Sets the value of the processingFault property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessingFault(String value) {
        this.processingFault = value;
    }

}
