
package org.datacontract.schemas._2004._07.curse_clientservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for SyncedGameInstance complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SyncedGameInstance">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addons" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}ArrayOfSyncedAddon" minOccurs="0"/>
 *         &lt;element name="Computers" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}ArrayOfSyncedComputer" minOccurs="0"/>
 *         &lt;element name="GameID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InstanceID" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="InstanceName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastBackupDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastBackupFingerprint" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastBackupScreenHeight" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *         &lt;element name="LastBackupScreenWidth" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SyncedGameInstance", propOrder = {
    "addons",
    "computers",
    "gameID",
    "instanceID",
    "instanceName",
    "lastBackupDate",
    "lastBackupFingerprint",
    "lastBackupScreenHeight",
    "lastBackupScreenWidth"
})
public class SyncedGameInstance {

    @XmlElementRef(name = "Addons", namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSyncedAddon> addons;
    @XmlElementRef(name = "Computers", namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfSyncedComputer> computers;
    @XmlElement(name = "GameID")
    protected Integer gameID;
    @XmlElement(name = "InstanceID")
    protected Integer instanceID;
    @XmlElementRef(name = "InstanceName", namespace = "http://schemas.datacontract.org/2004/07/Curse.ClientService.Models", type = JAXBElement.class, required = false)
    protected JAXBElement<String> instanceName;
    @XmlElement(name = "LastBackupDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastBackupDate;
    @XmlElement(name = "LastBackupFingerprint")
    protected Long lastBackupFingerprint;
    @XmlElement(name = "LastBackupScreenHeight")
    protected Long lastBackupScreenHeight;
    @XmlElement(name = "LastBackupScreenWidth")
    protected Long lastBackupScreenWidth;

    /**
     * Gets the value of the addons property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSyncedAddon }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSyncedAddon> getAddons() {
        return addons;
    }

    /**
     * Sets the value of the addons property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSyncedAddon }{@code >}
     *     
     */
    public void setAddons(JAXBElement<ArrayOfSyncedAddon> value) {
        this.addons = value;
    }

    /**
     * Gets the value of the computers property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSyncedComputer }{@code >}
     *     
     */
    public JAXBElement<ArrayOfSyncedComputer> getComputers() {
        return computers;
    }

    /**
     * Sets the value of the computers property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfSyncedComputer }{@code >}
     *     
     */
    public void setComputers(JAXBElement<ArrayOfSyncedComputer> value) {
        this.computers = value;
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
     * Gets the value of the instanceID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstanceID() {
        return instanceID;
    }

    /**
     * Sets the value of the instanceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstanceID(Integer value) {
        this.instanceID = value;
    }

    /**
     * Gets the value of the instanceName property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getInstanceName() {
        return instanceName;
    }

    /**
     * Sets the value of the instanceName property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setInstanceName(JAXBElement<String> value) {
        this.instanceName = value;
    }

    /**
     * Gets the value of the lastBackupDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastBackupDate() {
        return lastBackupDate;
    }

    /**
     * Sets the value of the lastBackupDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastBackupDate(XMLGregorianCalendar value) {
        this.lastBackupDate = value;
    }

    /**
     * Gets the value of the lastBackupFingerprint property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastBackupFingerprint() {
        return lastBackupFingerprint;
    }

    /**
     * Sets the value of the lastBackupFingerprint property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastBackupFingerprint(Long value) {
        this.lastBackupFingerprint = value;
    }

    /**
     * Gets the value of the lastBackupScreenHeight property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastBackupScreenHeight() {
        return lastBackupScreenHeight;
    }

    /**
     * Sets the value of the lastBackupScreenHeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastBackupScreenHeight(Long value) {
        this.lastBackupScreenHeight = value;
    }

    /**
     * Gets the value of the lastBackupScreenWidth property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getLastBackupScreenWidth() {
        return lastBackupScreenWidth;
    }

    /**
     * Sets the value of the lastBackupScreenWidth property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setLastBackupScreenWidth(Long value) {
        this.lastBackupScreenWidth = value;
    }

}
