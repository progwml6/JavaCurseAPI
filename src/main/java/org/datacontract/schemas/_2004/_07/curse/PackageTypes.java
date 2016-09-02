
package org.datacontract.schemas._2004._07.curse;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PackageTypes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="PackageTypes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Folder"/>
 *     &lt;enumeration value="Ctoc"/>
 *     &lt;enumeration value="SingleFile"/>
 *     &lt;enumeration value="Cmod2"/>
 *     &lt;enumeration value="ModPack"/>
 *     &lt;enumeration value="Mod"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PackageTypes")
@XmlEnum
public enum PackageTypes {

    @XmlEnumValue("Folder")
    FOLDER("Folder"),
    @XmlEnumValue("Ctoc")
    CTOC("Ctoc"),
    @XmlEnumValue("SingleFile")
    SINGLE_FILE("SingleFile"),
    @XmlEnumValue("Cmod2")
    CMOD_2("Cmod2"),
    @XmlEnumValue("ModPack")
    MOD_PACK("ModPack"),
    @XmlEnumValue("Mod")
    MOD("Mod");
    private final String value;

    PackageTypes(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PackageTypes fromValue(String v) {
        for (PackageTypes c: PackageTypes.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
