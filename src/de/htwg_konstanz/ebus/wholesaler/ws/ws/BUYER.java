
package de.htwg_konstanz.ebus.wholesaler.ws.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}BUYER_ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}BUYER_NAME"/>
 *         &lt;element name="ADDRESS" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeADDRESS">
 *                 &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="buyer" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "buyerid",
    "buyername",
    "address"
})
@XmlRootElement(name = "BUYER")
public class BUYER {

    @XmlElement(name = "BUYER_ID")
    protected BUYERID buyerid;
    @XmlElement(name = "BUYER_NAME", required = true)
    protected String buyername;
    @XmlElement(name = "ADDRESS")
    protected BUYER.ADDRESS address;

    /**
     * Gets the value of the buyerid property.
     * 
     * @return
     *     possible object is
     *     {@link BUYERID }
     *     
     */
    public BUYERID getBUYERID() {
        return buyerid;
    }

    /**
     * Sets the value of the buyerid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUYERID }
     *     
     */
    public void setBUYERID(BUYERID value) {
        this.buyerid = value;
    }

    /**
     * Gets the value of the buyername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBUYERNAME() {
        return buyername;
    }

    /**
     * Sets the value of the buyername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBUYERNAME(String value) {
        this.buyername = value;
    }

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link BUYER.ADDRESS }
     *     
     */
    public BUYER.ADDRESS getADDRESS() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link BUYER.ADDRESS }
     *     
     */
    public void setADDRESS(BUYER.ADDRESS value) {
        this.address = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}typeADDRESS">
     *       &lt;attribute name="type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" fixed="buyer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ADDRESS
        extends TypeADDRESS
    {

        @XmlAttribute(name = "type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;

        /**
         * Gets the value of the type property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            if (type == null) {
                return "buyer";
            } else {
                return type;
            }
        }

        /**
         * Sets the value of the type property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
