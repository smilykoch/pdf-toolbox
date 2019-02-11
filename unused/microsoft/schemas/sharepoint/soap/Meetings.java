
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
@WebServiceClient(name = "Meetings", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/meetings/", wsdlLocation = "file:/C:/Users/matko/Desktop/wsdl/meetings.wsdl")
public class Meetings
    extends Service
{

    private final static URL MEETINGS_WSDL_LOCATION;
    private final static WebServiceException MEETINGS_EXCEPTION;
    private final static QName MEETINGS_QNAME = new QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "Meetings");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/matko/Desktop/wsdl/meetings.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        MEETINGS_WSDL_LOCATION = url;
        MEETINGS_EXCEPTION = e;
    }

    public Meetings() {
        super(__getWsdlLocation(), MEETINGS_QNAME);
    }

    public Meetings(WebServiceFeature... features) {
        super(__getWsdlLocation(), MEETINGS_QNAME, features);
    }

    public Meetings(URL wsdlLocation) {
        super(wsdlLocation, MEETINGS_QNAME);
    }

    public Meetings(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, MEETINGS_QNAME, features);
    }

    public Meetings(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Meetings(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns MeetingsSoap
     */
    @WebEndpoint(name = "MeetingsSoap")
    public MeetingsSoap getMeetingsSoap() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "MeetingsSoap"), MeetingsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MeetingsSoap
     */
    @WebEndpoint(name = "MeetingsSoap")
    public MeetingsSoap getMeetingsSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "MeetingsSoap"), MeetingsSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns MeetingsSoap
     */
    @WebEndpoint(name = "MeetingsSoap12")
    public MeetingsSoap getMeetingsSoap12() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "MeetingsSoap12"), MeetingsSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns MeetingsSoap
     */
    @WebEndpoint(name = "MeetingsSoap12")
    public MeetingsSoap getMeetingsSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/meetings/", "MeetingsSoap12"), MeetingsSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (MEETINGS_EXCEPTION!= null) {
            throw MEETINGS_EXCEPTION;
        }
        return MEETINGS_WSDL_LOCATION;
    }

}