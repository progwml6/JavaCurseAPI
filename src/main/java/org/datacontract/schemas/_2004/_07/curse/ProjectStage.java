
package org.datacontract.schemas._2004._07.curse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProjectStage.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProjectStage">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Alpha"/>
 *     &lt;enumeration value="Beta"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="Inactive"/>
 *     &lt;enumeration value="Mature"/>
 *     &lt;enumeration value="Planning"/>
 *     &lt;enumeration value="Release"/>
 *     &lt;enumeration value="Abandoned"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProjectStage")
@XmlEnum
public enum ProjectStage {

    @XmlEnumValue("Alpha")
    ALPHA("Alpha"),
    @XmlEnumValue("Beta")
    BETA("Beta"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("Inactive")
    INACTIVE("Inactive"),
    @XmlEnumValue("Mature")
    MATURE("Mature"),
    @XmlEnumValue("Planning")
    PLANNING("Planning"),
    @XmlEnumValue("Release")
    RELEASE("Release"),
    @XmlEnumValue("Abandoned")
    ABANDONED("Abandoned");
    private final String value;

    ProjectStage(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProjectStage fromValue(String v) {
        for (ProjectStage c: ProjectStage.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
