
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse_addonservice.ArrayOfAddOnFileKey;


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
 *         &lt;element name="addOnFileKeys" type="{http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests}ArrayOfAddOnFileKey" minOccurs="0"/>
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
    "addOnFileKeys"
})
@XmlRootElement(name = "GetAddOnFiles")
public class GetAddOnFiles {

    @XmlElementRef(name = "addOnFileKeys", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOnFileKey> addOnFileKeys;

    /**
     * Gets the value of the addOnFileKeys property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnFileKey }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddOnFileKey> getAddOnFileKeys() {
        return addOnFileKeys;
    }

    /**
     * Sets the value of the addOnFileKeys property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnFileKey }{@code >}
     *     
     */
    public void setAddOnFileKeys(JAXBElement<ArrayOfAddOnFileKey> value) {
        this.addOnFileKeys = value;
    }

}
