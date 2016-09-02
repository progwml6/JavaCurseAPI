
package com.curse.addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse.ArrayOfFolderFingerprint;


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
 *         &lt;element name="gameID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="folderFingerprints" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}ArrayOfFolderFingerprint" minOccurs="0"/>
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
    "gameID",
    "folderFingerprints"
})
@XmlRootElement(name = "GetFuzzyMatches")
public class GetFuzzyMatches {

    protected Integer gameID;
    @XmlElementRef(name = "folderFingerprints", namespace = "http://addonservice.curse.com/", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFolderFingerprint> folderFingerprints;

    /**
     * Gets the value of the gameID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGameID() {
        return gameID;
    }

    /**
     * Sets the value of the gameID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGameID(Integer value) {
        this.gameID = value;
    }

    /**
     * Gets the value of the folderFingerprints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFolderFingerprint }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFolderFingerprint> getFolderFingerprints() {
        return folderFingerprints;
    }

    /**
     * Sets the value of the folderFingerprints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFolderFingerprint }{@code >}
     *     
     */
    public void setFolderFingerprints(JAXBElement<ArrayOfFolderFingerprint> value) {
        this.folderFingerprints = value;
    }

}
