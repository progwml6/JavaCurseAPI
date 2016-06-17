package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.service.logins.login.LoginRequest;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import com.feed_the_beast.javacurselib.utils.AuthInjectorInterceptor;
import com.feed_the_beast.javacurselib.utils.ExceptionHelper;
import okhttp3.Interceptor;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

// TODO: should we save username?
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
        CompletableFuture<LoginResponse> future = login.login(new LoginRequest(c.getUsername(), c.getPassword()));
        LoginResponse lr = null;
        try {
            lr = future.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            ExceptionHelper.analyzeRestExecutionException(e);
        }

        if (lr != null) {
            setAuthToken(lr.session.token);
            return lr;
        }
        return null;
    }

    public interface CredentialProvider {
        String getUsername();
        String getPassword();
    }
}
