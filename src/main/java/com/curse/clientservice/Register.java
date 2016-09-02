
package com.curse.clientservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse_serviceauthentication.RegisterRequest;


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
 *         &lt;element name="registerRequest" type="{http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models}RegisterRequest" minOccurs="0"/>
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
    "registerRequest"
})
@XmlRootElement(name = "Register")
public class Register {

    @XmlElementRef(name = "registerRequest", namespace = "http://clientservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<RegisterRequest> registerRequest;

    /**
     * Gets the value of the registerRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link RegisterRequest }{@code >}
     *     
     */
    public JAXBElement<RegisterRequest> getRegisterRequest() {
        return registerRequest;
    }

    /**
     * Sets the value of the registerRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link RegisterRequest }{@code >}
     *     
     */
    public void setRegisterRequest(JAXBElement<RegisterRequest> value) {
        this.registerRequest = value;
    }

}
