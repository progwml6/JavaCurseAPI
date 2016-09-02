
package org.datacontract.schemas._2004._07.curse_serviceauthentication;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.datacontract.schemas._2004._07.curse_serviceauthentication package. 
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

    private final static QName _LoginRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "LoginRequest");
    private final static QName _RegisterUserStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "RegisterUserStatus");
    private final static QName _CheckUsernameAvailabilityRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "CheckUsernameAvailabilityRequest");
    private final static QName _AuthenticationSession_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "AuthenticationSession");
    private final static QName _LoginResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "LoginResponse");
    private final static QName _RegisterRequest_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "RegisterRequest");
    private final static QName _RegisterUserResult_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "RegisterUserResult");
    private final static QName _AuthenticationStatus_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "AuthenticationStatus");
    private final static QName _LoginRequestEncryptedPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "EncryptedPassword");
    private final static QName _LoginRequestPassword_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "Password");
    private final static QName _LoginRequestUsername_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "Username");
    private final static QName _RegisterUserResultSessionID_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "SessionID");
    private final static QName _LoginResponseSession_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "Session");
    private final static QName _RegisterRequestEmail_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "Email");
    private final static QName _AuthenticationSessionToken_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "Token");
    private final static QName _AuthenticationSessionEmailAddress_QNAME = new QName("http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", "EmailAddress");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.datacontract.schemas._2004._07.curse_serviceauthentication
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RegisterUserResult }
     * 
     */
    public RegisterUserResult createRegisterUserResult() {
        return new RegisterUserResult();
    }

    /**
     * Create an instance of {@link LoginResponse }
     * 
     */
    public LoginResponse l() {
        return new LoginResponse();
    }

    /**
     * Create an instance of {@link RegisterRequest }
     * 
     */
    public RegisterRequest createRegisterRequest() {
        return new RegisterRequest();
    }

    /**
     * Create an instance of {@link CheckUsernameAvailabilityRequest }
     * 
     */
    public CheckUsernameAvailabilityRequest createCheckUsernameAvailabilityRequest() {
        return new CheckUsernameAvailabilityRequest();
    }

    /**
     * Create an instance of {@link LoginRequest }
     * 
     */
    public LoginRequest createLoginRequest() {
        return new LoginRequest();
    }

    /**
     * Create an instance of {@link AuthenticationSession }
     * 
     */
    public AuthenticationSession createAuthenticationSession() {
        return new AuthenticationSession();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "LoginRequest")
    public JAXBElement<LoginRequest> createLoginRequest(LoginRequest value) {
        return new JAXBElement<LoginRequest>(_LoginRequest_QNAME, LoginRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "RegisterUserStatus")
    public JAXBElement<RegisterUserStatus> createRegisterUserStatus(RegisterUserStatus value) {
        return new JAXBElement<RegisterUserStatus>(_RegisterUserStatus_QNAME, RegisterUserStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckUsernameAvailabilityRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "CheckUsernameAvailabilityRequest")
    public JAXBElement<CheckUsernameAvailabilityRequest> createCheckUsernameAvailabilityRequest(CheckUsernameAvailabilityRequest value) {
        return new JAXBElement<CheckUsernameAvailabilityRequest>(_CheckUsernameAvailabilityRequest_QNAME, CheckUsernameAvailabilityRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "AuthenticationSession")
    public JAXBElement<AuthenticationSession> createAuthenticationSession(AuthenticationSession value) {
        return new JAXBElement<AuthenticationSession>(_AuthenticationSession_QNAME, AuthenticationSession.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "LoginResponse")
    public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
        return new JAXBElement<LoginResponse>(_LoginResponse_QNAME, LoginResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "RegisterRequest")
    public JAXBElement<RegisterRequest> createRegisterRequest(RegisterRequest value) {
        return new JAXBElement<RegisterRequest>(_RegisterRequest_QNAME, RegisterRequest.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterUserResult }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "RegisterUserResult")
    public JAXBElement<RegisterUserResult> createRegisterUserResult(RegisterUserResult value) {
        return new JAXBElement<RegisterUserResult>(_RegisterUserResult_QNAME, RegisterUserResult.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationStatus }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "AuthenticationStatus")
    public JAXBElement<AuthenticationStatus> createAuthenticationStatus(AuthenticationStatus value) {
        return new JAXBElement<AuthenticationStatus>(_AuthenticationStatus_QNAME, AuthenticationStatus.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "EncryptedPassword", scope = LoginRequest.class)
    public JAXBElement<String> createLoginRequestEncryptedPassword(String value) {
        return new JAXBElement<String>(_LoginRequestEncryptedPassword_QNAME, String.class, LoginRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "Password", scope = LoginRequest.class)
    public JAXBElement<String> createLoginRequestPassword(String value) {
        return new JAXBElement<String>(_LoginRequestPassword_QNAME, String.class, LoginRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "Username", scope = LoginRequest.class)
    public JAXBElement<String> createLoginRequestUsername(String value) {
        return new JAXBElement<String>(_LoginRequestUsername_QNAME, String.class, LoginRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "SessionID", scope = RegisterUserResult.class)
    public JAXBElement<String> createRegisterUserResultSessionID(String value) {
        return new JAXBElement<String>(_RegisterUserResultSessionID_QNAME, String.class, RegisterUserResult.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthenticationSession }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "Session", scope = LoginResponse.class)
    public JAXBElement<AuthenticationSession> createLoginResponseSession(AuthenticationSession value) {
        return new JAXBElement<AuthenticationSession>(_LoginResponseSession_QNAME, AuthenticationSession.class, LoginResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "Username", scope = CheckUsernameAvailabilityRequest.class)
    public JAXBElement<String> createCheckUsernameAvailabilityRequestUsername(String value) {
        return new JAXBElement<String>(_LoginRequestUsername_QNAME, String.class, CheckUsernameAvailabilityRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "Password", scope = RegisterRequest.class)
    public JAXBElement<String> createRegisterRequestPassword(String value) {
        return new JAXBElement<String>(_LoginRequestPassword_QNAME, String.class, RegisterRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "Email", scope = RegisterRequest.class)
    public JAXBElement<String> createRegisterRequestEmail(String value) {
        return new JAXBElement<String>(_RegisterRequestEmail_QNAME, String.class, RegisterRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "Username", scope = RegisterRequest.class)
    public JAXBElement<String> createRegisterRequestUsername(String value) {
        return new JAXBElement<String>(_LoginRequestUsername_QNAME, String.class, RegisterRequest.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "Token", scope = AuthenticationSession.class)
    public JAXBElement<String> createAuthenticationSessionToken(String value) {
        return new JAXBElement<String>(_AuthenticationSessionToken_QNAME, String.class, AuthenticationSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "EmailAddress", scope = AuthenticationSession.class)
    public JAXBElement<String> createAuthenticationSessionEmailAddress(String value) {
        return new JAXBElement<String>(_AuthenticationSessionEmailAddress_QNAME, String.class, AuthenticationSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "SessionID", scope = AuthenticationSession.class)
    public JAXBElement<String> createAuthenticationSessionSessionID(String value) {
        return new JAXBElement<String>(_RegisterUserResultSessionID_QNAME, String.class, AuthenticationSession.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/Curse.ServiceAuthentication.Models", name = "Username", scope = AuthenticationSession.class)
    public JAXBElement<String> createAuthenticationSessionUsername(String value) {
        return new JAXBElement<String>(_LoginRequestUsername_QNAME, String.class, AuthenticationSession.class, value);
    }

}
