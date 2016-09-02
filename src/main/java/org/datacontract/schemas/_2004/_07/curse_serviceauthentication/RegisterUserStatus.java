
package org.datacontract.schemas._2004._07.curse_serviceauthentication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RegisterUserStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RegisterUserStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Successful"/>
 *     &lt;enumeration value="EmailInUse"/>
 *     &lt;enumeration value="UsernameInUse"/>
 *     &lt;enumeration value="InsufficientPermissions"/>
 *     &lt;enumeration value="InvalidProfile"/>
 *     &lt;enumeration value="InvalidUsername"/>
 *     &lt;enumeration value="InvalidNetworkSite"/>
 *     &lt;enumeration value="InvalidPassword"/>
 *     &lt;enumeration value="UnknownError"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "RegisterUserStatus")
@XmlEnum
public enum RegisterUserStatus {

    @XmlEnumValue("Successful")
    SUCCESSFUL("Successful"),
    @XmlEnumValue("EmailInUse")
    EMAIL_IN_USE("EmailInUse"),
    @XmlEnumValue("UsernameInUse")
    USERNAME_IN_USE("UsernameInUse"),
    @XmlEnumValue("InsufficientPermissions")
    INSUFFICIENT_PERMISSIONS("InsufficientPermissions"),
    @XmlEnumValue("InvalidProfile")
    INVALID_PROFILE("InvalidProfile"),
    @XmlEnumValue("InvalidUsername")
    INVALID_USERNAME("InvalidUsername"),
    @XmlEnumValue("InvalidNetworkSite")
    INVALID_NETWORK_SITE("InvalidNetworkSite"),
    @XmlEnumValue("InvalidPassword")
    INVALID_PASSWORD("InvalidPassword"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError");
    private final String value;

    RegisterUserStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RegisterUserStatus fromValue(String v) {
        for (RegisterUserStatus c: RegisterUserStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
