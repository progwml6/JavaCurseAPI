
package org.datacontract.schemas._2004._07.curse_addonservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.curse_addonservice package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ArrayOfAddOnFileKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests", "ArrayOfAddOnFileKey");
    private final static QName _AddOnFileKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests", "AddOnFileKey");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.curse_addonservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ArrayOfAddOnFileKey }
     * 
     */
    public ArrayOfAddOnFileKey createArrayOfAddOnFileKey() {
        return new ArrayOfAddOnFileKey();
    }

    /**
     * Create an instance of {@link AddOnFileKey }
     * 
     */
    public AddOnFileKey createAddOnFileKey() {
        return new AddOnFileKey();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfAddOnFileKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests", name = "ArrayOfAddOnFileKey")
    public JAXBElement<ArrayOfAddOnFileKey> createArrayOfAddOnFileKey(ArrayOfAddOnFileKey value) {
        return new JAXBElement<ArrayOfAddOnFileKey>(_ArrayOfAddOnFileKey_QNAME, ArrayOfAddOnFileKey.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddOnFileKey }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.AddOnService.Requests", name = "AddOnFileKey")
    public JAXBElement<AddOnFileKey> createAddOnFileKey(AddOnFileKey value) {
        return new JAXBElement<AddOnFileKey>(_AddOnFileKey_QNAME, AddOnFileKey.class, null, value);
    }

}
