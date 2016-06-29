package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.common.classes.ExternalCommunityPublicContract;
import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.groups.bans.BanUserRequest;
import com.feed_the_beast.javacurselib.service.groups.bans.GroupBannedUserContract;
import com.feed_the_beast.javacurselib.service.groups.groups.GroupMemberSearchRequest;
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
        /**
         * Returns detailed information about given group.
         *
         *
         * @param groupID Group to get information for
         * @param showDeletedChannels true  to include information about deleted channels
         * @return Object containing detailed group information
         */
        @GET("groups/{groupID}")
        CompletableFuture<GroupNotification> get (
                @Path("groupID") CurseGUID groupID,
                @Query("showDeletedChannels") boolean showDeletedChannels
        );

        /**
         * Gets list of members for a group.
         *
         * @param groupID Group to search
         * @param actives True to list active member, false to inactive members
         * @param page
         * @param pageSize Max amoung of search results. MAX 50. Larger makes server to return status code 400
         * @return
         */
        @GET("groups/{groupID}/members")
        CompletableFuture<List<GroupMemberContract>> getMembers (
                @Path("groupID") CurseGUID groupID,
                @Query("actives") boolean actives,
                @Query("page") int page,
                @Query("pageSize") int pageSize
        );

        /**
         * Finds members of a group
         *
         * @param groupID group to find
         * @param groupMemberSearchRequest Search query containing serach term, sorting, page size and pagination
         * @return Collection of {@code GroupMemberContract}s containing all matches
         */
        @POST("groups/{groupID}/members/search")
        CompletableFuture<List<GroupMemberContract>> searchMembers(
                @Path("groupID") CurseGUID groupID,
                @Body GroupMemberSearchRequest groupMemberSearchRequest
        );
    }
}
