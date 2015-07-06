
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_GROUP_ID"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_GROUP_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_GROUP_DESCR" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_GROUP_SYNONYMS" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_GROUP_FEATURE_TEMPLATES" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_GROUP_PARENT_ID" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="type" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="node"/>
 *             &lt;enumeration value="leaf"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="level" type="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}dtINTEGER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "classificationgroupid",
    "classificationgroupname",
    "classificationgroupdescr",
    "classificationgroupsynonyms",
    "classificationgroupfeaturetemplates",
    "classificationgroupparentid"
})
@XmlRootElement(name = "CLASSIFICATION_GROUP")
public class CLASSIFICATIONGROUP {

    @XmlElement(name = "CLASSIFICATION_GROUP_ID", required = true)
    protected String classificationgroupid;
    @XmlElement(name = "CLASSIFICATION_GROUP_NAME", required = true)
    protected String classificationgroupname;
    @XmlElement(name = "CLASSIFICATION_GROUP_DESCR")
    protected String classificationgroupdescr;
    @XmlElement(name = "CLASSIFICATION_GROUP_SYNONYMS")
    protected CLASSIFICATIONGROUPSYNONYMS classificationgroupsynonyms;
    @XmlElement(name = "CLASSIFICATION_GROUP_FEATURE_TEMPLATES")
    protected CLASSIFICATIONGROUPFEATURETEMPLATES classificationgroupfeaturetemplates;
    @XmlElement(name = "CLASSIFICATION_GROUP_PARENT_ID")
    protected String classificationgroupparentid;
    @XmlAttribute(name = "type", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
    @XmlAttribute(name = "level")
    protected BigInteger level;

    /**
     * Gets the value of the classificationgroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONGROUPID() {
        return classificationgroupid;
    }

    /**
     * Sets the value of the classificationgroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONGROUPID(String value) {
        this.classificationgroupid = value;
    }

    /**
     * Gets the value of the classificationgroupname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONGROUPNAME() {
        return classificationgroupname;
    }

    /**
     * Sets the value of the classificationgroupname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONGROUPNAME(String value) {
        this.classificationgroupname = value;
    }

    /**
     * Gets the value of the classificationgroupdescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONGROUPDESCR() {
        return classificationgroupdescr;
    }

    /**
     * Sets the value of the classificationgroupdescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONGROUPDESCR(String value) {
        this.classificationgroupdescr = value;
    }

    /**
     * Gets the value of the classificationgroupsynonyms property.
     * 
     * @return
     *     possible object is
     *     {@link CLASSIFICATIONGROUPSYNONYMS }
     *     
     */
    public CLASSIFICATIONGROUPSYNONYMS getCLASSIFICATIONGROUPSYNONYMS() {
        return classificationgroupsynonyms;
    }

    /**
     * Sets the value of the classificationgroupsynonyms property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASSIFICATIONGROUPSYNONYMS }
     *     
     */
    public void setCLASSIFICATIONGROUPSYNONYMS(CLASSIFICATIONGROUPSYNONYMS value) {
        this.classificationgroupsynonyms = value;
    }

    /**
     * Gets the value of the classificationgroupfeaturetemplates property.
     * 
     * @return
     *     possible object is
     *     {@link CLASSIFICATIONGROUPFEATURETEMPLATES }
     *     
     */
    public CLASSIFICATIONGROUPFEATURETEMPLATES getCLASSIFICATIONGROUPFEATURETEMPLATES() {
        return classificationgroupfeaturetemplates;
    }

    /**
     * Sets the value of the classificationgroupfeaturetemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASSIFICATIONGROUPFEATURETEMPLATES }
     *     
     */
    public void setCLASSIFICATIONGROUPFEATURETEMPLATES(CLASSIFICATIONGROUPFEATURETEMPLATES value) {
        this.classificationgroupfeaturetemplates = value;
    }

    /**
     * Gets the value of the classificationgroupparentid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONGROUPPARENTID() {
        return classificationgroupparentid;
    }

    /**
     * Sets the value of the classificationgroupparentid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONGROUPPARENTID(String value) {
        this.classificationgroupparentid = value;
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
     * Gets the value of the level property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getLevel() {
        return level;
    }

    /**
     * Sets the value of the level property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setLevel(BigInteger value) {
        this.level = value;
    }

}
