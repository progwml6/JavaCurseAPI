
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import addons.curse.ArrayOfAddOn;


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
 *         &lt;element name="v2GetAddOnsResult" type="{Curse.AddOns}ArrayOfAddOn" minOccurs="0"/>
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
    "v2GetAddOnsResult"
})
@XmlRootElement(name = "v2GetAddOnsResponse")
public class V2GetAddOnsResponse {

    @XmlElementRef(name = "v2GetAddOnsResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOn> v2GetAddOnsResult;

    /**
     * Gets the value of the v2GetAddOnsResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOn }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddOn> getV2GetAddOnsResult() {
        return v2GetAddOnsResult;
    }

    /**
     * Sets the value of the v2GetAddOnsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOn }{@code >}
     *     
     */
    public void setV2GetAddOnsResult(JAXBElement<ArrayOfAddOn> value) {
        this.v2GetAddOnsResult = value;
    }

}
