
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_FULLNAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_VERSION" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_DESCR" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_LEVELS" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_LEVEL_NAMES" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}ALLOWED_VALUES" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}UNITS" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_FEATURE_TEMPLATES" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_GROUPS"/>
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
    "classificationsystemname",
    "classificationsystemfullname",
    "classificationsystemversion",
    "classificationsystemdescr",
    "classificationsystemlevels",
    "classificationsystemlevelnames",
    "allowedvalues",
    "units",
    "classificationsystemfeaturetemplates",
    "classificationgroups"
})
@XmlRootElement(name = "CLASSIFICATION_SYSTEM")
public class CLASSIFICATIONSYSTEM {

    @XmlElement(name = "CLASSIFICATION_SYSTEM_NAME", required = true)
    protected String classificationsystemname;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_FULLNAME")
    protected String classificationsystemfullname;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_VERSION")
    protected String classificationsystemversion;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_DESCR")
    protected String classificationsystemdescr;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_LEVELS")
    protected BigInteger classificationsystemlevels;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_LEVEL_NAMES")
    protected CLASSIFICATIONSYSTEMLEVELNAMES classificationsystemlevelnames;
    @XmlElement(name = "ALLOWED_VALUES")
    protected ALLOWEDVALUES allowedvalues;
    @XmlElement(name = "UNITS")
    protected UNITS units;
    @XmlElement(name = "CLASSIFICATION_SYSTEM_FEATURE_TEMPLATES")
    protected CLASSIFICATIONSYSTEMFEATURETEMPLATES classificationsystemfeaturetemplates;
    @XmlElement(name = "CLASSIFICATION_GROUPS", required = true)
    protected CLASSIFICATIONGROUPS classificationgroups;

    /**
     * Gets the value of the classificationsystemname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONSYSTEMNAME() {
        return classificationsystemname;
    }

    /**
     * Sets the value of the classificationsystemname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONSYSTEMNAME(String value) {
        this.classificationsystemname = value;
    }

    /**
     * Gets the value of the classificationsystemfullname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONSYSTEMFULLNAME() {
        return classificationsystemfullname;
    }

    /**
     * Sets the value of the classificationsystemfullname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONSYSTEMFULLNAME(String value) {
        this.classificationsystemfullname = value;
    }

    /**
     * Gets the value of the classificationsystemversion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONSYSTEMVERSION() {
        return classificationsystemversion;
    }

    /**
     * Sets the value of the classificationsystemversion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONSYSTEMVERSION(String value) {
        this.classificationsystemversion = value;
    }

    /**
     * Gets the value of the classificationsystemdescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCLASSIFICATIONSYSTEMDESCR() {
        return classificationsystemdescr;
    }

    /**
     * Sets the value of the classificationsystemdescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCLASSIFICATIONSYSTEMDESCR(String value) {
        this.classificationsystemdescr = value;
    }

    /**
     * Gets the value of the classificationsystemlevels property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCLASSIFICATIONSYSTEMLEVELS() {
        return classificationsystemlevels;
    }

    /**
     * Sets the value of the classificationsystemlevels property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCLASSIFICATIONSYSTEMLEVELS(BigInteger value) {
        this.classificationsystemlevels = value;
    }

    /**
     * Gets the value of the classificationsystemlevelnames property.
     * 
     * @return
     *     possible object is
     *     {@link CLASSIFICATIONSYSTEMLEVELNAMES }
     *     
     */
    public CLASSIFICATIONSYSTEMLEVELNAMES getCLASSIFICATIONSYSTEMLEVELNAMES() {
        return classificationsystemlevelnames;
    }

    /**
     * Sets the value of the classificationsystemlevelnames property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASSIFICATIONSYSTEMLEVELNAMES }
     *     
     */
    public void setCLASSIFICATIONSYSTEMLEVELNAMES(CLASSIFICATIONSYSTEMLEVELNAMES value) {
        this.classificationsystemlevelnames = value;
    }

    /**
     * Gets the value of the allowedvalues property.
     * 
     * @return
     *     possible object is
     *     {@link ALLOWEDVALUES }
     *     
     */
    public ALLOWEDVALUES getALLOWEDVALUES() {
        return allowedvalues;
    }

    /**
     * Sets the value of the allowedvalues property.
     * 
     * @param value
     *     allowed object is
     *     {@link ALLOWEDVALUES }
     *     
     */
    public void setALLOWEDVALUES(ALLOWEDVALUES value) {
        this.allowedvalues = value;
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link UNITS }
     *     
     */
    public UNITS getUNITS() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UNITS }
     *     
     */
    public void setUNITS(UNITS value) {
        this.units = value;
    }

    /**
     * Gets the value of the classificationsystemfeaturetemplates property.
     * 
     * @return
     *     possible object is
     *     {@link CLASSIFICATIONSYSTEMFEATURETEMPLATES }
     *     
     */
    public CLASSIFICATIONSYSTEMFEATURETEMPLATES getCLASSIFICATIONSYSTEMFEATURETEMPLATES() {
        return classificationsystemfeaturetemplates;
    }

    /**
     * Sets the value of the classificationsystemfeaturetemplates property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASSIFICATIONSYSTEMFEATURETEMPLATES }
     *     
     */
    public void setCLASSIFICATIONSYSTEMFEATURETEMPLATES(CLASSIFICATIONSYSTEMFEATURETEMPLATES value) {
        this.classificationsystemfeaturetemplates = value;
    }

    /**
     * Gets the value of the classificationgroups property.
     * 
     * @return
     *     possible object is
     *     {@link CLASSIFICATIONGROUPS }
     *     
     */
    public CLASSIFICATIONGROUPS getCLASSIFICATIONGROUPS() {
        return classificationgroups;
    }

    /**
     * Sets the value of the classificationgroups property.
     * 
     * @param value
     *     allowed object is
     *     {@link CLASSIFICATIONGROUPS }
     *     
     */
    public void setCLASSIFICATIONGROUPS(CLASSIFICATIONGROUPS value) {
        this.classificationgroups = value;
    }

}
