
package de.htwg_konstanz.ebus.wholesaler.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for authentication_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="authentication_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="wholesalerName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wsUsername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="wsPassword" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "authentication_t", propOrder = {
    "wholesalerName",
    "wsUsername",
    "wsPassword"
})
public class AuthenticationT {

    @XmlElement(required = true)
    protected String wholesalerName;
    @XmlElement(required = true)
    protected String wsUsername;
    @XmlElement(required = true)
    protected String wsPassword;

    /**
     * Gets the value of the wholesalerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWholesalerName() {
        return wholesalerName;
    }

    /**
     * Sets the value of the wholesalerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWholesalerName(String value) {
        this.wholesalerName = value;
    }

    /**
     * Gets the value of the wsUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsUsername() {
        return wsUsername;
    }

    /**
     * Sets the value of the wsUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsUsername(String value) {
        this.wsUsername = value;
    }

    /**
     * Gets the value of the wsPassword property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWsPassword() {
        return wsPassword;
    }

    /**
     * Sets the value of the wsPassword property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWsPassword(String value) {
        this.wsPassword = value;
    }

}
