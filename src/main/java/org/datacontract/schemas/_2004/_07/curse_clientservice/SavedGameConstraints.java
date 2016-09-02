
package org.datacontract.schemas._2004._07.curse_clientservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SavedGameConstraints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SavedGameConstraints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaxRevionCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MaxSavedGameCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SavedGameConstraints", propOrder = {
    "maxRevionCount",
    "maxSavedGameCount"
})
public class SavedGameConstraints {

    @XmlElement(name = "MaxRevionCount")
    protected Integer maxRevionCount;
    @XmlElement(name = "MaxSavedGameCount")
    protected Integer maxSavedGameCount;

    /**
     * Gets the value of the maxRevionCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxRevionCount() {
        return maxRevionCount;
    }

    /**
     * Sets the value of the maxRevionCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxRevionCount(Integer value) {
        this.maxRevionCount = value;
    }

    /**
     * Gets the value of the maxSavedGameCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxSavedGameCount() {
        return maxSavedGameCount;
    }

    /**
     * Sets the value of the maxSavedGameCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxSavedGameCount(Integer value) {
        this.maxSavedGameCount = value;
    }

}
