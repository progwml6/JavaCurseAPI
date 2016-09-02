
package org.datacontract.schemas._2004._07.curse_serviceauthentication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LoginResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LoginResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Session" type="{http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models}AuthenticationSession" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models}AuthenticationStatus" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LoginResponse", propOrder = {
    "session",
    "status"
})
public class LoginResponse {

    @XmlElementRef(name = "Session", namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<AuthenticationSession> session;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected AuthenticationStatus status;

    /**
     * Gets the value of the session property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationSession }{@code >}
     *     
     */
    public JAXBElement<AuthenticationSession> getSession() {
        return session;
    }

    /**
     * Sets the value of the session property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AuthenticationSession }{@code >}
     *     
     */
    public void setSession(JAXBElement<AuthenticationSession> value) {
        this.session = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link AuthenticationStatus }
     *     
     */
    public AuthenticationStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthenticationStatus }
     *     
     */
    public void setStatus(AuthenticationStatus value) {
        this.status = value;
    }

}
