
package org.datacontract.schemas._2004._07.curse_clientservice;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ESavedGameRestrictionLevel.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ESavedGameRestrictionLevel">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Disabled"/>
 *     &lt;enumeration value="PremiumOnly"/>
 *     &lt;enumeration value="AllUsers"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ESavedGameRestrictionLevel")
@XmlEnum
public enum ESavedGameRestrictionLevel {

    @XmlEnumValue("Disabled")
    DISABLED("Disabled"),
    @XmlEnumValue("PremiumOnly")
    PREMIUM_ONLY("PremiumOnly"),
    @XmlEnumValue("AllUsers")
    ALL_USERS("AllUsers");
    private final String value;

    ESavedGameRestrictionLevel(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ESavedGameRestrictionLevel fromValue(String v) {
        for (ESavedGameRestrictionLevel c: ESavedGameRestrictionLevel.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
