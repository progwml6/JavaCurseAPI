
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponse;


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
 *         &lt;element name="SetSavedGameDescriptionResult" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}ServiceResponse" minOccurs="0"/>
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
    "setSavedGameDescriptionResult"
})
@XmlRootElement(name = "SetSavedGameDescriptionResponse")
public class SetSavedGameDescriptionResponse {

    @XmlElementRef(name = "SetSavedGameDescriptionResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponse> setSavedGameDescriptionResult;

    /**
     * Gets the value of the setSavedGameDescriptionResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}
     *     
     */
    public JAXBElement<ServiceResponse> getSetSavedGameDescriptionResult() {
        return setSavedGameDescriptionResult;
    }

    /**
     * Sets the value of the setSavedGameDescriptionResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponse }{@code >}
     *     
     */
    public void setSetSavedGameDescriptionResult(JAXBElement<ServiceResponse> value) {
        this.setSavedGameDescriptionResult = value;
    }

}
