package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import okhttp3.*;
import okhttp3.logging.HttpLoggingInterceptor;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.RecordedRequest;
import org.junit.Before;
import org.junit.Test;
import retrofit2.adapter.java8.HttpException;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class ConversationsTest {
    RestEndpointCreator creator;

    @Before
    public void setup() {
        creator = new RestEndpointCreator();
        //creator.addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY));
    }


    @Test
    public void delete_ok() throws Exception {
        MockWebServer mockWebServer = new MockWebServer();
        mockWebServer.enqueue(new MockResponse().setResponseCode(200).setBody(""));
        mockWebServer.start();
        HttpUrl httpUrl = mockWebServer.url("");

        ConversationsWebService.Conversations conversations = creator.createEndpoint(httpUrl.toString(), ConversationsWebService.Conversations.class);
        CompletableFuture<Void> future = conversations.deleteMessage(CurseGUID.newFromLong(1, 2), CurseGUID.newFromLong(3, 4), 1234);
        future.join();

        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals("DELETE", request.getMethod());
        assertEquals("/conversations/1:2/3:4-1234", request.getPath());

        mockWebServer.shutdown();
    }

    @Test
    public void delete_fail() throws Exception {
        MockWebServer mockWebServer = new MockWebServer();
        mockWebServer.enqueue(new MockResponse().setResponseCode(400).setBody("fail"));
        mockWebServer.start();
        HttpUrl httpUrl = mockWebServer.url("");

        ConversationsWebService.Conversations conversations = creator.createEndpoint(httpUrl.toString(), ConversationsWebService.Conversations.class);
        CompletableFuture<Void> future = conversations.deleteMessage(CurseGUID.newFromLong(1, 2), CurseGUID.newFromLong(3, 4), 1234);

        try {
            future.join();
            fail();
        } catch (Exception e) {
            assertEquals(CompletionException.class, e.getClass());
            Throwable exception = e.getCause();
            assertEquals(400, ((HttpException) exception).code());
            assertEquals("fail", ((HttpException) exception).response().errorBody().string());
        }
        RecordedRequest request = mockWebServer.takeRequest();
        assertEquals("DELETE", request.getMethod());
        assertEquals("/conversations/1:2/3:4-1234", request.getPath());

        mockWebServer.shutdown();
    }

    @Test
    public void delete_ok_interceptor() throws Exception {
        ConversationsWebService.Conversations conversations = creator.addInterceptor(new MockInterceptor()).createEndpoint(Apis.CONVERSATIONS, ConversationsWebService.Conversations.class);
        CompletableFuture<Void> future = conversations.deleteMessage(CurseGUID.newFromLong(1, 2), CurseGUID.newFromLong(3, 4), 1234);
        Object o = future.join();
        System.out.println(o);
    }


    // TODO: modularize this/Check OkHttp's Mock classes
    public static class MockInterceptor implements Interceptor {
        @Override
        public Response intercept(Chain chain) throws IOException {
            Request request = chain.request();
            Response response = new Response.Builder()
                    .code(200)
                    .request(chain.request())
                    .protocol(Protocol.HTTP_1_1)
                    .body(ResponseBody.create(null, ""))
                    .build();
            return response;
        }
    }
}
