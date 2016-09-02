
package org.datacontract.schemas._2004._07.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import addons.curse.ArrayOfAddOnFile;


/**
 * <p>Java class for RepositoryMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RepositoryMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="LatestFiles" type="{Curse.AddOns}ArrayOfAddOnFile" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RepositoryMatch", propOrder = {
    "id",
    "latestFiles"
})
public class RepositoryMatch {

    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "LatestFiles", namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOnFile> latestFiles;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setId(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the latestFiles property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddOnFile> getLatestFiles() {
        return latestFiles;
    }

    /**
     * Sets the value of the latestFiles property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnFile }{@code >}
     *     
     */
    public void setLatestFiles(JAXBElement<ArrayOfAddOnFile> value) {
        this.latestFiles = value;
    }

}
