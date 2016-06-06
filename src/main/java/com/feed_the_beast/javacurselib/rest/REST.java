package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.utils.AuthInjectorInterceptor;

@Deprecated
public class REST {
    // endpoints
    public static LoginsWebService.Login login;
    public static SessionsWebService.Sessions session;
    public static ContactWebService.Contacts contacts;
    public static ContactWebService.Users users;
    public static ConversationsWebService.Conversations conversations;
    public static GroupsWebService.Servers servers;

    // internal things
    public static RestEndpointCreator creator;
    public static AuthInjectorInterceptor authInterceptor;

    public static void setAuthToken(String s) {
        authInterceptor.setAuthToken(s);
    }

    static {
        creator = new RestEndpointCreator();
        authInterceptor = new AuthInjectorInterceptor();

        // normal case: only one interceptor
        creator.addInterceptor(authInterceptor);

        // when things fails we want to use multiple interceptors
        // creator.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));

        login = creator.createEndpoint(LoginsWebService.Login.class);
        // after login call, update authInterceptor
        session = creator.createEndpoint(SessionsWebService.Sessions.class);
        contacts = creator.createEndpoint(ContactWebService.Contacts.class);
        servers = creator.createEndpoint(GroupsWebService.Servers.class);
        users = creator.createEndpoint(ContactWebService.Users.class);
        conversations = creator.createEndpoint(ConversationsWebService.Conversations.class);

    }

    private REST() {}
}
