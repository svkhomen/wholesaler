
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_UNIT" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_ORDER" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" default="free_entry">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="free_entry"/>
 *             &lt;enumeration value="defaults"/>
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
    "ftname",
    "ftunit",
    "ftorder"
})
@XmlRootElement(name = "FEATURE_TEMPLATE")
public class FEATURETEMPLATE {

    @XmlElement(name = "FT_NAME", required = true)
    protected String ftname;
    @XmlElement(name = "FT_UNIT")
    protected String ftunit;
    @XmlElement(name = "FT_ORDER")
    protected BigInteger ftorder;
    @XmlAttribute(name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;

    /**
     * Gets the value of the ftname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTNAME() {
        return ftname;
    }

    /**
     * Sets the value of the ftname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTNAME(String value) {
        this.ftname = value;
    }

    /**
     * Gets the value of the ftunit property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTUNIT() {
        return ftunit;
    }

    /**
     * Sets the value of the ftunit property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTUNIT(String value) {
        this.ftunit = value;
    }

    /**
     * Gets the value of the ftorder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFTORDER() {
        return ftorder;
    }

    /**
     * Sets the value of the ftorder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFTORDER(BigInteger value) {
        this.ftorder = value;
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
        if (type == null) {
            return "free_entry";
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
