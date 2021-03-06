
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
@WebService(name = "SharepointEmailWSSoap", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SharepointEmailWSSoap {


    /**
     * 
     * @param lastName
     * @param flags
     * @param alias
     * @param firstName
     * @param forwardingEmail
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestStatus
     */
    @WebMethod(operationName = "CreateContact", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/CreateContact")
    @WebResult(name = "CreateContactResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "CreateContact", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.CreateContact")
    @ResponseWrapper(localName = "CreateContactResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.CreateContactResponse")
    public RequestStatus createContact(
        @WebParam(name = "Alias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String alias,
        @WebParam(name = "FirstName", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String firstName,
        @WebParam(name = "LastName", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String lastName,
        @WebParam(name = "ForwardingEmail", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String forwardingEmail,
        @WebParam(name = "Flags", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        ContactFlags flags);

    /**
     * 
     * @param alias
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestStatus
     */
    @WebMethod(operationName = "DeleteContact", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/DeleteContact")
    @WebResult(name = "DeleteContactResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "DeleteContact", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.DeleteContact")
    @ResponseWrapper(localName = "DeleteContactResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.DeleteContactResponse")
    public RequestStatus deleteContact(
        @WebParam(name = "Alias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String alias);

    /**
     * 
     * @param lastName
     * @param flags
     * @param oldAlias
     * @param newAlias
     * @param firstName
     * @param forwardingEmail
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestStatus
     */
    @WebMethod(operationName = "ModifyContact", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/ModifyContact")
    @WebResult(name = "ModifyContactResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "ModifyContact", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.ModifyContact")
    @ResponseWrapper(localName = "ModifyContactResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.ModifyContactResponse")
    public RequestStatus modifyContact(
        @WebParam(name = "OldAlias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String oldAlias,
        @WebParam(name = "NewAlias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String newAlias,
        @WebParam(name = "FirstName", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String firstName,
        @WebParam(name = "LastName", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String lastName,
        @WebParam(name = "ForwardingEmail", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String forwardingEmail,
        @WebParam(name = "Flags", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        ContactFlags flags);

    /**
     * 
     * @param flags
     * @param alias
     * @param description
     * @param name
     * @param contactCN
     * @param info
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestResponse
     */
    @WebMethod(operationName = "CreateDistributionGroup", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/CreateDistributionGroup")
    @WebResult(name = "CreateDistributionGroupResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "CreateDistributionGroup", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.CreateDistributionGroup")
    @ResponseWrapper(localName = "CreateDistributionGroupResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.CreateDistributionGroupResponse")
    public RequestResponse createDistributionGroup(
        @WebParam(name = "Alias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String alias,
        @WebParam(name = "Name", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String name,
        @WebParam(name = "Description", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String description,
        @WebParam(name = "ContactCN", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String contactCN,
        @WebParam(name = "Info", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        RequestInfo info,
        @WebParam(name = "Flags", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        DistributionGroupFlags flags);

    /**
     * 
     * @param alias
     * @param info
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestResponse
     */
    @WebMethod(operationName = "DeleteDistributionGroup", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/DeleteDistributionGroup")
    @WebResult(name = "DeleteDistributionGroupResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "DeleteDistributionGroup", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.DeleteDistributionGroup")
    @ResponseWrapper(localName = "DeleteDistributionGroupResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.DeleteDistributionGroupResponse")
    public RequestResponse deleteDistributionGroup(
        @WebParam(name = "Alias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String alias,
        @WebParam(name = "Info", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        RequestInfo info);

    /**
     * 
     * @param oldAlias
     * @param newAlias
     * @param info
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestResponse
     */
    @WebMethod(operationName = "RenameDistributionGroup", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/RenameDistributionGroup")
    @WebResult(name = "RenameDistributionGroupResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "RenameDistributionGroup", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.RenameDistributionGroup")
    @ResponseWrapper(localName = "RenameDistributionGroupResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.RenameDistributionGroupResponse")
    public RequestResponse renameDistributionGroup(
        @WebParam(name = "OldAlias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String oldAlias,
        @WebParam(name = "NewAlias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String newAlias,
        @WebParam(name = "Info", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        RequestInfo info);

    /**
     * 
     * @param flags
     * @param alias
     * @param description
     * @param name
     * @param contactCN
     * @param info
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestResponse
     */
    @WebMethod(operationName = "ModifyDistributionGroup", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/ModifyDistributionGroup")
    @WebResult(name = "ModifyDistributionGroupResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "ModifyDistributionGroup", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.ModifyDistributionGroup")
    @ResponseWrapper(localName = "ModifyDistributionGroupResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.ModifyDistributionGroupResponse")
    public RequestResponse modifyDistributionGroup(
        @WebParam(name = "Alias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String alias,
        @WebParam(name = "Name", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String name,
        @WebParam(name = "Description", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String description,
        @WebParam(name = "ContactCN", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String contactCN,
        @WebParam(name = "Info", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        RequestInfo info,
        @WebParam(name = "Flags", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        DistributionGroupFlags flags);

    /**
     * 
     * @param jobId
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestResponse
     */
    @WebMethod(operationName = "GetJobStatus", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/GetJobStatus")
    @WebResult(name = "GetJobStatusResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "GetJobStatus", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.GetJobStatus")
    @ResponseWrapper(localName = "GetJobStatusResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.GetJobStatusResponse")
    public RequestResponse getJobStatus(
        @WebParam(name = "JobId", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        int jobId);

    /**
     * 
     * @param deleteNt4NameList
     * @param alias
     * @param addNt4NameList
     * @param deleteAllCurrentMembers
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestStatus
     */
    @WebMethod(operationName = "ChangeUsersMembershipInDistributionGroup", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/ChangeUsersMembershipInDistributionGroup")
    @WebResult(name = "ChangeUsersMembershipInDistributionGroupResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "ChangeUsersMembershipInDistributionGroup", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.ChangeUsersMembershipInDistributionGroup")
    @ResponseWrapper(localName = "ChangeUsersMembershipInDistributionGroupResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.ChangeUsersMembershipInDistributionGroupResponse")
    public RequestStatus changeUsersMembershipInDistributionGroup(
        @WebParam(name = "Alias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String alias,
        @WebParam(name = "AddNt4NameList", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        ArrayOfString addNt4NameList,
        @WebParam(name = "DeleteNt4NameList", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        ArrayOfString deleteNt4NameList,
        @WebParam(name = "DeleteAllCurrentMembers", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        boolean deleteAllCurrentMembers);

    /**
     * 
     * @param alias
     * @param addListForContacts
     * @param deleteListForContacts
     * @param deleteAllCurrentMembers
     * @return
     *     returns com.microsoft.schemas.sharepoint.soap.RequestStatus
     */
    @WebMethod(operationName = "ChangeContactsMembershipInDistributionGroup", action = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/ChangeContactsMembershipInDistributionGroup")
    @WebResult(name = "ChangeContactsMembershipInDistributionGroupResult", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
    @RequestWrapper(localName = "ChangeContactsMembershipInDistributionGroup", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.ChangeContactsMembershipInDistributionGroup")
    @ResponseWrapper(localName = "ChangeContactsMembershipInDistributionGroupResponse", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/", className = "com.microsoft.schemas.sharepoint.soap.ChangeContactsMembershipInDistributionGroupResponse")
    public RequestStatus changeContactsMembershipInDistributionGroup(
        @WebParam(name = "Alias", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        String alias,
        @WebParam(name = "AddListForContacts", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        ArrayOfString addListForContacts,
        @WebParam(name = "DeleteListForContacts", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        ArrayOfString deleteListForContacts,
        @WebParam(name = "DeleteAllCurrentMembers", targetNamespace = "http://microsoft.com/webservices/SharePoint/SharepointEmailWS/")
        boolean deleteAllCurrentMembers);

}
