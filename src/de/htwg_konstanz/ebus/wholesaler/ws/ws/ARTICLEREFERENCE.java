
package de.htwg_konstanz.ebus.wholesaler.ws.ws;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ART_ID_TO"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="sparepart"/>
 *             &lt;enumeration value="similar"/>
 *             &lt;enumeration value="followup"/>
 *             &lt;enumeration value="mandatory"/>
 *             &lt;enumeration value="select"/>
 *             &lt;enumeration value="others"/>
 *             &lt;enumeration value="accessories"/>
 *             &lt;enumeration value="diff_orderunit"/>
 *             &lt;enumeration value="consists_of"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="quantity" type="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}dtINTEGER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "artidto"
})
@XmlRootElement(name = "ARTICLE_REFERENCE")
public class ARTICLEREFERENCE {

    @XmlElement(name = "ART_ID_TO", required = true)
    protected String artidto;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "quantity")
    protected BigInteger quantity;

    /**
     * Gets the value of the artidto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTIDTO() {
        return artidto;
    }

    /**
     * Sets the value of the artidto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTIDTO(String value) {
        this.artidto = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
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

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

}
