
package de.htwg_konstanz.ebus.wholesaler.ws.ws;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_IDREF"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_MANDATORY"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_DATATYPE"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_UNIT" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_ORDER" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_ALLOWED_VALUES" minOccurs="0"/>
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
    "ftidref",
    "ftmandatory",
    "ftdatatype",
    "ftunit",
    "ftorder",
    "ftallowedvalues"
})
@XmlRootElement(name = "CLASSIFICATION_GROUP_FEATURE_TEMPLATE")
public class CLASSIFICATIONGROUPFEATURETEMPLATE {

    @XmlElement(name = "FT_IDREF", required = true)
    protected String ftidref;
    @XmlElement(name = "FT_MANDATORY", required = true)
    protected String ftmandatory;
    @XmlElement(name = "FT_DATATYPE", required = true)
    protected String ftdatatype;
    @XmlElement(name = "FT_UNIT")
    protected String ftunit;
    @XmlElement(name = "FT_ORDER")
    protected BigInteger ftorder;
    @XmlElement(name = "FT_ALLOWED_VALUES")
    protected FTALLOWEDVALUES ftallowedvalues;

    /**
     * Gets the value of the ftidref property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTIDREF() {
        return ftidref;
    }

    /**
     * Sets the value of the ftidref property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTIDREF(String value) {
        this.ftidref = value;
    }

    /**
     * Gets the value of the ftmandatory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTMANDATORY() {
        return ftmandatory;
    }

    /**
     * Sets the value of the ftmandatory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTMANDATORY(String value) {
        this.ftmandatory = value;
    }

    /**
     * Gets the value of the ftdatatype property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTDATATYPE() {
        return ftdatatype;
    }

    /**
     * Sets the value of the ftdatatype property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTDATATYPE(String value) {
        this.ftdatatype = value;
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
     * Gets the value of the ftallowedvalues property.
     * 
     * @return
     *     possible object is
     *     {@link FTALLOWEDVALUES }
     *     
     */
    public FTALLOWEDVALUES getFTALLOWEDVALUES() {
        return ftallowedvalues;
    }

    /**
     * Sets the value of the ftallowedvalues property.
     * 
     * @param value
     *     allowed object is
     *     {@link FTALLOWEDVALUES }
     *     
     */
    public void setFTALLOWEDVALUES(FTALLOWEDVALUES value) {
        this.ftallowedvalues = value;
    }

}
