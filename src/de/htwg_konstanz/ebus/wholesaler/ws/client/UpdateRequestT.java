
package de.htwg_konstanz.ebus.wholesaler.ws.client;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for updateRequest_t complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="updateRequest_t">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="authentication" type="{http://www.example.org/updateCatalog/}authentication_t"/>
 *         &lt;element name="listOfProducts" type="{http://www.example.org/updateCatalog/}listOfProducts_t"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "updateRequest_t", propOrder = {
    "authentication",
    "listOfProducts"
})
public class UpdateRequestT {

    @XmlElement(required = true)
    protected AuthenticationT authentication;
    @XmlElement(required = true)
    protected ListOfProductsT listOfProducts;

    /**
     * Gets the value of the authentication property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationT }
     *     
     */
    public AuthenticationT getAuthentication() {
        return authentication;
    }

    /**
     * Sets the value of the authentication property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationT }
     *     
     */
    public void setAuthentication(AuthenticationT value) {
        this.authentication = value;
    }

    /**
     * Gets the value of the listOfProducts property.
     * 
     * @return
     *     possible object is
     *     {@link ListOfProductsT }
     *     
     */
    public ListOfProductsT getListOfProducts() {
        return listOfProducts;
    }

    /**
     * Sets the value of the listOfProducts property.
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfProductsT }
     *     
     */
    public void setListOfProducts(ListOfProductsT value) {
        this.listOfProducts = value;
    }

}
