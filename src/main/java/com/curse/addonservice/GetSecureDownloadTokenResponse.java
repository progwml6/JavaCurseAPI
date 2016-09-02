
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import addons.curse.DownloadToken;


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
 *         &lt;element name="GetSecureDownloadTokenResult" type="{Curse.AddOns}DownloadToken" minOccurs="0"/>
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
    "getSecureDownloadTokenResult"
})
@XmlRootElement(name = "GetSecureDownloadTokenResponse")
public class GetSecureDownloadTokenResponse {

    @XmlElementRef(name = "GetSecureDownloadTokenResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<DownloadToken> getSecureDownloadTokenResult;

    /**
     * Gets the value of the getSecureDownloadTokenResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DownloadToken }{@code >}
     *     
     */
    public JAXBElement<DownloadToken> getGetSecureDownloadTokenResult() {
        return getSecureDownloadTokenResult;
    }

    /**
     * Sets the value of the getSecureDownloadTokenResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DownloadToken }{@code >}
     *     
     */
    public void setGetSecureDownloadTokenResult(JAXBElement<DownloadToken> value) {
        this.getSecureDownloadTokenResult = value;
    }

}
