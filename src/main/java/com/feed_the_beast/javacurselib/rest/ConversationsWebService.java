package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.service.conversations.conversations.ConversationCreateMessageRequest;
import com.feed_the_beast.javacurselib.service.conversations.conversations.ConversationEditMessageRequest;
import com.feed_the_beast.javacurselib.service.conversations.conversations.ConversationMarkReadRequest;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
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

        @POST("conversations/{conversationID}")
        CompletableFuture<Void> postMessage(
                @Path("conversationID") CurseGUID conversationID,
                @Body ConversationCreateMessageRequest request);

        @POST("conversations/{conversationID}/{id}-{timestamp}")
        CompletableFuture<Void> editMessage(
                @Path("conversationID") CurseGUID conversationID,
                @Path("id") CurseGUID id,
                @Path("timestamp") long timestamp,
                @Body ConversationEditMessageRequest body);

        @POST("conversations/{conversationID}/{id}-{timestamp}/like")
        CompletableFuture<Void> likeMessage(
                @Path("conversationID") CurseGUID conversationID,
                @Path("id") CurseGUID id,
                @Path("timestamp") long timestamp);

        @POST("conversations/{conversationID}/{id}-{timestamp}/unlike")
        CompletableFuture<Void> unlikeMessage(
                @Path("conversationID") CurseGUID conversationID,
                @Path("id") CurseGUID id,
                @Path("timestamp") long timestamp);

        @POST("conversations/{conversationID}/mark-as-read")
        CompletableFuture<Void> markAsRead (
                @Path("conversationID") CurseGUID conversationID,
                @Body ConversationMarkReadRequest body
                );
    }
}