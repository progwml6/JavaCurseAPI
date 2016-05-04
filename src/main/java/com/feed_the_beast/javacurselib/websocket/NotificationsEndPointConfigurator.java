package com.feed_the_beast.javacurselib.websocket;

import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;

import javax.websocket.ClientEndpointConfig;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class NotificationsEndPointConfigurator extends ClientEndpointConfig.Configurator {
    private String authToken;
    public NotificationsEndPointConfigurator(LoginResponse loginResponse) {
        authToken = loginResponse.session.token;
    }
    @Override
    public void beforeRequest(Map<String, List<String>> headers) {
        headers.put("AuthenticationToken", Arrays.asList(authToken));
    }
}