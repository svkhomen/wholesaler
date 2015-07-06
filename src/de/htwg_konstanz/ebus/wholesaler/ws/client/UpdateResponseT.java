
package de.htwg_konstanz.ebus.wholesaler.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for updateResponse_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateResponse_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="updateDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="listOfModifiedProducts" type="{http://www.example.org/updateCatalog/}listOfModifiedProducts_t"/>
 *         &lt;element name="listOfUnavailableProducts" type="{http://www.example.org/updateCatalog/}listOfUnavailableProducts_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateResponse_t", propOrder = {
    "updateDate",
    "listOfModifiedProducts",
    "listOfUnavailableProducts"
})
public class UpdateResponseT {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar updateDate;
    @XmlElement(required = true)
    protected ListOfModifiedProductsT listOfModifiedProducts;
    @XmlElement(required = true)
    protected ListOfUnavailableProductsT listOfUnavailableProducts;

    /**
     * Gets the value of the updateDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUpdateDate() {
        return updateDate;
    }

    /**
     * Sets the value of the updateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUpdateDate(XMLGregorianCalendar value) {
        this.updateDate = value;
    }

    /**
     * Gets the value of the listOfModifiedProducts property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfModifiedProductsT }
     *     
     */
    public ListOfModifiedProductsT getListOfModifiedProducts() {
        return listOfModifiedProducts;
    }

    /**
     * Sets the value of the listOfModifiedProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfModifiedProductsT }
     *     
     */
    public void setListOfModifiedProducts(ListOfModifiedProductsT value) {
        this.listOfModifiedProducts = value;
    }

    /**
     * Gets the value of the listOfUnavailableProducts property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfUnavailableProductsT }
     *     
     */
    public ListOfUnavailableProductsT getListOfUnavailableProducts() {
        return listOfUnavailableProducts;
    }

    /**
     * Sets the value of the listOfUnavailableProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfUnavailableProductsT }
     *     
     */
    public void setListOfUnavailableProducts(ListOfUnavailableProductsT value) {
        this.listOfUnavailableProducts = value;
    }

}
