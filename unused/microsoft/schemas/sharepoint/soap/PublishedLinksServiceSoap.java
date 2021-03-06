
package com.microsoft.schemas.sharepoint.soap;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.4-b01
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PublishedLinksServiceSoap", targetNamespace = "http://microsoft.com/webservices/SharePointPortalServer/PublishedLinksService")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PublishedLinksServiceSoap {


    /**
     * 
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.ArrayOfServerLink
     */
    @WebMethod(operationName = "GetLinks", action = "http://microsoft.com/webservices/SharePointPortalServer/PublishedLinksService/GetLinks")
    @WebResult(name = "GetLinksResult", targetNamespace = "http://microsoft.com/webservices/SharePointPortalServer/PublishedLinksService")
    @RequestWrapper(localName = "GetLinks", targetNamespace = "http://microsoft.com/webservices/SharePointPortalServer/PublishedLinksService", className = "com.microsoft.schemas.sharepoint.soap.GetLinks")
    @ResponseWrapper(localName = "GetLinksResponse", targetNamespace = "http://microsoft.com/webservices/SharePointPortalServer/PublishedLinksService", className = "com.microsoft.schemas.sharepoint.soap.GetLinksResponse")
    public ArrayOfServerLink getLinks();

}
