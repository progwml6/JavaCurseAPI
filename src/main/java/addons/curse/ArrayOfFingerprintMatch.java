
package addons.curse;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfFingerprintMatch complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfFingerprintMatch">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FingerprintMatch" type="{Curse.AddOns}FingerprintMatch" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfFingerprintMatch", propOrder = {
    "fingerprintMatch"
})
public class ArrayOfFingerprintMatch {

    @XmlElement(name = "FingerprintMatch", nillable = true)
    protected List<FingerprintMatch> fingerprintMatch;

    /**
     * Gets the value of the fingerprintMatch property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fingerprintMatch property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFingerprintMatch().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FingerprintMatch }
     * 
     * 
     */
    public List<FingerprintMatch> getFingerprintMatch() {
        if (fingerprintMatch == null) {
            fingerprintMatch = new ArrayList<FingerprintMatch>();
        }
        return this.fingerprintMatch;
    }

}
