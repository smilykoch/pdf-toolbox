
package com.microsoft.schemas.sharepoint.soap;

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
@WebService(name = "AuthenticationSoap", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface AuthenticationSoap {


    /**
     * 
     * @param username
     * @param password
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.LoginResult
     */
    @WebMethod(operationName = "Login", action = "http://schemas.microsoft.com/sharepoint/soap/Login")
    @WebResult(name = "LoginResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "Login", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.Login")
    @ResponseWrapper(localName = "LoginResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.LoginResponse")
    public LoginResult login(
        @WebParam(name = "username", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        String username,
        @WebParam(name = "password", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        String password);

    /**
     * 
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.AuthenticationMode
     */
    @WebMethod(operationName = "Mode", action = "http://schemas.microsoft.com/sharepoint/soap/Mode")
    @WebResult(name = "ModeResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "Mode", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.Mode")
    @ResponseWrapper(localName = "ModeResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.ModeResponse")
    public AuthenticationMode mode();

}
