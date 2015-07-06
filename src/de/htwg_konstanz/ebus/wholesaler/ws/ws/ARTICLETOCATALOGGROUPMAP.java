
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ART_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CATALOG_GROUP_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ARTICLE_TO_CATALOGGROUP_MAP_ORDER" minOccurs="0"/>
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
    "artid",
    "cataloggroupid",
    "articletocataloggroupmaporder"
})
@XmlRootElement(name = "ARTICLE_TO_CATALOGGROUP_MAP")
public class ARTICLETOCATALOGGROUPMAP {

    @XmlElement(name = "ART_ID", required = true)
    protected String artid;
    @XmlElement(name = "CATALOG_GROUP_ID", required = true)
    protected String cataloggroupid;
    @XmlElement(name = "ARTICLE_TO_CATALOGGROUP_MAP_ORDER")
    protected BigInteger articletocataloggroupmaporder;

    /**
     * Gets the value of the artid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getARTID() {
        return artid;
    }

    /**
     * Sets the value of the artid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setARTID(String value) {
        this.artid = value;
    }

    /**
     * Gets the value of the cataloggroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCATALOGGROUPID() {
        return cataloggroupid;
    }

    /**
     * Sets the value of the cataloggroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCATALOGGROUPID(String value) {
        this.cataloggroupid = value;
    }

    /**
     * Gets the value of the articletocataloggroupmaporder property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getARTICLETOCATALOGGROUPMAPORDER() {
        return articletocataloggroupmaporder;
    }

    /**
     * Sets the value of the articletocataloggroupmaporder property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setARTICLETOCATALOGGROUPMAPORDER(BigInteger value) {
        this.articletocataloggroupmaporder = value;
    }

}
