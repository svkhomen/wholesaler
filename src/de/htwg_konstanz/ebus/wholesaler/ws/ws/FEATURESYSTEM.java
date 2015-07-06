
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FEATURE_SYSTEM_NAME"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FEATURE_SYSTEM_DESCR" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}FEATURE_GROUP" maxOccurs="unbounded"/>
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
    "featuresystemname",
    "featuresystemdescr",
    "featuregroup"
})
@XmlRootElement(name = "FEATURE_SYSTEM")
public class FEATURESYSTEM {

    @XmlElement(name = "FEATURE_SYSTEM_NAME", required = true)
    protected String featuresystemname;
    @XmlElement(name = "FEATURE_SYSTEM_DESCR")
    protected String featuresystemdescr;
    @XmlElement(name = "FEATURE_GROUP", required = true)
    protected List<FEATUREGROUP> featuregroup;

    /**
     * Gets the value of the featuresystemname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEATURESYSTEMNAME() {
        return featuresystemname;
    }

    /**
     * Sets the value of the featuresystemname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEATURESYSTEMNAME(String value) {
        this.featuresystemname = value;
    }

    /**
     * Gets the value of the featuresystemdescr property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFEATURESYSTEMDESCR() {
        return featuresystemdescr;
    }

    /**
     * Sets the value of the featuresystemdescr property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFEATURESYSTEMDESCR(String value) {
        this.featuresystemdescr = value;
    }

    /**
     * Gets the value of the featuregroup property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the featuregroup property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFEATUREGROUP().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FEATUREGROUP }
     * 
     * 
     */
    public List<FEATUREGROUP> getFEATUREGROUP() {
        if (featuregroup == null) {
            featuregroup = new ArrayList<FEATUREGROUP>();
        }
        return this.featuregroup;
    }

}
