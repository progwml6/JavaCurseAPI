
package org.datacontract.schemas._2004._07.curse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for FileStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="FileStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="SemiNormal"/>
 *     &lt;enumeration value="Reported"/>
 *     &lt;enumeration value="Malformed"/>
 *     &lt;enumeration value="Locked"/>
 *     &lt;enumeration value="InvalidLayout"/>
 *     &lt;enumeration value="Hidden"/>
 *     &lt;enumeration value="NeedsApproval"/>
 *     &lt;enumeration value="Deleted"/>
 *     &lt;enumeration value="UnderReview"/>
 *     &lt;enumeration value="MalwareDetected"/>
 *     &lt;enumeration value="WaitingOnProject"/>
 *     &lt;enumeration value="ClientOnly"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "FileStatus")
@XmlEnum
public enum FileStatus {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("SemiNormal")
    SEMI_NORMAL("SemiNormal"),
    @XmlEnumValue("Reported")
    REPORTED("Reported"),
    @XmlEnumValue("Malformed")
    MALFORMED("Malformed"),
    @XmlEnumValue("Locked")
    LOCKED("Locked"),
    @XmlEnumValue("InvalidLayout")
    INVALID_LAYOUT("InvalidLayout"),
    @XmlEnumValue("Hidden")
    HIDDEN("Hidden"),
    @XmlEnumValue("NeedsApproval")
    NEEDS_APPROVAL("NeedsApproval"),
    @XmlEnumValue("Deleted")
    DELETED("Deleted"),
    @XmlEnumValue("UnderReview")
    UNDER_REVIEW("UnderReview"),
    @XmlEnumValue("MalwareDetected")
    MALWARE_DETECTED("MalwareDetected"),
    @XmlEnumValue("WaitingOnProject")
    WAITING_ON_PROJECT("WaitingOnProject"),
    @XmlEnumValue("ClientOnly")
    CLIENT_ONLY("ClientOnly");
    private final String value;

    FileStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static FileStatus fromValue(String v) {
        for (FileStatus c: FileStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
