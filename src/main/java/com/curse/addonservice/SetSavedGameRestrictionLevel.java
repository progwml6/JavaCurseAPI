
package com.curse.addonservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse_clientservice.ESavedGameRestrictionLevel;


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
 *         &lt;element name="restrictionLevel" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}ESavedGameRestrictionLevel" minOccurs="0"/>
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
    "restrictionLevel"
})
@XmlRootElement(name = "SetSavedGameRestrictionLevel")
public class SetSavedGameRestrictionLevel {

    @XmlSchemaType(name = "string")
    protected ESavedGameRestrictionLevel restrictionLevel;

    /**
     * Gets the value of the restrictionLevel property.
     * 
     * @return
     *     possible object is
     *     {@link ESavedGameRestrictionLevel }
     *     
     */
    public ESavedGameRestrictionLevel getRestrictionLevel() {
        return restrictionLevel;
    }

    /**
     * Sets the value of the restrictionLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link ESavedGameRestrictionLevel }
     *     
     */
    public void setRestrictionLevel(ESavedGameRestrictionLevel value) {
        this.restrictionLevel = value;
    }

}
