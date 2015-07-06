
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
 *         &lt;element ref="{http://www.bmecat.org/XMLSchema/1.2/bmecat_new_catalog}CLASSIFICATION_SYSTEM_FEATURE_TEMPLATE" maxOccurs="unbounded"/>
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
    "classificationsystemfeaturetemplate"
})
@XmlRootElement(name = "CLASSIFICATION_SYSTEM_FEATURE_TEMPLATES")
public class CLASSIFICATIONSYSTEMFEATURETEMPLATES {

    @XmlElement(name = "CLASSIFICATION_SYSTEM_FEATURE_TEMPLATE", required = true)
    protected List<CLASSIFICATIONSYSTEMFEATURETEMPLATE> classificationsystemfeaturetemplate;

    /**
     * Gets the value of the classificationsystemfeaturetemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classificationsystemfeaturetemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCLASSIFICATIONSYSTEMFEATURETEMPLATE().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CLASSIFICATIONSYSTEMFEATURETEMPLATE }
     * 
     * 
     */
    public List<CLASSIFICATIONSYSTEMFEATURETEMPLATE> getCLASSIFICATIONSYSTEMFEATURETEMPLATE() {
        if (classificationsystemfeaturetemplate == null) {
            classificationsystemfeaturetemplate = new ArrayList<CLASSIFICATIONSYSTEMFEATURETEMPLATE>();
        }
        return this.classificationsystemfeaturetemplate;
    }

}
