
package org.datacontract.schemas._2004._07.curse_clientservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SavedGameRevisionStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SavedGameRevisionStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Active"/>
 *     &lt;enumeration value="Deleted"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SavedGameRevisionStatus")
@XmlEnum
public enum SavedGameRevisionStatus {

    @XmlEnumValue("Active")
    ACTIVE("Active"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted");
    private final String value;

    SavedGameRevisionStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SavedGameRevisionStatus fromValue(String v) {
        for (SavedGameRevisionStatus c: SavedGameRevisionStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
