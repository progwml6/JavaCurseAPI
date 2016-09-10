
package org.datacontract.schemas._2004._07.curse_clientservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ServiceResponseOfESavedGameRestrictionLeveleheogrl4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceResponseOfESavedGameRestrictionLeveleheogrl4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Status" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}ServiceResponseStatus" minOccurs="0"/>
 *         &lt;element name="Value" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}ESavedGameRestrictionLevel" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceResponseOfESavedGameRestrictionLeveleheogrl4", propOrder = {
    "message",
    "status",
    "value"
})
public class ServiceResponseOfESavedGameRestrictionLeveleheogrl4 {

    @XmlElementRef(name = "Message", namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> message;
    @XmlElement(name = "Status")
    @XmlSchemaType(name = "string")
    protected ServiceResponseStatus status;
    @XmlElement(name = "Value")
    @XmlSchemaType(name = "string")
    protected ESavedGameRestrictionLevel value;

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setMessage(JAXBElement<String> value) {
        this.message = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceResponseStatus }
     *     
     */
    public ServiceResponseStatus getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceResponseStatus }
     *     
     */
    public void setStatus(ServiceResponseStatus value) {
        this.status = value;
    }

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link ESavedGameRestrictionLevel }
     *     
     */
    public ESavedGameRestrictionLevel getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESavedGameRestrictionLevel }
     *     
     */
    public void setValue(ESavedGameRestrictionLevel value) {
        this.value = value;
    }

}