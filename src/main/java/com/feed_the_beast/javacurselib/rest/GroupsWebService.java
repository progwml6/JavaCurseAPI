package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.common.classes.ExternalCommunityPublicContract;
import com.feed_the_beast.javacurselib.common.classes.GroupMemberContract;
import com.feed_the_beast.javacurselib.data.Apis;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupNotification;
import com.feed_the_beast.javacurselib.service.groups.bans.BanUserRequest;
import com.feed_the_beast.javacurselib.service.groups.bans.GroupBannedUserContract;
import com.feed_the_beast.javacurselib.service.groups.groups.GroupInvitationRedeemResponse;
import com.feed_the_beast.javacurselib.service.groups.groups.GroupMemberSearchRequest;
import com.feed_the_beast.javacurselib.service.groups.servers.GroupRoleDetails;
import com.feed_the_beast.javacurselib.service.groups.servers.GroupSearchModelContract;
import com.feed_the_beast.javacurselib.service.groups.servers.ValidateUrlStatus;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class GroupsWebService {
    final static String ENDPOINT = Apis.GROUPS;

    public interface Servers {

        @POST("invitations/{inviteCode}")
        CompletableFuture<GroupInvitationRedeemResponse> redeeminvite (
                @Path("inviteCode") String inviteCode
        );

        @POST("servers/{groupID}/join")
        CompletableFuture<GroupNotification> joinGroup (
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

        @GET("servers/url/{url}")
        CompletableFuture<String> serversUrl (
                @Path("url") String url
        );

        @GET("servers/url/{url}/validate")
        CompletableFuture<ValidateUrlStatus> validateServerUrl (
                @Path("url") String url
        );

        @GET("servers?query={query}&pageSize={pageSize}&pageNumber={pageNumber}")
        CompletableFuture<GroupSearchModelContract> getServers (
                @Path("query") String query,
                @Path("pageSize") int pageSize,
                @Path("pageNumer") int pageNumber
        );
    }

    public interface Groups {
        @POST("groups/{groupID}/favorite")
        CompletableFuture<Void> favorite (
                @Path("groupID") CurseGUID groupID
        );

        @POST("groups/{groupID}/unfavorite")
        CompletableFuture<Void> unfavorite (
                @Path("groupID") CurseGUID groupID
        );

        @POST("groups/{groupID}/leave")
        CompletableFuture<Void> leaveGroup (
                @Path("groupID") CurseGUID groupID
        );

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
         * @return Collection of {@code GroupMemberContract}s
         * @see {@link #searchMembers(CurseGUID, GroupMemberSearchRequest)}
         */
        @GET("groups/{groupID}/members")
        CompletableFuture<List<GroupMemberContract>> getMembers (
                @Path("groupID") CurseGUID groupID,
                @Query("actives") boolean actives,
                @Query("page") int page,
                @Query("pageSize") int pageSize
        );

        /**
         * Finds members of a group.
         * <p>
         * Server seems to return results like String.startsWith(username) ignoring case. Null values in
         * {@code groupMemberSearchRequest} are interpreted like missing values.
         *
         * Note: behaviour might be changed. Current web application does not send empty values as nulls
         *
         * @param groupID group to find
         * @param groupMemberSearchRequest Search query containing search term, sorting, page size and pagination
         * @return Collection of {@code GroupMemberContract}s containing matches
         * @see {@link #getMembers(CurseGUID, boolean, int, int)}
         */
        @POST("groups/{groupID}/members/search")
        CompletableFuture<List<GroupMemberContract>> searchMembers (
                @Path("groupID") CurseGUID groupID,
                @Body GroupMemberSearchRequest groupMemberSearchRequest
        );
    }
}
