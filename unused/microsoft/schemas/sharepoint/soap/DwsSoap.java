
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
@WebService(name = "DwsSoap", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface DwsSoap {


    /**
     * 
     * @param title
     * @param users
     * @param documents
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CreateDws", action = "http://schemas.microsoft.com/sharepoint/soap/dws/CreateDws")
    @WebResult(name = "CreateDwsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "CreateDws", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.CreateDws")
    @ResponseWrapper(localName = "CreateDwsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.CreateDwsResponse")
    public String createDws(
        @WebParam(name = "name", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String name,
        @WebParam(name = "users", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String users,
        @WebParam(name = "title", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String title,
        @WebParam(name = "documents", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String documents);

    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DeleteDws", action = "http://schemas.microsoft.com/sharepoint/soap/dws/DeleteDws")
    @WebResult(name = "DeleteDwsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "DeleteDws", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.DeleteDws")
    @ResponseWrapper(localName = "DeleteDwsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.DeleteDwsResponse")
    public String deleteDws();

    /**
     * 
     * @param id
     * @param document
     * @param minimal
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDwsMetaData", action = "http://schemas.microsoft.com/sharepoint/soap/dws/GetDwsMetaData")
    @WebResult(name = "GetDwsMetaDataResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "GetDwsMetaData", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.GetDwsMetaData")
    @ResponseWrapper(localName = "GetDwsMetaDataResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.GetDwsMetaDataResponse")
    public String getDwsMetaData(
        @WebParam(name = "document", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String document,
        @WebParam(name = "id", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String id,
        @WebParam(name = "minimal", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        boolean minimal);

    /**
     * 
     * @param document
     * @param lastUpdate
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "GetDwsData", action = "http://schemas.microsoft.com/sharepoint/soap/dws/GetDwsData")
    @WebResult(name = "GetDwsDataResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "GetDwsData", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.GetDwsData")
    @ResponseWrapper(localName = "GetDwsDataResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.GetDwsDataResponse")
    public String getDwsData(
        @WebParam(name = "document", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String document,
        @WebParam(name = "lastUpdate", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String lastUpdate);

    /**
     * 
     * @param updates
     * @param meetingInstance
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "UpdateDwsData", action = "http://schemas.microsoft.com/sharepoint/soap/dws/UpdateDwsData")
    @WebResult(name = "UpdateDwsDataResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "UpdateDwsData", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.UpdateDwsData")
    @ResponseWrapper(localName = "UpdateDwsDataResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.UpdateDwsDataResponse")
    public String updateDwsData(
        @WebParam(name = "updates", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String updates,
        @WebParam(name = "meetingInstance", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String meetingInstance);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RemoveDwsUser", action = "http://schemas.microsoft.com/sharepoint/soap/dws/RemoveDwsUser")
    @WebResult(name = "RemoveDwsUserResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "RemoveDwsUser", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.RemoveDwsUser")
    @ResponseWrapper(localName = "RemoveDwsUserResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.RemoveDwsUserResponse")
    public String removeDwsUser(
        @WebParam(name = "id", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String id);

    /**
     * 
     * @param title
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "RenameDws", action = "http://schemas.microsoft.com/sharepoint/soap/dws/RenameDws")
    @WebResult(name = "RenameDwsResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "RenameDws", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.RenameDws")
    @ResponseWrapper(localName = "RenameDwsResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.RenameDwsResponse")
    public String renameDws(
        @WebParam(name = "title", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String title);

    /**
     * 
     * @param id
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "FindDwsDoc", action = "http://schemas.microsoft.com/sharepoint/soap/dws/FindDwsDoc")
    @WebResult(name = "FindDwsDocResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "FindDwsDoc", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.FindDwsDoc")
    @ResponseWrapper(localName = "FindDwsDocResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.FindDwsDocResponse")
    public String findDwsDoc(
        @WebParam(name = "id", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String id);

    /**
     * 
     * @param url
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CanCreateDwsUrl", action = "http://schemas.microsoft.com/sharepoint/soap/dws/CanCreateDwsUrl")
    @WebResult(name = "CanCreateDwsUrlResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "CanCreateDwsUrl", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.CanCreateDwsUrl")
    @ResponseWrapper(localName = "CanCreateDwsUrlResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.CanCreateDwsUrlResponse")
    public String canCreateDwsUrl(
        @WebParam(name = "url", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String url);

    /**
     * 
     * @param url
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "CreateFolder", action = "http://schemas.microsoft.com/sharepoint/soap/dws/CreateFolder")
    @WebResult(name = "CreateFolderResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "CreateFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.CreateFolder")
    @ResponseWrapper(localName = "CreateFolderResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.CreateFolderResponse")
    public String createFolder(
        @WebParam(name = "url", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String url);

    /**
     * 
     * @param url
     * @return
     *     returns java.lang.String
     */
    @WebMethod(operationName = "DeleteFolder", action = "http://schemas.microsoft.com/sharepoint/soap/dws/DeleteFolder")
    @WebResult(name = "DeleteFolderResult", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
    @RequestWrapper(localName = "DeleteFolder", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.DeleteFolder")
    @ResponseWrapper(localName = "DeleteFolderResponse", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/", className = "com.microsoft.schemas.sharepoint.soap.DeleteFolderResponse")
    public String deleteFolder(
        @WebParam(name = "url", targetNamespace = "http://schemas.microsoft.com/sharepoint/soap/dws/")
        String url);

}
