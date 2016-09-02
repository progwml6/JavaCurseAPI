
package org.datacontract.schemas._2004._07.curse_addonservice;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAddOnFileKey complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddOnFileKey">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddOnFileKey" type="{http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests}AddOnFileKey" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddOnFileKey", propOrder = {
    "addOnFileKey"
})
public class ArrayOfAddOnFileKey {

    @XmlElement(name = "AddOnFileKey", nillable = true)
    protected List<AddOnFileKey> addOnFileKey;

    /**
     * Gets the value of the addOnFileKey property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addOnFileKey property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOnFileKey().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddOnFileKey }
     * 
     * 
     */
    public List<AddOnFileKey> getAddOnFileKey() {
        if (addOnFileKey == null) {
            addOnFileKey = new ArrayList<AddOnFileKey>();
        }
        return this.addOnFileKey;
    }

}
