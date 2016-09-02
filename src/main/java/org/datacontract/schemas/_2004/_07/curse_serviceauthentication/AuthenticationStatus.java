
package org.datacontract.schemas._2004._07.curse_serviceauthentication;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AuthenticationStatus.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AuthenticationStatus">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Unsuccessful"/>
 *     &lt;enumeration value="Success"/>
 *     &lt;enumeration value="InvalidSession"/>
 *     &lt;enumeration value="UnauthorizedLogin"/>
 *     &lt;enumeration value="InvalidPassword"/>
 *     &lt;enumeration value="UnknownUsername"/>
 *     &lt;enumeration value="UnknownEmail"/>
 *     &lt;enumeration value="UnknownError"/>
 *     &lt;enumeration value="IncorrectTime"/>
 *     &lt;enumeration value="CorruptLibrary"/>
 *     &lt;enumeration value="OutdatedClient"/>
 *     &lt;enumeration value="SubscriptionMismatch"/>
 *     &lt;enumeration value="SubscriptionExpired"/>
 *     &lt;enumeration value="InsufficientAccessLevel"/>
 *     &lt;enumeration value="InvalidApiKey"/>
 *     &lt;enumeration value="MissingGrant"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AuthenticationStatus")
@XmlEnum
public enum AuthenticationStatus {

    @XmlEnumValue("Unsuccessful")
    UNSUCCESSFUL("Unsuccessful"),
    @XmlEnumValue("Success")
    SUCCESS("Success"),
    @XmlEnumValue("InvalidSession")
    INVALID_SESSION("InvalidSession"),
    @XmlEnumValue("UnauthorizedLogin")
    UNAUTHORIZED_LOGIN("UnauthorizedLogin"),
    @XmlEnumValue("InvalidPassword")
    INVALID_PASSWORD("InvalidPassword"),
    @XmlEnumValue("UnknownUsername")
    UNKNOWN_USERNAME("UnknownUsername"),
    @XmlEnumValue("UnknownEmail")
    UNKNOWN_EMAIL("UnknownEmail"),
    @XmlEnumValue("UnknownError")
    UNKNOWN_ERROR("UnknownError"),
    @XmlEnumValue("IncorrectTime")
    INCORRECT_TIME("IncorrectTime"),
    @XmlEnumValue("CorruptLibrary")
    CORRUPT_LIBRARY("CorruptLibrary"),
    @XmlEnumValue("OutdatedClient")
    OUTDATED_CLIENT("OutdatedClient"),
    @XmlEnumValue("SubscriptionMismatch")
    SUBSCRIPTION_MISMATCH("SubscriptionMismatch"),
    @XmlEnumValue("SubscriptionExpired")
    SUBSCRIPTION_EXPIRED("SubscriptionExpired"),
    @XmlEnumValue("InsufficientAccessLevel")
    INSUFFICIENT_ACCESS_LEVEL("InsufficientAccessLevel"),
    @XmlEnumValue("InvalidApiKey")
    INVALID_API_KEY("InvalidApiKey"),
    @XmlEnumValue("MissingGrant")
    MISSING_GRANT("MissingGrant");
    private final String value;

    AuthenticationStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AuthenticationStatus fromValue(String v) {
        for (AuthenticationStatus c: AuthenticationStatus.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
