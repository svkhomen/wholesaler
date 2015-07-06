
package de.htwg_konstanz.ebus.wholesaler.ws.ws;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}REFERENCE_FEATURE_SYSTEM_NAME" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}REFERENCE_FEATURE_GROUP_ID"/>
 *           &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}REFERENCE_FEATURE_GROUP_NAME"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FEATURE" maxOccurs="unbounded" minOccurs="0"/>
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
    "referencefeaturesystemname",
    "referencefeaturegroupid",
    "referencefeaturegroupname",
    "feature"
})
@XmlRootElement(name = "ARTICLE_FEATURES")
public class ARTICLEFEATURES {

    @XmlElement(name = "REFERENCE_FEATURE_SYSTEM_NAME")
    protected String referencefeaturesystemname;
    @XmlElement(name = "REFERENCE_FEATURE_GROUP_ID")
    protected String referencefeaturegroupid;
    @XmlElement(name = "REFERENCE_FEATURE_GROUP_NAME")
    protected String referencefeaturegroupname;
    @XmlElement(name = "FEATURE")
    protected List<FEATURE> feature;

    /**
     * Gets the value of the referencefeaturesystemname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEFEATURESYSTEMNAME() {
        return referencefeaturesystemname;
    }

    /**
     * Sets the value of the referencefeaturesystemname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEFEATURESYSTEMNAME(String value) {
        this.referencefeaturesystemname = value;
    }

    /**
     * Gets the value of the referencefeaturegroupid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEFEATUREGROUPID() {
        return referencefeaturegroupid;
    }

    /**
     * Sets the value of the referencefeaturegroupid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEFEATUREGROUPID(String value) {
        this.referencefeaturegroupid = value;
    }

    /**
     * Gets the value of the referencefeaturegroupname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getREFERENCEFEATUREGROUPNAME() {
        return referencefeaturegroupname;
    }

    /**
     * Sets the value of the referencefeaturegroupname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setREFERENCEFEATUREGROUPNAME(String value) {
        this.referencefeaturegroupname = value;
    }

    /**
     * Gets the value of the feature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the feature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEATURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEATURE }
     * 
     * 
     */
    public List<FEATURE> getFEATURE() {
        if (feature == null) {
            feature = new ArrayList<FEATURE>();
        }
        return this.feature;
    }

}
