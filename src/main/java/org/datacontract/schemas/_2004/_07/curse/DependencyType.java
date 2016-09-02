
package org.datacontract.schemas._2004._07.curse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DependencyType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="DependencyType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="Embedded"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "DependencyType")
@XmlEnum
public enum DependencyType {

    @XmlEnumValue("Required")
    REQUIRED("Required"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Embedded")
    EMBEDDED("Embedded");
    private final String value;

    DependencyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static DependencyType fromValue(String v) {
        for (DependencyType c: DependencyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
