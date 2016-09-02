
package com.microsoft.schemas._2003._10.serialization.arrays;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import addons.curse.ArrayOfAddOnFile;


/**
 * <p>Java class for ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KeyValueOfintArrayOfAddOnFileHlmYZPzp" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Value" type="{Curse.AddOns}ArrayOfAddOnFile"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp", propOrder = {
    "keyValueOfintArrayOfAddOnFileHlmYZPzp"
})
public class ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp {

    @XmlElement(name = "KeyValueOfintArrayOfAddOnFileHlmYZPzp")
    protected List<ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp.KeyValueOfintArrayOfAddOnFileHlmYZPzp> keyValueOfintArrayOfAddOnFileHlmYZPzp;

    /**
     * Gets the value of the keyValueOfintArrayOfAddOnFileHlmYZPzp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the keyValueOfintArrayOfAddOnFileHlmYZPzp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKeyValueOfintArrayOfAddOnFileHlmYZPzp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp.KeyValueOfintArrayOfAddOnFileHlmYZPzp }
     * 
     * 
     */
    public List<ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp.KeyValueOfintArrayOfAddOnFileHlmYZPzp> getKeyValueOfintArrayOfAddOnFileHlmYZPzp() {
        if (keyValueOfintArrayOfAddOnFileHlmYZPzp == null) {
            keyValueOfintArrayOfAddOnFileHlmYZPzp = new ArrayList<ArrayOfKeyValueOfintArrayOfAddOnFileHlmYZPzp.KeyValueOfintArrayOfAddOnFileHlmYZPzp>();
        }
        return this.keyValueOfintArrayOfAddOnFileHlmYZPzp;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Value" type="{Curse.AddOns}ArrayOfAddOnFile"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "key",
        "value"
    })
    public static class KeyValueOfintArrayOfAddOnFileHlmYZPzp {

        @XmlElement(name = "Key")
        protected int key;
        @XmlElement(name = "Value", required = true, nillable = true)
        protected ArrayOfAddOnFile value;

        /**
         * Gets the value of the key property.
         * 
         */
        public int getKey() {
            return key;
        }

        /**
         * Sets the value of the key property.
         * 
         */
        public void setKey(int value) {
            this.key = value;
        }

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link ArrayOfAddOnFile }
         *     
         */
        public ArrayOfAddOnFile getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link ArrayOfAddOnFile }
         *     
         */
        public void setValue(ArrayOfAddOnFile value) {
            this.value = value;
        }

    }

}
