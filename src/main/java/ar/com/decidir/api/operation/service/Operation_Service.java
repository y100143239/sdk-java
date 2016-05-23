
package ar.com.decidir.api.operation.service;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "Operation", targetNamespace = "urn:Decidir.net", wsdlLocation = "file:/D:/GitHub/Decidir/dev-sdk-java/Operation.wsdl")
public class Operation_Service
    extends Service
{

    private final static URL OPERATION_WSDL_LOCATION;
    private final static WebServiceException OPERATION_EXCEPTION;
    private final static QName OPERATION_QNAME = new QName("urn:Decidir.net", "Operation");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/D:/GitHub/Decidir/dev-sdk-java/Operation.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        OPERATION_WSDL_LOCATION = url;
        OPERATION_EXCEPTION = e;
    }

    public Operation_Service() {
        super(__getWsdlLocation(), OPERATION_QNAME);
    }

    public Operation_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), OPERATION_QNAME, features);
    }

    public Operation_Service(URL wsdlLocation) {
        super(wsdlLocation, OPERATION_QNAME);
    }

    public Operation_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, OPERATION_QNAME, features);
    }

    public Operation_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Operation_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns OperationPortType
     */
    @WebEndpoint(name = "OperationHttpsSoap11Endpoint")
    public OperationPortType getOperationHttpsSoap11Endpoint() {
        return super.getPort(new QName("urn:Decidir.net", "OperationHttpsSoap11Endpoint"), OperationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationPortType
     */
    @WebEndpoint(name = "OperationHttpsSoap11Endpoint")
    public OperationPortType getOperationHttpsSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("urn:Decidir.net", "OperationHttpsSoap11Endpoint"), OperationPortType.class, features);
    }

    /**
     * 
     * @return
     *     returns OperationPortType
     */
    @WebEndpoint(name = "OperationHttpSoap11Endpoint")
    public OperationPortType getOperationHttpSoap11Endpoint() {
        return super.getPort(new QName("urn:Decidir.net", "OperationHttpSoap11Endpoint"), OperationPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OperationPortType
     */
    @WebEndpoint(name = "OperationHttpSoap11Endpoint")
    public OperationPortType getOperationHttpSoap11Endpoint(WebServiceFeature... features) {
        return super.getPort(new QName("urn:Decidir.net", "OperationHttpSoap11Endpoint"), OperationPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (OPERATION_EXCEPTION!= null) {
            throw OPERATION_EXCEPTION;
        }
        return OPERATION_WSDL_LOCATION;
    }

}
