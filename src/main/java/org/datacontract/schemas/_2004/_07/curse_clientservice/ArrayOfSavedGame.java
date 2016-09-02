
package org.datacontract.schemas._2004._07.curse_clientservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfSavedGame complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfSavedGame">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SavedGame" type="{http://schemas.datacontract.org/2004/07/Curse.ClientService.Models}SavedGame" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfSavedGame", propOrder = {
    "savedGame"
})
public class ArrayOfSavedGame {

    @XmlElement(name = "SavedGame", nillable = true)
    protected List<SavedGame> savedGame;

    /**
     * Gets the value of the savedGame property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the savedGame property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSavedGame().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SavedGame }
     * 
     * 
     */
    public List<SavedGame> getSavedGame() {
        if (savedGame == null) {
            savedGame = new ArrayList<SavedGame>();
        }
        return this.savedGame;
    }

}
