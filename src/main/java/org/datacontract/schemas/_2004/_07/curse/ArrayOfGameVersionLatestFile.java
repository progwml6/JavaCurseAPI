
package org.datacontract.schemas._2004._07.curse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfGameVersionLatestFile complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfGameVersionLatestFile">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GameVersionLatestFile" type="{http://schemas.datacontract.org/2004/07/Curse.AddOns}GameVersionLatestFile" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfGameVersionLatestFile", propOrder = {
    "gameVersionLatestFile"
})
public class ArrayOfGameVersionLatestFile {

    @XmlElement(name = "GameVersionLatestFile", nillable = true)
    protected List<GameVersionLatestFile> gameVersionLatestFile;

    /**
     * Gets the value of the gameVersionLatestFile property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the gameVersionLatestFile property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGameVersionLatestFile().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GameVersionLatestFile }
     * 
     * 
     */
    public List<GameVersionLatestFile> getGameVersionLatestFile() {
        if (gameVersionLatestFile == null) {
            gameVersionLatestFile = new ArrayList<GameVersionLatestFile>();
        }
        return this.gameVersionLatestFile;
    }

}
