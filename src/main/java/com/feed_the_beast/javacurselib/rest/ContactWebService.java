package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactUrlResponse;
import com.feed_the_beast.javacurselib.service.contacts.contacts.ContactsResponse;
import com.feed_the_beast.javacurselib.service.contacts.users.UserProfileNotification;
import com.feed_the_beast.javacurselib.service.groups.groups.GroupMemberSearchRequest;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import retrofit2.http.*;

import java.util.concurrent.CompletableFuture;


public class ContactWebService {
    final static String ENDPOINT = Apis.CONTACTS;

    public interface Contacts {
        /**
         * Get basic contact information for friends and known groups.
         *
         * Notes: {@code GroupsWebService} has endpoint which return more detailed data
         * @return
         * @see com.feed_the_beast.javacurselib.rest.GroupsWebService.Groups#get(CurseGUID, boolean)
         * @see com.feed_the_beast.javacurselib.rest.GroupsWebService.Groups#searchMembers(CurseGUID, GroupMemberSearchRequest)
         * @see com.feed_the_beast.javacurselib.rest.GroupsWebService.Groups#getMembers(CurseGUID, boolean, int, int)
         */
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
