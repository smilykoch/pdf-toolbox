
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
@WebServiceClient(name = "Views", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", wsdlLocation = "file:/C:/Users/matko/Desktop/wsdl/views.wsdl")
public class Views
    extends Service
{

    private final static URL VIEWS_WSDL_LOCATION;
    private final static WebServiceException VIEWS_EXCEPTION;
    private final static QName VIEWS_QNAME = new QName("http://schemas.microsoft.com/sharepoint/soap/", "Views");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/matko/Desktop/wsdl/views.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        VIEWS_WSDL_LOCATION = url;
        VIEWS_EXCEPTION = e;
    }

    public Views() {
        super(__getWsdlLocation(), VIEWS_QNAME);
    }

    public Views(WebServiceFeature... features) {
        super(__getWsdlLocation(), VIEWS_QNAME, features);
    }

    public Views(URL wsdlLocation) {
        super(wsdlLocation, VIEWS_QNAME);
    }

    public Views(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, VIEWS_QNAME, features);
    }

    public Views(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Views(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ViewsSoap
     */
    @WebEndpoint(name = "ViewsSoap")
    public ViewsSoap getViewsSoap() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "ViewsSoap"), ViewsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ViewsSoap
     */
    @WebEndpoint(name = "ViewsSoap")
    public ViewsSoap getViewsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "ViewsSoap"), ViewsSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns ViewsSoap
     */
    @WebEndpoint(name = "ViewsSoap12")
    public ViewsSoap getViewsSoap12() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "ViewsSoap12"), ViewsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ViewsSoap
     */
    @WebEndpoint(name = "ViewsSoap12")
    public ViewsSoap getViewsSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "ViewsSoap12"), ViewsSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (VIEWS_EXCEPTION!= null) {
            throw VIEWS_EXCEPTION;
        }
        return VIEWS_WSDL_LOCATION;
    }

}
