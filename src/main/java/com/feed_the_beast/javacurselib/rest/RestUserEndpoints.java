package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.utils.AuthInjectorInterceptor;
import com.feed_the_beast.javacurselib.utils.ExceptionHelper;
import lombok.extern.slf4j.Slf4j;
import okhttp3.Interceptor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Simple facade class which contains REST service endpoints
 *
 * USAGE(configuration & endpoint creation):
 *   Create instance of class.
 *   Add Interceptors if required with addInterceptor()
 *   Call setupEndpoints() to create endpoints
 *
 * USAGE(authentication methods):
 * Manually:
 *   Create instance of the class
 *   Call login.login() with proper credentials
 *   Call setAuthToken() to set token
 *   Use endpoints normally
 *
 * Using implemented CredentialProvider
 *   Create instance of concrete CredentialProvider
 *   Call doLogin(CredentialProvider c). Save LoginResponse if needed
 *   Use endpoints normally
 *
 * Using saved LoginResponse
 *   * read/deserialize LoginResponse from disk
 *   * extract auth token
 *   * call setAuthToken to set token
 *   * Use endpoints normally
 *
 * Others?
 *  shortcut methods: with LoginRequest and LoginResponse as arguments
 *
 */
@Slf4j
public class RestUserEndpoints {
    public LoginsWebService.Login login;
    public SessionsWebService.Sessions session;
    public ContactWebService.Contacts contacts;
    public ContactWebService.Users users;
    public ConversationsWebService.Conversations conversations;
    public GroupsWebService.Servers servers;

    private RestEndpointCreator creator;
    private AuthInjectorInterceptor authInterceptor;

    public RestUserEndpoints() {
        creator = new RestEndpointCreator();
        authInterceptor = new AuthInjectorInterceptor();

        creator.addInterceptor(authInterceptor);
    }

    public void addInterceptor(Interceptor interceptor) {
        creator.addInterceptor(interceptor);
    }

    // not really good design. Builder pattern would fix?
    public void setupEndpoints() {
        // TODO: do this OR add getters with lazy initializors?
        login = creator.createEndpoint(LoginsWebService.Login.class);
        // after login call, update authInterceptor
        session = creator.createEndpoint(SessionsWebService.Sessions.class);
        contacts = creator.createEndpoint(ContactWebService.Contacts.class);
        servers = creator.createEndpoint(GroupsWebService.Servers.class);
        users = creator.createEndpoint(ContactWebService.Users.class);
        conversations = creator.createEndpoint(ConversationsWebService.Conversations.class);
    }

    public void setAuthToken(String s) {
        authInterceptor.setAuthToken(s);
    }

    public LoginResponse doLogin(CredentialProvider c) {
        LoginResponse loginResponse = doLogin(new LoginRequest(c.getUsername(), c.getPassword()));
        return loginResponse;
    }

    public LoginResponse doLogin(LoginRequest loginRequest) {
        CompletableFuture<LoginResponse> future = login.login(loginRequest);
        LoginResponse lr = null;
        try {
            lr = future.get();
        } catch (InterruptedException e) {
            log.error("failed", e);
        } catch (ExecutionException e) {
            ExceptionHelper.analyzeRestExecutionException(e);
        }

        if (lr != null) {
            setAuthToken(lr.session.token);
            return lr;
        }
        return null;
    }

    public void doLogin(LoginResponse loginResponse) {
        setAuthToken(loginResponse.session.token);
    }

    public interface CredentialProvider {
        String getUsername();
        String getPassword();
    }
}
