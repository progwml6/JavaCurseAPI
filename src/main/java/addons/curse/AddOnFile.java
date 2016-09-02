
package addons.curse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import com.microsoft.schemas._2003._10.serialization.arrays.ArrayOfstring;
import org.datacontract.schemas._2004._07.curse.FileStatus;
import org.datacontract.schemas._2004._07.curse.FileType;


/**
 * <p>Java class for AddOnFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AddOnFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AlternateFileId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Dependencies" type="{Curse.AddOns}ArrayOfAddOnFileDependency" minOccurs="0"/>
 *         &lt;element name="DownloadURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileNameOnDisk" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="FileStatus" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}FileStatus" minOccurs="0"/>
 *         &lt;element name="GameVersion" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/>
 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsAvailable" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="Modules" type="{Curse.AddOns}ArrayOfAddOnModule" minOccurs="0"/>
 *         &lt;element name="PackageFingerprint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="ReleaseType" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}FileType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddOnFile", propOrder = {
    "alternateFileId",
    "dependencies",
    "downloadURL",
    "fileDate",
    "fileName",
    "fileNameOnDisk",
    "fileStatus",
    "gameVersion",
    "id",
    "isAlternate",
    "isAvailable",
    "modules",
    "packageFingerprint",
    "releaseType"
})
public class AddOnFile {

    @XmlElement(name = "AlternateFileId")
    protected Integer alternateFileId;
    @XmlElementRef(name = "Dependencies", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOnFileDependency> dependencies;
    @XmlElementRef(name = "DownloadURL", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> downloadURL;
    @XmlElement(name = "FileDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fileDate;
    @XmlElementRef(name = "FileName", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileName;
    @XmlElementRef(name = "FileNameOnDisk", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<String> fileNameOnDisk;
    @XmlElement(name = "FileStatus")
    @XmlSchemaType(name = "string")
    protected FileStatus fileStatus;
    @XmlElementRef(name = "GameVersion", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> gameVersion;
    @XmlElement(name = "Id")
    protected Integer id;
    @XmlElement(name = "IsAlternate")
    protected Boolean isAlternate;
    @XmlElement(name = "IsAvailable")
    protected Boolean isAvailable;
    @XmlElementRef(name = "Modules", namespace = "Curse.AddOns", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfAddOnModule> modules;
    @XmlElement(name = "PackageFingerprint")
    protected Long packageFingerprint;
    @XmlElement(name = "ReleaseType")
    @XmlSchemaType(name = "string")
    protected FileType releaseType;

    /**
     * Gets the value of the alternateFileId property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAlternateFileId() {
        return alternateFileId;
    }

    /**
     * Sets the value of the alternateFileId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAlternateFileId(Integer value) {
        this.alternateFileId = value;
    }

    /**
     * Gets the value of the dependencies property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnFileDependency }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddOnFileDependency> getDependencies() {
        return dependencies;
    }

    /**
     * Sets the value of the dependencies property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnFileDependency }{@code >}
     *     
     */
    public void setDependencies(JAXBElement<ArrayOfAddOnFileDependency> value) {
        this.dependencies = value;
    }

    /**
     * Gets the value of the downloadURL property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDownloadURL() {
        return downloadURL;
    }

    /**
     * Sets the value of the downloadURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDownloadURL(JAXBElement<String> value) {
        this.downloadURL = value;
    }

    /**
     * Gets the value of the fileDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFileDate() {
        return fileDate;
    }

    /**
     * Sets the value of the fileDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFileDate(XMLGregorianCalendar value) {
        this.fileDate = value;
    }

    /**
     * Gets the value of the fileName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileName() {
        return fileName;
    }

    /**
     * Sets the value of the fileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileName(JAXBElement<String> value) {
        this.fileName = value;
    }

    /**
     * Gets the value of the fileNameOnDisk property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getFileNameOnDisk() {
        return fileNameOnDisk;
    }

    /**
     * Sets the value of the fileNameOnDisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setFileNameOnDisk(JAXBElement<String> value) {
        this.fileNameOnDisk = value;
    }

    /**
     * Gets the value of the fileStatus property.
     * 
     * @return
     *     possible object is
     *     {@link FileStatus }
     *     
     */
    public FileStatus getFileStatus() {
        return fileStatus;
    }

    /**
     * Sets the value of the fileStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileStatus }
     *     
     */
    public void setFileStatus(FileStatus value) {
        this.fileStatus = value;
    }

    /**
     * Gets the value of the gameVersion property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getGameVersion() {
        return gameVersion;
    }

    /**
     * Sets the value of the gameVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setGameVersion(JAXBElement<ArrayOfstring> value) {
        this.gameVersion = value;
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
     * Gets the value of the isAlternate property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAlternate() {
        return isAlternate;
    }

    /**
     * Sets the value of the isAlternate property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlternate(Boolean value) {
        this.isAlternate = value;
    }

    /**
     * Gets the value of the isAvailable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsAvailable() {
        return isAvailable;
    }

    /**
     * Sets the value of the isAvailable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAvailable(Boolean value) {
        this.isAvailable = value;
    }

    /**
     * Gets the value of the modules property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnModule }{@code >}
     *     
     */
    public JAXBElement<ArrayOfAddOnModule> getModules() {
        return modules;
    }

    /**
     * Sets the value of the modules property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfAddOnModule }{@code >}
     *     
     */
    public void setModules(JAXBElement<ArrayOfAddOnModule> value) {
        this.modules = value;
    }

    /**
     * Gets the value of the packageFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPackageFingerprint() {
        return packageFingerprint;
    }

    /**
     * Sets the value of the packageFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPackageFingerprint(Long value) {
        this.packageFingerprint = value;
    }

    /**
     * Gets the value of the releaseType property.
     * 
     * @return
     *     possible object is
     *     {@link FileType }
     *     
     */
    public FileType getReleaseType() {
        return releaseType;
    }

    /**
     * Sets the value of the releaseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FileType }
     *     
     */
    public void setReleaseType(FileType value) {
        this.releaseType = value;
    }

}
