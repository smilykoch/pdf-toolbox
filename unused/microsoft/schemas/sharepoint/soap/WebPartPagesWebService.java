
package com.microsoft.schemas.sharepoint.soap;

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
@WebServiceClient(name = "WebPartPagesWebService", targetNamespace = "http://microsoft.com/sharepoint/webpartpages", wsdlLocation = "file:/C:/Users/matko/Desktop/wsdl/webpartpages.wsdl")
public class WebPartPagesWebService
    extends Service
{

    private final static URL WEBPARTPAGESWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBPARTPAGESWEBSERVICE_EXCEPTION;
    private final static QName WEBPARTPAGESWEBSERVICE_QNAME = new QName("http://microsoft.com/sharepoint/webpartpages", "WebPartPagesWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/matko/Desktop/wsdl/webpartpages.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBPARTPAGESWEBSERVICE_WSDL_LOCATION = url;
        WEBPARTPAGESWEBSERVICE_EXCEPTION = e;
    }

    public WebPartPagesWebService() {
        super(__getWsdlLocation(), WEBPARTPAGESWEBSERVICE_QNAME);
    }

    public WebPartPagesWebService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBPARTPAGESWEBSERVICE_QNAME, features);
    }

    public WebPartPagesWebService(URL wsdlLocation) {
        super(wsdlLocation, WEBPARTPAGESWEBSERVICE_QNAME);
    }

    public WebPartPagesWebService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBPARTPAGESWEBSERVICE_QNAME, features);
    }

    public WebPartPagesWebService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebPartPagesWebService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebPartPagesWebServiceSoap
     */
    @WebEndpoint(name = "WebPartPagesWebServiceSoap")
    public WebPartPagesWebServiceSoap getWebPartPagesWebServiceSoap() {
        return super.getPort(new QName("http://microsoft.com/sharepoint/webpartpages", "WebPartPagesWebServiceSoap"), WebPartPagesWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebPartPagesWebServiceSoap
     */
    @WebEndpoint(name = "WebPartPagesWebServiceSoap")
    public WebPartPagesWebServiceSoap getWebPartPagesWebServiceSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://microsoft.com/sharepoint/webpartpages", "WebPartPagesWebServiceSoap"), WebPartPagesWebServiceSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WebPartPagesWebServiceSoap
     */
    @WebEndpoint(name = "WebPartPagesWebServiceSoap12")
    public WebPartPagesWebServiceSoap getWebPartPagesWebServiceSoap12() {
        return super.getPort(new QName("http://microsoft.com/sharepoint/webpartpages", "WebPartPagesWebServiceSoap12"), WebPartPagesWebServiceSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebPartPagesWebServiceSoap
     */
    @WebEndpoint(name = "WebPartPagesWebServiceSoap12")
    public WebPartPagesWebServiceSoap getWebPartPagesWebServiceSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://microsoft.com/sharepoint/webpartpages", "WebPartPagesWebServiceSoap12"), WebPartPagesWebServiceSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBPARTPAGESWEBSERVICE_EXCEPTION!= null) {
            throw WEBPARTPAGESWEBSERVICE_EXCEPTION;
        }
        return WEBPARTPAGESWEBSERVICE_WSDL_LOCATION;
    }

}
