package com.feed_the_beast.javacurselib.rest;

import com.feed_the_beast.javacurselib.service.contacts.users.UserProfileNotification;
import com.feed_the_beast.javacurselib.service.groups.servers.GroupRoleDetails;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * Created by progwml6 on 5/22/16.
 */
public class GroupsWebService {
    public interface Servers {
        @GET("servers/{groupID}/roles")
        CompletableFuture<List<GroupRoleDetails>> getServerRoles(
                @Path("groupID") CurseGUID groupID
        );

        @GET("servers/{groupID}/roles/{roleID}")
        CompletableFuture<List<GroupRoleDetails>> getServerRoleID(
                @Path("groupID") CurseGUID groupID,
                @Path("roleID") long roleID
        );

        //TODO implement rest of this API interface
    }
}
