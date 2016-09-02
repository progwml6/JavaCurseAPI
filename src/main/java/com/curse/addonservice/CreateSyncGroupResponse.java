
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfSyncedGameInstanceeheogrl4;


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
 *         &lt;element name="CreateSyncGroupResult" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}ServiceResponseOfSyncedGameInstanceeheogrl4" minOccurs="0"/>
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
    "createSyncGroupResult"
})
@XmlRootElement(name = "CreateSyncGroupResponse")
public class CreateSyncGroupResponse {

    @XmlElementRef(name = "CreateSyncGroupResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponseOfSyncedGameInstanceeheogrl4> createSyncGroupResult;

    /**
     * Gets the value of the createSyncGroupResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfSyncedGameInstanceeheogrl4 }{@code >}
     *     
     */
    public JAXBElement<ServiceResponseOfSyncedGameInstanceeheogrl4> getCreateSyncGroupResult() {
        return createSyncGroupResult;
    }

    /**
     * Sets the value of the createSyncGroupResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfSyncedGameInstanceeheogrl4 }{@code >}
     *     
     */
    public void setCreateSyncGroupResult(JAXBElement<ServiceResponseOfSyncedGameInstanceeheogrl4> value) {
        this.createSyncGroupResult = value;
    }

}
