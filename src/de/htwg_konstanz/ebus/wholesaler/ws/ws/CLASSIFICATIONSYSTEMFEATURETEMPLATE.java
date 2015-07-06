
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FT_DESCR" minOccurs="0"/>
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
    "ftid",
    "ftname",
    "ftdescr"
})
@XmlRootElement(name = "CLASSIFICATION_SYSTEM_FEATURE_TEMPLATE")
public class CLASSIFICATIONSYSTEMFEATURETEMPLATE {

    @XmlElement(name = "FT_ID", required = true)
    protected String ftid;
    @XmlElement(name = "FT_NAME", required = true)
    protected String ftname;
    @XmlElement(name = "FT_DESCR")
    protected String ftdescr;

    /**
     * Gets the value of the ftid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTID() {
        return ftid;
    }

    /**
     * Sets the value of the ftid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTID(String value) {
        this.ftid = value;
    }

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
     * Gets the value of the ftdescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFTDESCR() {
        return ftdescr;
    }

    /**
     * Sets the value of the ftdescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFTDESCR(String value) {
        this.ftdescr = value;
    }

}
