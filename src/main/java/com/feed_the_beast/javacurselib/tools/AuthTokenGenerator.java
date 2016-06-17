package com.feed_the_beast.javacurselib.tools;

import com.feed_the_beast.javacurselib.data.JsonFactory;
import com.feed_the_beast.javacurselib.rest.RestUserEndpoints;
import com.feed_the_beast.javacurselib.service.logins.login.LoginResponse;
import lombok.extern.slf4j.Slf4j;
import okhttp3.logging.HttpLoggingInterceptor;

import java.io.Console;
import java.io.File;
import java.io.PrintWriter;
import java.util.Arrays;

@Slf4j
public class AuthTokenGenerator {
    public static void main(String[] args) throws Exception {
        File file = new File(args[0]);
        Console console = System.console();

        String user = console.readLine("Username: ");
        char[] passwd = console.readPassword("Password: ");

        MyCredentials credentials = new MyCredentials(user, passwd);
        RestUserEndpoints endpoints = new RestUserEndpoints();
        endpoints.addInterceptor(new HttpLoggingInterceptor(new MyLogger()).setLevel(HttpLoggingInterceptor.Level.BODY));
        endpoints.setupEndpoints();
        LoginResponse loginResponse = endpoints.doLogin(credentials);
        Arrays.fill(passwd, '0');
        String login = JsonFactory.GSON.toJson(loginResponse);

        PrintWriter writer = new PrintWriter(file);
        writer.print(login);
        writer.close();
    }

    private static class MyCredentials implements RestUserEndpoints.CredentialProvider {
        String user;
        char[] passwd;

        public MyCredentials(String user, char[] passwd) {
            this.user = user;
            this.passwd = passwd;
        }

        @Override
        public String getUsername() {
            return user;
        }

        @Override
        public String getPassword() {
            // TODO: make interface to use char[], make other classes, check that GSON supports char
            return new String(passwd);
        }
    }

    private static class MyLogger implements HttpLoggingInterceptor.Logger {
        @Override
        public void log(String message) {
            log.debug(message);
        }
    }
}
