
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import addons.curse.ArrayOfFuzzyMatch;


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
 *         &lt;element name="GetFuzzyMatchesResult" type="{Curse.AddOns}ArrayOfFuzzyMatch" minOccurs="0"/>
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
    "getFuzzyMatchesResult"
})
@XmlRootElement(name = "GetFuzzyMatchesResponse")
public class GetFuzzyMatchesResponse {

    @XmlElementRef(name = "GetFuzzyMatchesResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFuzzyMatch> getFuzzyMatchesResult;

    /**
     * Gets the value of the getFuzzyMatchesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFuzzyMatch }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFuzzyMatch> getGetFuzzyMatchesResult() {
        return getFuzzyMatchesResult;
    }

    /**
     * Sets the value of the getFuzzyMatchesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFuzzyMatch }{@code >}
     *     
     */
    public void setGetFuzzyMatchesResult(JAXBElement<ArrayOfFuzzyMatch> value) {
        this.getFuzzyMatchesResult = value;
    }

}
