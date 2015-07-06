
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}GROUP_SYSTEM_ID" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}GROUP_SYSTEM_NAME" minOccurs="0"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CATALOG_STRUCTURE" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}GROUP_SYSTEM_DESCRIPTION" minOccurs="0"/>
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
    "groupsystemid",
    "groupsystemname",
    "catalogstructure",
    "groupsystemdescription"
})
@XmlRootElement(name = "CATALOG_GROUP_SYSTEM")
public class CATALOGGROUPSYSTEM {

    @XmlElement(name = "GROUP_SYSTEM_ID")
    protected String groupsystemid;
    @XmlElement(name = "GROUP_SYSTEM_NAME")
    protected String groupsystemname;
    @XmlElement(name = "CATALOG_STRUCTURE", required = true)
    protected List<CATALOGSTRUCTURE> catalogstructure;
    @XmlElement(name = "GROUP_SYSTEM_DESCRIPTION")
    protected String groupsystemdescription;

    /**
     * Gets the value of the groupsystemid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPSYSTEMID() {
        return groupsystemid;
    }

    /**
     * Sets the value of the groupsystemid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPSYSTEMID(String value) {
        this.groupsystemid = value;
    }

    /**
     * Gets the value of the groupsystemname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPSYSTEMNAME() {
        return groupsystemname;
    }

    /**
     * Sets the value of the groupsystemname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPSYSTEMNAME(String value) {
        this.groupsystemname = value;
    }

    /**
     * Gets the value of the catalogstructure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the catalogstructure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCATALOGSTRUCTURE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CATALOGSTRUCTURE }
     * 
     * 
     */
    public List<CATALOGSTRUCTURE> getCATALOGSTRUCTURE() {
        if (catalogstructure == null) {
            catalogstructure = new ArrayList<CATALOGSTRUCTURE>();
        }
        return this.catalogstructure;
    }

    /**
     * Gets the value of the groupsystemdescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGROUPSYSTEMDESCRIPTION() {
        return groupsystemdescription;
    }

    /**
     * Sets the value of the groupsystemdescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGROUPSYSTEMDESCRIPTION(String value) {
        this.groupsystemdescription = value;
    }

}
