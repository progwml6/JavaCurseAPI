package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.service.groups.bans.GroupBannedUserContract;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.POST;
import retrofit2.http.Path;

import java.util.concurrent.CompletableFuture;

public class GroupWebService {
    public interface Servers {

        /**
         * BanUserRequest can be used to set IP ban
         */
        @Deprecated // TODO: add class and undeprecate
        @POST("servers/{serverID}/bans")
        CompletableFuture<GroupBannedUserContract> ban(
                @Path("serverID") CurseGUID serverID//,
                // TODO: https://groups-v1.curseapp.net/Help/ResourceModel?modelName=BanUserRequest
                //@Body BanUserRequest banUserRequest
        );

        @POST("servers/{serverID}/bans/{userID}")
        CompletableFuture<GroupBannedUserContract> ban(
                @Path("serverID") CurseGUID serverID,
                @Path("userid") long userID,
                @Body String reason);


        @DELETE("servers/{serverID}/bans/{userID}")
        CompletableFuture<Void> unban(
                @Path("serverID") CurseGUID serverID,
                @Path("userID") long userID
                );

    }
}
