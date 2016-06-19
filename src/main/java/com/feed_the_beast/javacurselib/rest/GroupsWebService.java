package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.common.classes.ExternalCommunityPublicContract;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.groups.bans.BanUserRequest;
import com.feed_the_beast.javacurselib.service.groups.bans.GroupBannedUserContract;
import com.feed_the_beast.javacurselib.service.groups.servers.GroupRoleDetails;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import retrofit2.http.*;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by progwml6 on 5/22/16.
 */
public class GroupsWebService {
    final static String ENDPOINT = Apis.GROUPS;

    public interface Servers {
        @POST("groups/{groupID}/favorite")
        CompletableFuture<Void> favorite (
                @Path("groupID") CurseGUID groupID
        );

        @POST("groups/{groupID}/unfavorite")
        CompletableFuture<Void> unfavorite (
                @Path("groupID") CurseGUID groupID
        );

        @POST("servers/{groupID}/join")
        CompletableFuture<GroupNotification> joinGroup (
                @Path("groupID") CurseGUID groupID
        );

        @POST("groups/{groupID}/leave")
        CompletableFuture<Void> leaveGroup (
                @Path("groupID") CurseGUID groupID
        );

        @GET("servers/{serverID}/live-streams")
        CompletableFuture<ExternalCommunityPublicContract> getLiveStreams (
                @Path("serverID") CurseGUID serverID
        );

        @DELETE("groups/{groupID}/members/{userID}")
        CompletableFuture<Void> removeFromGroup (
                @Path("groupID") CurseGUID groupID,
                @Path("userID") long userID
        );

        @GET("servers/{groupID}/roles")
        CompletableFuture<List<GroupRoleDetails>> getServerRoles (
                @Path("groupID") CurseGUID groupID
        );

        @GET("servers/{groupID}/roles/{roleID}")
        CompletableFuture<List<GroupRoleDetails>> getServerRoleID (
                @Path("groupID") CurseGUID groupID,
                @Path("roleID") long roleID
        );

        /**
         * BanUserRequest can be used to set IP ban
         */
        @POST("servers/{serverID}/bans")
        CompletableFuture<GroupBannedUserContract> ban (
                @Path("serverID") CurseGUID serverID,
                // TODO: https://groups-v1.curseapp.net/Help/ResourceModel?modelName=BanUserRequest
                @Body BanUserRequest banUserRequest
        );

        @POST("servers/{serverID}/bans/{userID}")
        CompletableFuture<GroupBannedUserContract> ban (
                @Path("serverID") CurseGUID serverID,
                @Path("userid") long userID,
                @Body String reason);

        @DELETE("servers/{serverID}/bans/{userID}")
        CompletableFuture<Void> unban (
                @Path("serverID") CurseGUID serverID,
                @Path("userID") long userID
        );

    }

    public interface Groups {
        @GET("groups/{serverID}")
        CompletableFuture<GroupNotification> get (
                @Path("serverID") CurseGUID serverID,
                @Query("showDeletedChannels") boolean showDeletedChannels
        );
    }
}
