
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
@WebService(name = "VersionsSoap", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface VersionsSoap {


    /**
     * 
     * @param fileName
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.GetVersionsResponse.GetVersionsResult
     */
    @WebMethod(operationName = "GetVersions", action = "http://schemas.microsoft.com/sharepoint/soap/GetVersions")
    @WebResult(name = "GetVersionsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "GetVersions", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetVersions")
    @ResponseWrapper(localName = "GetVersionsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.GetVersionsResponse")
    public com.microsoft.schemas.sharepoint.soap.GetVersionsResponse.GetVersionsResult getVersions(
        @WebParam(name = "fileName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        String fileName);

    /**
     * 
     * @param fileName
     * @param fileVersion
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RestoreVersionResponse.RestoreVersionResult
     */
    @WebMethod(operationName = "RestoreVersion", action = "http://schemas.microsoft.com/sharepoint/soap/RestoreVersion")
    @WebResult(name = "RestoreVersionResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "RestoreVersion", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RestoreVersion")
    @ResponseWrapper(localName = "RestoreVersionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.RestoreVersionResponse")
    public com.microsoft.schemas.sharepoint.soap.RestoreVersionResponse.RestoreVersionResult restoreVersion(
        @WebParam(name = "fileName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        String fileName,
        @WebParam(name = "fileVersion", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        String fileVersion);

    /**
     * 
     * @param fileName
     * @param fileVersion
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.DeleteVersionResponse.DeleteVersionResult
     */
    @WebMethod(operationName = "DeleteVersion", action = "http://schemas.microsoft.com/sharepoint/soap/DeleteVersion")
    @WebResult(name = "DeleteVersionResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "DeleteVersion", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.DeleteVersion")
    @ResponseWrapper(localName = "DeleteVersionResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.DeleteVersionResponse")
    public com.microsoft.schemas.sharepoint.soap.DeleteVersionResponse.DeleteVersionResult deleteVersion(
        @WebParam(name = "fileName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        String fileName,
        @WebParam(name = "fileVersion", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        String fileVersion);

    /**
     * 
     * @param fileName
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponse.DeleteAllVersionsResult
     */
    @WebMethod(operationName = "DeleteAllVersions", action = "http://schemas.microsoft.com/sharepoint/soap/DeleteAllVersions")
    @WebResult(name = "DeleteAllVersionsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
    @RequestWrapper(localName = "DeleteAllVersions", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.DeleteAllVersions")
    @ResponseWrapper(localName = "DeleteAllVersionsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/", className = "com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponse")
    public com.microsoft.schemas.sharepoint.soap.DeleteAllVersionsResponse.DeleteAllVersionsResult deleteAllVersions(
        @WebParam(name = "fileName", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/")
        String fileName);

}
