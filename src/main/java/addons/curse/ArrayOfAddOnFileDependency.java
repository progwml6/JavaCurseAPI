
package addons.curse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfAddOnFileDependency complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAddOnFileDependency">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddOnFileDependency" type="{Curse.AddOns}AddOnFileDependency" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAddOnFileDependency", propOrder = {
    "addOnFileDependency"
})
public class ArrayOfAddOnFileDependency {

    @XmlElement(name = "AddOnFileDependency", nillable = true)
    protected List<AddOnFileDependency> addOnFileDependency;

    /**
     * Gets the value of the addOnFileDependency property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the addOnFileDependency property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddOnFileDependency().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AddOnFileDependency }
     * 
     * 
     */
    public List<AddOnFileDependency> getAddOnFileDependency() {
        if (addOnFileDependency == null) {
            addOnFileDependency = new ArrayList<AddOnFileDependency>();
        }
        return this.addOnFileDependency;
    }

}
