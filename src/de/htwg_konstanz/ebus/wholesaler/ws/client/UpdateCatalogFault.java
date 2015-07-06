
package de.htwg_konstanz.ebus.wholesaler.ws.client;

import javax.xml.ws.WebFault;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebFault(name = "updateFault", targetNamespace = "http://www.example.org/updateCatalog/")
public class UpdateCatalogFault
    extends Exception
{

    /**
     * Java type that goes as soapenv:Fault detail element.
     * 
     */
    private UpdateFaultT faultInfo;

    /**
     * 
     * @param message
     * @param faultInfo
     */
    public UpdateCatalogFault(String message, UpdateFaultT faultInfo) {
        super(message);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @param message
     * @param faultInfo
     * @param cause
     */
    public UpdateCatalogFault(String message, UpdateFaultT faultInfo, Throwable cause) {
        super(message, cause);
        this.faultInfo = faultInfo;
    }

    /**
     * 
     * @return
     *     returns fault bean: de.htwg.UpdateFaultT
     */
    public UpdateFaultT getFaultInfo() {
        return faultInfo;
    }

}