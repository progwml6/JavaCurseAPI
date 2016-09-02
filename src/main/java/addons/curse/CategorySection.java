
package addons.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import org.datacontract.schemas._2004._07.curse.PackageTypes;


/**
 * <p>Java class for CategorySection complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CategorySection">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtraIncludePattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="GameID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InitialInclusionPattern" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PackageType" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}PackageTypes" minOccurs="0"/>
 *         &lt;element name="Path" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategorySection", propOrder = {
    "extraIncludePattern",
    "gameID",
    "id",
    "initialInclusionPattern",
    "name",
    "packageType",
    "path"
})
public class CategorySection {

    @XmlElementRef(name = "ExtraIncludePattern", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> extraIncludePattern;
    @XmlElement(name = "GameID")
    protected Integer gameID;
    @XmlElement(name = "ID")
    protected Integer id;
    @XmlElementRef(name = "InitialInclusionPattern", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> initialInclusionPattern;
    @XmlElementRef(name = "Name", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> name;
    @XmlElement(name = "PackageType")
    @XmlSchemaType(name = "string")
    protected PackageTypes packageType;
    @XmlElementRef(name = "Path", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> path;

    /**
     * Gets the value of the extraIncludePattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getExtraIncludePattern() {
        return extraIncludePattern;
    }

    /**
     * Sets the value of the extraIncludePattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setExtraIncludePattern(JAXBElement<String> value) {
        this.extraIncludePattern = value;
    }

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
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getID() {
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
    public void setID(Integer value) {
        this.id = value;
    }

    /**
     * Gets the value of the initialInclusionPattern property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInitialInclusionPattern() {
        return initialInclusionPattern;
    }

    /**
     * Sets the value of the initialInclusionPattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInitialInclusionPattern(JAXBElement<String> value) {
        this.initialInclusionPattern = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setName(JAXBElement<String> value) {
        this.name = value;
    }

    /**
     * Gets the value of the packageType property.
     * 
     * @return
     *     possible object is
     *     {@link PackageTypes }
     *     
     */
    public PackageTypes getPackageType() {
        return packageType;
    }

    /**
     * Sets the value of the packageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link PackageTypes }
     *     
     */
    public void setPackageType(PackageTypes value) {
        this.packageType = value;
    }

    /**
     * Gets the value of the path property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPath() {
        return path;
    }

    /**
     * Sets the value of the path property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPath(JAXBElement<String> value) {
        this.path = value;
    }

}
