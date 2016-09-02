
package org.datacontract.schemas._2004._07.curse_clientservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSavedGameRevision complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSavedGameRevision">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SavedGameRevision" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}SavedGameRevision" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSavedGameRevision", propOrder = {
    "savedGameRevision"
})
public class ArrayOfSavedGameRevision {

    @XmlElement(name = "SavedGameRevision", nillable = true)
    protected List<SavedGameRevision> savedGameRevision;

    /**
     * Gets the value of the savedGameRevision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the savedGameRevision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSavedGameRevision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedGameRevision }
     * 
     * 
     */
    public List<SavedGameRevision> getSavedGameRevision() {
        if (savedGameRevision == null) {
            savedGameRevision = new ArrayList<SavedGameRevision>();
        }
        return this.savedGameRevision;
    }

}
