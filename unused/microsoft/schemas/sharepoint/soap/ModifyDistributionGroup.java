
package com.microsoft.schemas.sharepoint.soap;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Alias" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ContactCN" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Info" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}RequestInfo" minOccurs="0"/>
 *         &lt;element name="Flags" type="{http://microsoft.com/webservices/SharePoint/SharepointEmailWS/}DistributionGroupFlags"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "alias",
    "name",
    "description",
    "contactCN",
    "info",
    "flags"
})
@XmlRootElement(name = "ModifyDistributionGroup")
public class ModifyDistributionGroup {

    @XmlElement(name = "Alias")
    protected String alias;
    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "ContactCN")
    protected String contactCN;
    @XmlElement(name = "Info")
    protected RequestInfo info;
    @XmlElement(name = "Flags", required = true)
    protected DistributionGroupFlags flags;

    /**
     * Gets the value of the alias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlias() {
        return alias;
    }

    /**
     * Sets the value of the alias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlias(String value) {
        this.alias = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the contactCN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContactCN() {
        return contactCN;
    }

    /**
     * Sets the value of the contactCN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContactCN(String value) {
        this.contactCN = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * @return
     *     possible object is
     *     {@link RequestInfo }
     *     
     */
    public RequestInfo getInfo() {
        return info;
    }

    /**
     * Sets the value of the info property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequestInfo }
     *     
     */
    public void setInfo(RequestInfo value) {
        this.info = value;
    }

    /**
     * Gets the value of the flags property.
     * 
     * @return
     *     possible object is
     *     {@link DistributionGroupFlags }
     *     
     */
    public DistributionGroupFlags getFlags() {
        return flags;
    }

    /**
     * Sets the value of the flags property.
     * 
     * @param value
     *     allowed object is
     *     {@link DistributionGroupFlags }
     *     
     */
    public void setFlags(DistributionGroupFlags value) {
        this.flags = value;
    }

}
