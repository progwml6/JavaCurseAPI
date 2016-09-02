
package com.curse.addonservice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="GetAddOnDumpResult" type="{http://schemas.microsoft.com/Message}StreamBody"/>
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
    "getAddOnDumpResult"
})
@XmlRootElement(name = "GetAddOnDumpResponse")
public class GetAddOnDumpResponse {

    @XmlElement(name = "GetAddOnDumpResult", required = true)
    protected byte[] getAddOnDumpResult;

    /**
     * Gets the value of the getAddOnDumpResult property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getGetAddOnDumpResult() {
        return getAddOnDumpResult;
    }

    /**
     * Sets the value of the getAddOnDumpResult property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setGetAddOnDumpResult(byte[] value) {
        this.getAddOnDumpResult = value;
    }

}
