
package org.datacontract.schemas._2004._07.curse_clientservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSyncTransaction complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSyncTransaction">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SyncTransaction" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}SyncTransaction" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSyncTransaction", propOrder = {
    "syncTransaction"
})
public class ArrayOfSyncTransaction {

    @XmlElement(name = "SyncTransaction", nillable = true)
    protected List<SyncTransaction> syncTransaction;

    /**
     * Gets the value of the syncTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the syncTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSyncTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SyncTransaction }
     * 
     * 
     */
    public List<SyncTransaction> getSyncTransaction() {
        if (syncTransaction == null) {
            syncTransaction = new ArrayList<SyncTransaction>();
        }
        return this.syncTransaction;
    }

}
