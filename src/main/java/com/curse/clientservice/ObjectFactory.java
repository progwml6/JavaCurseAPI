
package com.curse.clientservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import org.datacontract.schemas._2004._07.curse_serviceauthentication.CheckUsernameAvailabilityRequest;
import org.datacontract.schemas._2004._07.curse_serviceauthentication.LoginRequest;
import org.datacontract.schemas._2004._07.curse_serviceauthentication.RegisterRequest;
import org.datacontract.schemas._2004._07.curse_serviceauthentication.RegisterUserResult;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.curse.clientservice package. 
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

    private final static QName _RegisterResponseRegisterResult_QNAME = new QName("http://clientservice.curse.com/", "RegisterResult");
    private final static QName _LoginResponseLoginResult_QNAME = new QName("http://clientservice.curse.com/", "LoginResult");
    private final static QName _RegisterRegisterRequest_QNAME = new QName("http://clientservice.curse.com/", "registerRequest");
    private final static QName _CheckUsernameAvailabilityUsername_QNAME = new QName("http://clientservice.curse.com/", "username");
    private final static QName _LoginLoginRequest_QNAME = new QName("http://clientservice.curse.com/", "loginRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.curse.clientservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterResponse }
     * 
     */
    public RegisterResponse createRegisterResponse() {
        return new RegisterResponse();
    }

    /**
     * Create an instance of {@link com.curse.clientservice.LoginResponse }
     * 
     */
    public com.curse.clientservice.LoginResponse createLoginResponse() {
        return new com.curse.clientservice.LoginResponse();
    }

    /**
     * Create an instance of {@link CheckUsernameAvailabilityResponse }
     * 
     */
    public CheckUsernameAvailabilityResponse createCheckUsernameAvailabilityResponse() {
        return new CheckUsernameAvailabilityResponse();
    }

    /**
     * Create an instance of {@link Register }
     * 
     */
    public Register createRegister() {
        return new Register();
    }

    /**
     * Create an instance of {@link CheckUsernameAvailability }
     * 
     */
    public CheckUsernameAvailability createCheckUsernameAvailability() {
        return new CheckUsernameAvailability();
    }

    /**
     * Create an instance of {@link Login }
     * 
     */
    public Login createLogin() {
        return new Login();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientservice.curse.com/", name = "RegisterResult", scope = RegisterResponse.class)
    public JAXBElement<RegisterUserResult> createRegisterResponseRegisterResult(RegisterUserResult value) {
        return new JAXBElement<RegisterUserResult>(_RegisterResponseRegisterResult_QNAME, RegisterUserResult.class, RegisterResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link org.datacontract.schemas._2004._07.curse_serviceauthentication.LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientservice.curse.com/", name = "LoginResult", scope = com.curse.clientservice.LoginResponse.class)
    public JAXBElement<org.datacontract.schemas._2004._07.curse_serviceauthentication.LoginResponse> createLoginResponseLoginResult(org.datacontract.schemas._2004._07.curse_serviceauthentication.LoginResponse value) {
        return new JAXBElement<org.datacontract.schemas._2004._07.curse_serviceauthentication.LoginResponse>(_LoginResponseLoginResult_QNAME, org.datacontract.schemas._2004._07.curse_serviceauthentication.LoginResponse.class, com.curse.clientservice.LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientservice.curse.com/", name = "registerRequest", scope = Register.class)
    public JAXBElement<RegisterRequest> createRegisterRegisterRequest(RegisterRequest value) {
        return new JAXBElement<RegisterRequest>(_RegisterRegisterRequest_QNAME, RegisterRequest.class, Register.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUsernameAvailabilityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientservice.curse.com/", name = "username", scope = CheckUsernameAvailability.class)
    public JAXBElement<CheckUsernameAvailabilityRequest> createCheckUsernameAvailabilityUsername(CheckUsernameAvailabilityRequest value) {
        return new JAXBElement<CheckUsernameAvailabilityRequest>(_CheckUsernameAvailabilityUsername_QNAME, CheckUsernameAvailabilityRequest.class, CheckUsernameAvailability.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://clientservice.curse.com/", name = "loginRequest", scope = Login.class)
    public JAXBElement<LoginRequest> createLoginLoginRequest(LoginRequest value) {
        return new JAXBElement<LoginRequest>(_LoginLoginRequest_QNAME, LoginRequest.class, Login.class, value);
    }

}
