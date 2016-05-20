package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactUrlResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.users.UserProfileNotification;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.concurrent.CompletableFuture;

public interface ContactWebService {
    @GET("/contacts")
    CompletableFuture<ContactsResponse> getContacts();

    @GET("contacts/recent/{timestamp}")
    CompletableFuture<ContactsResponse> getContacts_recent(
            @Path("timestamp") long timestamp
    );

    @POST("contacts/url")
    CompletableFuture<ContactUrlResponse> postContact_url(
            @Body String body // TODO: https://contacts-v1.curseapp.net/Help/Api/POST-contacts-url
    );

    @GET("users/{id}")
    CompletableFuture<UserProfileNotification> getUsers_id(
            @Path("id") long id
    );

}
