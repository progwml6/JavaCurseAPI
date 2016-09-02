
package addons.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FingerprintMatchResult complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FingerprintMatchResult">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExactMatches" type="{Curse.AddOns}ArrayOfFingerprintMatch" minOccurs="0"/>
 *         &lt;element name="IsCacheBuilt" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="PartialMatches" type="{Curse.AddOns}ArrayOfFingerprintMatch" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FingerprintMatchResult", propOrder = {
    "exactMatches",
    "isCacheBuilt",
    "partialMatches"
})
public class FingerprintMatchResult {

    @XmlElementRef(name = "ExactMatches", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFingerprintMatch> exactMatches;
    @XmlElement(name = "IsCacheBuilt")
    protected Boolean isCacheBuilt;
    @XmlElementRef(name = "PartialMatches", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfFingerprintMatch> partialMatches;

    /**
     * Gets the value of the exactMatches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFingerprintMatch }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFingerprintMatch> getExactMatches() {
        return exactMatches;
    }

    /**
     * Sets the value of the exactMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFingerprintMatch }{@code >}
     *     
     */
    public void setExactMatches(JAXBElement<ArrayOfFingerprintMatch> value) {
        this.exactMatches = value;
    }

    /**
     * Gets the value of the isCacheBuilt property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsCacheBuilt() {
        return isCacheBuilt;
    }

    /**
     * Sets the value of the isCacheBuilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCacheBuilt(Boolean value) {
        this.isCacheBuilt = value;
    }

    /**
     * Gets the value of the partialMatches property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFingerprintMatch }{@code >}
     *     
     */
    public JAXBElement<ArrayOfFingerprintMatch> getPartialMatches() {
        return partialMatches;
    }

    /**
     * Sets the value of the partialMatches property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfFingerprintMatch }{@code >}
     *     
     */
    public void setPartialMatches(JAXBElement<ArrayOfFingerprintMatch> value) {
        this.partialMatches = value;
    }

}
