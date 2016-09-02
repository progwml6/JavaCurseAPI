
package org.datacontract.schemas._2004._07.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GameVersionLatestFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GameVersionLatestFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FileType" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}FileType" minOccurs="0"/>
 *         &lt;element name="GameVesion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProjectFileID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GameVersionLatestFile", propOrder = {
    "fileType",
    "gameVesion",
    "projectFileID",
    "projectFileName"
})
public class GameVersionLatestFile {

    @XmlElement(name = "FileType")
    @XmlSchemaType(name = "string")
    protected FileType fileType;
    @XmlElementRef(name = "GameVesion", namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> gameVesion;
    @XmlElement(name = "ProjectFileID")
    protected Integer projectFileID;
    @XmlElementRef(name = "ProjectFileName", namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> projectFileName;

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link FileType }
     *     
     */
    public FileType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileType }
     *     
     */
    public void setFileType(FileType value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the gameVesion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getGameVesion() {
        return gameVesion;
    }

    /**
     * Sets the value of the gameVesion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setGameVesion(JAXBElement<String> value) {
        this.gameVesion = value;
    }

    /**
     * Gets the value of the projectFileID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProjectFileID() {
        return projectFileID;
    }

    /**
     * Sets the value of the projectFileID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProjectFileID(Integer value) {
        this.projectFileID = value;
    }

    /**
     * Gets the value of the projectFileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProjectFileName() {
        return projectFileName;
    }

    /**
     * Sets the value of the projectFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProjectFileName(JAXBElement<String> value) {
        this.projectFileName = value;
    }

}
