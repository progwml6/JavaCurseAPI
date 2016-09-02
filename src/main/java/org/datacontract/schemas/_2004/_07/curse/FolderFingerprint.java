
package org.datacontract.schemas._2004._07.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOflong;


/**
 * <p>Java class for FolderFingerprint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FolderFingerprint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Fingerprints" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOflong" minOccurs="0"/>
 *         &lt;element name="Foldername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderFingerprint", propOrder = {
    "fingerprints",
    "foldername"
})
public class FolderFingerprint {

    @XmlElementRef(name = "Fingerprints", namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOflong> fingerprints;
    @XmlElementRef(name = "Foldername", namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> foldername;

    /**
     * Gets the value of the fingerprints property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public JAXBElement<ArrayOflong> getFingerprints() {
        return fingerprints;
    }

    /**
     * Sets the value of the fingerprints property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOflong }{@code >}
     *     
     */
    public void setFingerprints(JAXBElement<ArrayOflong> value) {
        this.fingerprints = value;
    }

    /**
     * Gets the value of the foldername property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFoldername() {
        return foldername;
    }

    /**
     * Sets the value of the foldername property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFoldername(JAXBElement<String> value) {
        this.foldername = value;
    }

}
