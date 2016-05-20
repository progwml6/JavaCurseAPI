package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactUrlResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.users.UserProfileNotification;
import retrofit2.http.*;

import java.util.concurrent.CompletableFuture;


public class ContactWebService {
    // divide service to multiple interfaces. Makes method naming easier

    public interface Contacts {
        @GET("/contacts")
        CompletableFuture<ContactsResponse> get();

        @GET("contacts/recent/{timestamp}")
        CompletableFuture<ContactsResponse> getRecent(
                @Path("timestamp") long timestamp
        );

        @POST("contacts/url")
        CompletableFuture<ContactUrlResponse> url(
                @Body String body // TODO: https://contacts-v1.curseapp.net/Help/Api/POST-contacts-url
        );
    }

    public interface Users {
        @GET("users/{id}")
        CompletableFuture<UserProfileNotification> getByID(
                @Path("id") long id
        );
    }

    public interface FriendSuggestions {
        //TODO: add class
        //@GET("friend-suggestions")
        //CompletableFuture<FriendSuggestionContract> get();

        @DELETE("friend-suggestions/{friendID}")
        CompletableFuture<Void> delete(@Path("friendID") long friendID);
    }
}
