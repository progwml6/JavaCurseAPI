
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp;


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
 *         &lt;element name="GetAddOnFilesResult" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp" minOccurs="0"/>
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
    "getAddOnFilesResult"
})
@XmlRootElement(name = "GetAddOnFilesResponse")
public class GetAddOnFilesResponse {

    @XmlElementRef(name = "GetAddOnFilesResult", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp> getAddOnFilesResult;

    /**
     * Gets the value of the getAddOnFilesResult property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp }{@code >}
     *     
     */
    public JAXBElement<ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp> getGetAddOnFilesResult() {
        return getAddOnFilesResult;
    }

    /**
     * Sets the value of the getAddOnFilesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp }{@code >}
     *     
     */
    public void setGetAddOnFilesResult(JAXBElement<ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp> value) {
        this.getAddOnFilesResult = value;
    }

}
