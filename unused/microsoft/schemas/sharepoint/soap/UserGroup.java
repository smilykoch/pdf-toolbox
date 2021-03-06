
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
@WebServiceClient(name = "UserGroup", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/directory/", wsdlLocation = "file:/C:/Users/matko/Desktop/wsdl/usergroup.wsdl")
public class UserGroup
    extends Service
{

    private final static URL USERGROUP_WSDL_LOCATION;
    private final static WebServiceException USERGROUP_EXCEPTION;
    private final static QName USERGROUP_QNAME = new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroup");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/matko/Desktop/wsdl/usergroup.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        USERGROUP_WSDL_LOCATION = url;
        USERGROUP_EXCEPTION = e;
    }

    public UserGroup() {
        super(__getWsdlLocation(), USERGROUP_QNAME);
    }

    public UserGroup(WebServiceFeature... features) {
        super(__getWsdlLocation(), USERGROUP_QNAME, features);
    }

    public UserGroup(URL wsdlLocation) {
        super(wsdlLocation, USERGROUP_QNAME);
    }

    public UserGroup(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, USERGROUP_QNAME, features);
    }

    public UserGroup(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public UserGroup(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns UserGroupSoap
     */
    @WebEndpoint(name = "UserGroupSoap")
    public UserGroupSoap getUserGroupSoap() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroupSoap"), UserGroupSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserGroupSoap
     */
    @WebEndpoint(name = "UserGroupSoap")
    public UserGroupSoap getUserGroupSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroupSoap"), UserGroupSoap.class, features);
    }

    /**
     * 
     * @return
     *     returns UserGroupSoap
     */
    @WebEndpoint(name = "UserGroupSoap12")
    public UserGroupSoap getUserGroupSoap12() {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroupSoap12"), UserGroupSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserGroupSoap
     */
    @WebEndpoint(name = "UserGroupSoap12")
    public UserGroupSoap getUserGroupSoap12(WebServiceFeature... features) {
        return super.getPort(new QName("http://schemas.microsoft.com/sharepoint/soap/directory/", "UserGroupSoap12"), UserGroupSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (USERGROUP_EXCEPTION!= null) {
            throw USERGROUP_EXCEPTION;
        }
        return USERGROUP_WSDL_LOCATION;
    }

}
