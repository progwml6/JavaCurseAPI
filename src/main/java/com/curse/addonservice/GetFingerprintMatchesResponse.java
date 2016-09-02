
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import addons.curse.FingerprintMatchResult;


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
 *         &lt;element name="GetFingerprintMatchesResult" type="{Curse.AddOns}FingerprintMatchResult" minOccurs="0"/>
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
    "getFingerprintMatchesResult"
})
@XmlRootElement(name = "GetFingerprintMatchesResponse")
public class GetFingerprintMatchesResponse {

    @XmlElementRef(name = "GetFingerprintMatchesResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<FingerprintMatchResult> getFingerprintMatchesResult;

    /**
     * Gets the value of the getFingerprintMatchesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link FingerprintMatchResult }{@code >}
     *     
     */
    public JAXBElement<FingerprintMatchResult> getGetFingerprintMatchesResult() {
        return getFingerprintMatchesResult;
    }

    /**
     * Sets the value of the getFingerprintMatchesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link FingerprintMatchResult }{@code >}
     *     
     */
    public void setGetFingerprintMatchesResult(JAXBElement<FingerprintMatchResult> value) {
        this.getFingerprintMatchesResult = value;
    }

}
