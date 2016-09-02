
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse_clientservice.ServiceResponseOfESavedGameRestrictionLeveleheogrl4;


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
 *         &lt;element name="GetSavedGameRestrictionLevelResult" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}ServiceResponseOfESavedGameRestrictionLeveleheogrl4" minOccurs="0"/>
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
    "getSavedGameRestrictionLevelResult"
})
@XmlRootElement(name = "GetSavedGameRestrictionLevelResponse")
public class GetSavedGameRestrictionLevelResponse {

    @XmlElementRef(name = "GetSavedGameRestrictionLevelResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ServiceResponseOfESavedGameRestrictionLeveleheogrl4> getSavedGameRestrictionLevelResult;

    /**
     * Gets the value of the getSavedGameRestrictionLevelResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfESavedGameRestrictionLeveleheogrl4 }{@code >}
     *     
     */
    public JAXBElement<ServiceResponseOfESavedGameRestrictionLeveleheogrl4> getGetSavedGameRestrictionLevelResult() {
        return getSavedGameRestrictionLevelResult;
    }

    /**
     * Sets the value of the getSavedGameRestrictionLevelResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ServiceResponseOfESavedGameRestrictionLeveleheogrl4 }{@code >}
     *     
     */
    public void setGetSavedGameRestrictionLevelResult(JAXBElement<ServiceResponseOfESavedGameRestrictionLeveleheogrl4> value) {
        this.getSavedGameRestrictionLevelResult = value;
    }

}
