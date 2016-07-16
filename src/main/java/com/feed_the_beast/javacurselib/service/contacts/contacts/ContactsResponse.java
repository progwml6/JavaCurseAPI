package com.feed_the_beast.javacurselib.service.contacts.contacts;

import com.feed_the_beast.javacurselib.common.classes.FriendshipContract;
import com.feed_the_beast.javacurselib.utils.CurseGUID;
import lombok.ToString;

import java.util.List;
import java.util.Optional;
import java.util.function.BiPredicate;

import javax.annotation.Nonnull;

/**
 * representation of curse contacts api ContactsResponse
 */
@ToString
public class ContactsResponse {
    public List<FriendshipContract> friends;
    public List<GroupNotification> groups;

    /**
     * Finds given channel with given ID. Loops through all servers until channel is found.
     *
     * @param id channelIL to find with
     * @return Optional with channel name if fount otherwise empty optional
     */
    @Nonnull
    public Optional<String> getChannelNamebyId (CurseGUID id) {
        Optional<String> ret;
        for (GroupNotification group : groups) {
            ret = group.getChannelNamebyId(id);
            if (ret.isPresent()) {
                return ret;
            }
        }
        return Optional.empty();
    }

    /**
     * Finds channelID for given group and channel names, case specific
     * @param groupName
     * @param channelName
     * @return Optional with channelID otherwise empty Optional
     */
    @Nonnull
    public Optional<CurseGUID> getChannelIdbyNames (String groupName, String channelName) {
        return getChannelIdbyNames(groupName, channelName, false);
    }

    /**
     * Finds channelID for given group and channel names
     * @param groupName
     * @param channelName
     * @param ignoreCase ignores case on comparisons
     * @return Optional with channelID otherwise empty Optional
     */
    @Nonnull
    public Optional<CurseGUID> getChannelIdbyNames (String groupName, String channelName, boolean ignoreCase) {
        for (GroupNotification group : groups) {
            if (ignoreCase ? groupName.equalsIgnoreCase(group.groupTitle) : groupName.equals(group.groupTitle)) {
                return group.getChannelIdByName(channelName, ignoreCase ? String::equalsIgnoreCase : String::equals);
            }
        }
        return Optional.empty();
    }

    @Nonnull
    public Optional<CurseGUID> getGroupIdByName (String s) {
        return getGroupIdByName(s, String::equals);
    }

    @Nonnull
    public Optional<CurseGUID> getGroupIdByName (String s, BiPredicate<String, String> predicate) {
        for (GroupNotification group : groups) {
            if (predicate.test(group.groupTitle, s)) {
                return Optional.of(group.groupID);
            }
        }
        return Optional.empty();
    }

    @Nonnull
    public Optional<String> getGroupNamebyId (CurseGUID id) {
        for (GroupNotification group : groups) {
            if (id.equals(group.groupID)) {
                return Optional.of(group.groupTitle);
            }
        }
        return Optional.empty();
    }
}
