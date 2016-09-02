
package org.datacontract.schemas._2004._07.curse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFolderFingerprint complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFolderFingerprint">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FolderFingerprint" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}FolderFingerprint" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFolderFingerprint", propOrder = {
    "folderFingerprint"
})
public class ArrayOfFolderFingerprint {

    @XmlElement(name = "FolderFingerprint", nillable = true)
    protected List<FolderFingerprint> folderFingerprint;

    /**
     * Gets the value of the folderFingerprint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the folderFingerprint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFolderFingerprint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FolderFingerprint }
     * 
     * 
     */
    public List<FolderFingerprint> getFolderFingerprint() {
        if (folderFingerprint == null) {
            folderFingerprint = new ArrayList<FolderFingerprint>();
        }
        return this.folderFingerprint;
    }

}
