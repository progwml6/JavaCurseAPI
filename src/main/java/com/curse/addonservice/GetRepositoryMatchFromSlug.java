
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="gameSlug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="addonSlug" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "gameSlug",
    "addonSlug"
})
@XmlRootElement(name = "GetRepositoryMatchFromSlug")
public class GetRepositoryMatchFromSlug {

    @XmlElementRef(name = "gameSlug", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gameSlug;
    @XmlElementRef(name = "addonSlug", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<String> addonSlug;

    /**
     * Gets the value of the gameSlug property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGameSlug() {
        return gameSlug;
    }

    /**
     * Sets the value of the gameSlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGameSlug(JAXBElement<String> value) {
        this.gameSlug = value;
    }

    /**
     * Gets the value of the addonSlug property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getAddonSlug() {
        return addonSlug;
    }

    /**
     * Sets the value of the addonSlug property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setAddonSlug(JAXBElement<String> value) {
        this.addonSlug = value;
    }

}
