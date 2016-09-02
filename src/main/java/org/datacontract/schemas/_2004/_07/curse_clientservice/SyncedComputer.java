
package org.datacontract.schemas._2004._07.curse_clientservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SyncedComputer complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncedComputer">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComputerID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ComputerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstanceGuid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstanceLabel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncedComputer", propOrder = {
    "computerID",
    "computerName",
    "instanceGuid",
    "instanceLabel"
})
public class SyncedComputer {

    @XmlElement(name = "ComputerID")
    protected Integer computerID;
    @XmlElementRef(name = "ComputerName", namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> computerName;
    @XmlElementRef(name = "InstanceGuid", namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceGuid;
    @XmlElementRef(name = "InstanceLabel", namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceLabel;

    /**
     * Gets the value of the computerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getComputerID() {
        return computerID;
    }

    /**
     * Sets the value of the computerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setComputerID(Integer value) {
        this.computerID = value;
    }

    /**
     * Gets the value of the computerName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getComputerName() {
        return computerName;
    }

    /**
     * Sets the value of the computerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setComputerName(JAXBElement<String> value) {
        this.computerName = value;
    }

    /**
     * Gets the value of the instanceGuid property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstanceGuid() {
        return instanceGuid;
    }

    /**
     * Sets the value of the instanceGuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstanceGuid(JAXBElement<String> value) {
        this.instanceGuid = value;
    }

    /**
     * Gets the value of the instanceLabel property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstanceLabel() {
        return instanceLabel;
    }

    /**
     * Sets the value of the instanceLabel property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstanceLabel(JAXBElement<String> value) {
        this.instanceLabel = value;
    }

}
