
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import addons.curse.AddOn;


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
 *         &lt;element name="GetAddOnResult" type="{Curse.AddOns}AddOn" minOccurs="0"/>
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
    "getAddOnResult"
})
@XmlRootElement(name = "GetAddOnResponse")
public class GetAddOnResponse {

    @XmlElementRef(name = "GetAddOnResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<AddOn> getAddOnResult;

    /**
     * Gets the value of the getAddOnResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddOn }{@code >}
     *     
     */
    public JAXBElement<AddOn> getGetAddOnResult() {
        return getAddOnResult;
    }

    /**
     * Sets the value of the getAddOnResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddOn }{@code >}
     *     
     */
    public void setGetAddOnResult(JAXBElement<AddOn> value) {
        this.getAddOnResult = value;
    }

}
