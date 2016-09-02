
package com.curse.clientservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse_serviceauthentication.LoginRequest;


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
 *         &lt;element name="loginRequest" type="{http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models}LoginRequest" minOccurs="0"/>
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
    "loginRequest"
})
@XmlRootElement(name = "Login")
public class Login {

    @XmlElementRef(name = "loginRequest", namespace = "http://clientservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<LoginRequest> loginRequest;

    /**
     * Gets the value of the loginRequest property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}
     *     
     */
    public JAXBElement<LoginRequest> getLoginRequest() {
        return loginRequest;
    }

    /**
     * Sets the value of the loginRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}
     *     
     */
    public void setLoginRequest(JAXBElement<LoginRequest> value) {
        this.loginRequest = value;
    }

}
