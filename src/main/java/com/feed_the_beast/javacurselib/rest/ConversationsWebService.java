package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import okhttp3.Interceptor;
import retrofit2.http.DELETE;
import retrofit2.http.Path;

import java.util.concurrent.CompletableFuture;

public class ConversationsWebService {
    final static String ENDPOINT = Apis.CONVERSATIONS;

    public interface Conversations {
        @DELETE("conversations/{conversationID}/{id}-{timestamp}")
        CompletableFuture<Void> deleteMessage(
                @Path("conversationID") CurseGUID conversationID,
                @Path("id") CurseGUID id,
                @Path("timestamp") long timestamp);
    }
}