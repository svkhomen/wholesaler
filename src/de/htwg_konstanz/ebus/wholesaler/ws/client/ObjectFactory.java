
package de.htwg_konstanz.ebus.wholesaler.ws.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.htwg package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListOfUnavailableProducts_QNAME = new QName("http://www.example.org/updateCatalog/", "listOfUnavailableProducts");
    private final static QName _Authentication_QNAME = new QName("http://www.example.org/updateCatalog/", "authentication");
    private final static QName _UpdateResponse_QNAME = new QName("http://www.example.org/updateCatalog/", "updateResponse");
    private final static QName _ListOfProducts_QNAME = new QName("http://www.example.org/updateCatalog/", "listOfProducts");
    private final static QName _SupplierProduct_QNAME = new QName("http://www.example.org/updateCatalog/", "supplierProduct");
    private final static QName _Price_QNAME = new QName("http://www.example.org/updateCatalog/", "price");
    private final static QName _UpdateFault_QNAME = new QName("http://www.example.org/updateCatalog/", "updateFault");
    private final static QName _UpdateRequest_QNAME = new QName("http://www.example.org/updateCatalog/", "updateRequest");
    private final static QName _ListOfModifiedProducts_QNAME = new QName("http://www.example.org/updateCatalog/", "listOfModifiedProducts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.htwg
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SupplierProductT }
     * 
     */
    public SupplierProductT createSupplierProductT() {
        return new SupplierProductT();
    }

    /**
     * Create an instance of {@link ListOfProductsT }
     * 
     */
    public ListOfProductsT createListOfProductsT() {
        return new ListOfProductsT();
    }

    /**
     * Create an instance of {@link PriceT }
     * 
     */
    public PriceT createPriceT() {
        return new PriceT();
    }

    /**
     * Create an instance of {@link ListOfUnavailableProductsT }
     * 
     */
    public ListOfUnavailableProductsT createListOfUnavailableProductsT() {
        return new ListOfUnavailableProductsT();
    }

    /**
     * Create an instance of {@link UpdateResponseT }
     * 
     */
    public UpdateResponseT createUpdateResponseT() {
        return new UpdateResponseT();
    }

    /**
     * Create an instance of {@link AuthenticationT }
     * 
     */
    public AuthenticationT createAuthenticationT() {
        return new AuthenticationT();
    }

    /**
     * Create an instance of {@link ListOfModifiedProductsT }
     * 
     */
    public ListOfModifiedProductsT createListOfModifiedProductsT() {
        return new ListOfModifiedProductsT();
    }

    /**
     * Create an instance of {@link UpdateRequestT }
     * 
     */
    public UpdateRequestT createUpdateRequestT() {
        return new UpdateRequestT();
    }

    /**
     * Create an instance of {@link UpdateFaultT }
     * 
     */
    public UpdateFaultT createUpdateFaultT() {
        return new UpdateFaultT();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfUnavailableProductsT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/updateCatalog/", name = "listOfUnavailableProducts")
    public JAXBElement<ListOfUnavailableProductsT> createListOfUnavailableProducts(ListOfUnavailableProductsT value) {
        return new JAXBElement<ListOfUnavailableProductsT>(_ListOfUnavailableProducts_QNAME, ListOfUnavailableProductsT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/updateCatalog/", name = "authentication")
    public JAXBElement<AuthenticationT> createAuthentication(AuthenticationT value) {
        return new JAXBElement<AuthenticationT>(_Authentication_QNAME, AuthenticationT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponseT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/updateCatalog/", name = "updateResponse")
    public JAXBElement<UpdateResponseT> createUpdateResponse(UpdateResponseT value) {
        return new JAXBElement<UpdateResponseT>(_UpdateResponse_QNAME, UpdateResponseT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfProductsT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/updateCatalog/", name = "listOfProducts")
    public JAXBElement<ListOfProductsT> createListOfProducts(ListOfProductsT value) {
        return new JAXBElement<ListOfProductsT>(_ListOfProducts_QNAME, ListOfProductsT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierProductT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/updateCatalog/", name = "supplierProduct")
    public JAXBElement<SupplierProductT> createSupplierProduct(SupplierProductT value) {
        return new JAXBElement<SupplierProductT>(_SupplierProduct_QNAME, SupplierProductT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/updateCatalog/", name = "price")
    public JAXBElement<PriceT> createPrice(PriceT value) {
        return new JAXBElement<PriceT>(_Price_QNAME, PriceT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateFaultT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/updateCatalog/", name = "updateFault")
    public JAXBElement<UpdateFaultT> createUpdateFault(UpdateFaultT value) {
        return new JAXBElement<UpdateFaultT>(_UpdateFault_QNAME, UpdateFaultT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateRequestT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/updateCatalog/", name = "updateRequest")
    public JAXBElement<UpdateRequestT> createUpdateRequest(UpdateRequestT value) {
        return new JAXBElement<UpdateRequestT>(_UpdateRequest_QNAME, UpdateRequestT.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListOfModifiedProductsT }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/updateCatalog/", name = "listOfModifiedProducts")
    public JAXBElement<ListOfModifiedProductsT> createListOfModifiedProducts(ListOfModifiedProductsT value) {
        return new JAXBElement<ListOfModifiedProductsT>(_ListOfModifiedProducts_QNAME, ListOfModifiedProductsT.class, null, value);
    }

}
