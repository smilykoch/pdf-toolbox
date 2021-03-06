
package com.microsoft.schemas.sharepoint.soap;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
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
@WebService(name = "PeopleSoap", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PeopleSoap {


    /**
     * 
     * @param principalKeys
     * @param principalType
     * @param addToUserInfoList
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.ArrayOfPrincipalInfo
     */
    @WebMethod(operationName = "ResolvePrincipals", action = "http://schemas.microsoft.com/sharepoint/soap/ResolvePrincipals")
    @WebResult(name = "ResolvePrincipalsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "ResolvePrincipals", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.ResolvePrincipals")
    @ResponseWrapper(localName = "ResolvePrincipalsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.ResolvePrincipalsResponse")
    public ArrayOfPrincipalInfo resolvePrincipals(
        @WebParam(name = "principalKeys", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        ArrayOfString principalKeys,
        @WebParam(name = "principalType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        List<String> principalType,
        @WebParam(name = "addToUserInfoList", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        boolean addToUserInfoList);

    /**
     * 
     * @param principalType
     * @param searchText
     * @param maxResults
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.ArrayOfPrincipalInfo
     */
    @WebMethod(operationName = "SearchPrincipals", action = "http://schemas.microsoft.com/sharepoint/soap/SearchPrincipals")
    @WebResult(name = "SearchPrincipalsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "SearchPrincipals", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.SearchPrincipals")
    @ResponseWrapper(localName = "SearchPrincipalsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.SearchPrincipalsResponse")
    public ArrayOfPrincipalInfo searchPrincipals(
        @WebParam(name = "searchText", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        String searchText,
        @WebParam(name = "maxResults", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        int maxResults,
        @WebParam(name = "principalType", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        List<String> principalType);

}
