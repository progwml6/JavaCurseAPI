
package org.datacontract.schemas._2004._07.curse_clientservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSyncedAddon complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSyncedAddon">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SyncedAddon" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}SyncedAddon" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSyncedAddon", propOrder = {
    "syncedAddon"
})
public class ArrayOfSyncedAddon {

    @XmlElement(name = "SyncedAddon", nillable = true)
    protected List<SyncedAddon> syncedAddon;

    /**
     * Gets the value of the syncedAddon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the syncedAddon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSyncedAddon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyncedAddon }
     * 
     * 
     */
    public List<SyncedAddon> getSyncedAddon() {
        if (syncedAddon == null) {
            syncedAddon = new ArrayList<SyncedAddon>();
        }
        return this.syncedAddon;
    }

}
