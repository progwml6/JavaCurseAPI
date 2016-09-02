
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import addons.curse.AddOnFile;


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
 *         &lt;element name="GetAddOnFileResult" type="{Curse.AddOns}AddOnFile" minOccurs="0"/>
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
    "getAddOnFileResult"
})
@XmlRootElement(name = "GetAddOnFileResponse")
public class GetAddOnFileResponse {

    @XmlElementRef(name = "GetAddOnFileResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<AddOnFile> getAddOnFileResult;

    /**
     * Gets the value of the getAddOnFileResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddOnFile }{@code >}
     *     
     */
    public JAXBElement<AddOnFile> getGetAddOnFileResult() {
        return getAddOnFileResult;
    }

    /**
     * Sets the value of the getAddOnFileResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddOnFile }{@code >}
     *     
     */
    public void setGetAddOnFileResult(JAXBElement<AddOnFile> value) {
        this.getAddOnFileResult = value;
    }

}
