package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.BetterEnum;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Nonnull;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

@Slf4j
public enum GroupPermissions implements BetterEnum<Long> {
    // special cases not needed with enumSet
    //NONE(0), ALL(-1),

    ACCESS(1), MANAGE_SERVER(2), MANAGE_CHANNELS(4), CREATE_TEMPORARY_GROUP(8),
    ACCESS_ADMIN_PANEL(16), INVITE_USERS(32), REMOVE_USER(64), MANAGE_INVITATIONS(128),
    CHANGE_USER_ROLE(256), BAN_USER(512), VOICE_KICK_USER(1024), VOICE_MUTE_USER(2048), VOICE_DEAFEN_USER(4096),
    VOICE_SPEAK(8192), VOICE_MOVE_USER(16384), VOICE_CHANGE_SETTINGS(32768), CHAT_SEND_MESSAGES(65536),
    CHAT_EMBED_LINKS(131072), CHAT_UPLOAD_PHOTOS(262144), CHAT_ATTACH_FILES(524288), CHAT_READ_HISTORY(1048576),
    CHAT_MENTION_USERS(2097152), CHAT_MENTION_EVERYONE(4194304), CHAT_BYPASS_CHAT_THROTTLE(268435456),
    CHAT_MODERATE_MESSAGES(8388608), SEND_PRIVATE_MESSAGE(16777216), MANAGE_POLLS(33554432),
    MANAGE_GIVEAWAYS(67108864), CHAT_EDIT_OTHER_MESSAGES(134217728);

    private long value;


    // both immutable

    // not recommended to to build new EnumSets with value. Use of() methods
    public final static Set<GroupPermissions> NONE = Collections.emptySet();
    public final static Set<GroupPermissions> ALL = Collections.unmodifiableSet(EnumSet.allOf(GroupPermissions.class));



    GroupPermissions (long value) {
        this.value = value;
    }

    public static long serialize(Set<GroupPermissions> set) {
        if (set == NONE) {
            return 0;
        }
        if (set == ALL) {
            return -1;
        }
        long result = 0;
        for (GroupPermissions gp : set ) {
            result += gp.getValue();
        }
        return result;
    }

    public static Set<GroupPermissions> deserialize(long l) {
        if (l == 0) {
            return NONE;
        }
        if (l == -1) {
            return ALL;
        }

        // can't use EnumSet.copyOf(NONE): java.lang.IllegalArgumentException: Collection is empty
        //Set<GroupPermissions> result = EnumSet.copyOf(NONE);
        Set<GroupPermissions> result = EnumSet.noneOf(GroupPermissions.class);
        for (GroupPermissions gp : GroupPermissions.values()) {
            if ((l & gp.getValue()) == gp.getValue()) {
                result.add(gp);
                l = l - gp.getValue();
            }
        }

        if (l != 0) {
            throw new IllegalStateException("All enums not found. remainder: " + l + " collected enums: " + result);
        }

        return result;
    }

    @Nonnull
    @Override
    public Long getValue () {
        return value;
    }
}
