
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4;


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
 *         &lt;element name="GetSyncProfileResult" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4" minOccurs="0"/>
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
    "getSyncProfileResult"
})
@XmlRootElement(name = "GetSyncProfileResponse")
public class GetSyncProfileResponse {

    @XmlElementRef(name = "GetSyncProfileResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4> getSyncProfileResult;

    /**
     * Gets the value of the getSyncProfileResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4 }{@code >}
     *     
     */
    public JAXBElement<ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4> getGetSyncProfileResult() {
        return getSyncProfileResult;
    }

    /**
     * Sets the value of the getSyncProfileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4 }{@code >}
     *     
     */
    public void setGetSyncProfileResult(JAXBElement<ServiceResponseOfArrayOfSyncedGameInstanceeheogrl4> value) {
        this.getSyncProfileResult = value;
    }

}
