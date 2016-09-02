
package addons.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FingerprintMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FingerprintMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="File" type="{Curse.AddOns}AddOnFile" minOccurs="0"/>
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
@XmlType(name = "FingerprintMatch", propOrder = {
    "file",
    "id",
    "latestFiles"
})
public class FingerprintMatch {

    @XmlElementRef(name = "File", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<AddOnFile> file;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElementRef(name = "LatestFiles", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOnFile> latestFiles;

    /**
     * Gets the value of the file property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AddOnFile }{@code >}
     *     
     */
    public JAXBElement<AddOnFile> getFile() {
        return file;
    }

    /**
     * Sets the value of the file property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AddOnFile }{@code >}
     *     
     */
    public void setFile(JAXBElement<AddOnFile> value) {
        this.file = value;
    }

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
