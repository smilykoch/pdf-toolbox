
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
@WebServiceClient(name = "Webs", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", wsdlLocation = "file:/C:/Users/matko/Desktop/wsdl/webs.wsdl")
public class Webs
    extends Service
{

    private final static URL WEBS_WSDL_LOCATION;
    private final static WebServiceException WEBS_EXCEPTION;
    private final static QName WEBS_QNAME = new QName("http://schemas.microsoft.com/sharepoint/soap/", "Webs");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/matko/Desktop/wsdl/webs.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBS_WSDL_LOCATION = url;
        WEBS_EXCEPTION = e;
    }

    public Webs() {
        super(__getWsdlLocation(), WEBS_QNAME);
    }

    public Webs(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBS_QNAME, features);
    }

    public Webs(URL wsdlLocation) {
        super(wsdlLocation, WEBS_QNAME);
    }

    public Webs(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBS_QNAME, features);
    }

    public Webs(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Webs(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebsSoap
     */
    @WebEndpoint(name = "WebsSoap")
    public WebsSoap getWebsSoap() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "WebsSoap"), WebsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebsSoap
     */
    @WebEndpoint(name = "WebsSoap")
    public WebsSoap getWebsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "WebsSoap"), WebsSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns WebsSoap
     */
    @WebEndpoint(name = "WebsSoap12")
    public WebsSoap getWebsSoap12() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "WebsSoap12"), WebsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebsSoap
     */
    @WebEndpoint(name = "WebsSoap12")
    public WebsSoap getWebsSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/", "WebsSoap12"), WebsSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBS_EXCEPTION!= null) {
            throw WEBS_EXCEPTION;
        }
        return WEBS_WSDL_LOCATION;
    }

}
