
package com.curse.addonservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="savedGameId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="savedGameRevisionId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
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
    "savedGameId",
    "savedGameRevisionId"
})
@XmlRootElement(name = "DeleteSavedGameRevision")
public class DeleteSavedGameRevision {

    protected Integer savedGameId;
    protected Integer savedGameRevisionId;

    /**
     * Gets the value of the savedGameId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSavedGameId() {
        return savedGameId;
    }

    /**
     * Sets the value of the savedGameId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSavedGameId(Integer value) {
        this.savedGameId = value;
    }

    /**
     * Gets the value of the savedGameRevisionId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSavedGameRevisionId() {
        return savedGameRevisionId;
    }

    /**
     * Sets the value of the savedGameRevisionId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSavedGameRevisionId(Integer value) {
        this.savedGameRevisionId = value;
    }

}
