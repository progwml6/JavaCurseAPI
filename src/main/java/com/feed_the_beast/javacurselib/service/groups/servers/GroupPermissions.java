package com.feed_the_beast.javacurselib.service.groups.servers;

import com.feed_the_beast.javacurselib.utils.BetterEnum;

import javax.annotation.Nonnull;

/**
 * Created by progwml6 on 5/22/16.
 */
public enum GroupPermissions implements BetterEnum<Long> {
    NONE(0), ALL(-1), ACCESS(1), MANAGE_SERVER(2), MANAGE_CHANNELS(4), CREATE_TEMPORARY_GROUP(8),
    ACCESS_ADMIN_PANEL(16), INVITE_USERS(32), REMOVE_USER(64), MANAGE_INVITATIONS(128),
    CHANGE_USER_ROLE(256), BAN_USER(512), VOICE_KICK_USER(1024), VOICE_MUTE_USER(2048), VOICE_DEAFEN_USER(4096),
    VOICE_SPEAK(8192), VOICE_MOVE_USER(16384), VOICE_CHANGE_SETTINGS(32768), CHAT_SEND_MESSAGES(65536),
    CHAT_EMBED_LINKS(131072), CHAT_UPLOAD_PHOTOS(262144), CHAT_ATTACH_FILES(524288), CHAT_READ_HISTORY(1048576),
    CHAT_MENTION_USERS(2097152), CHAT_MENTION_EVERYONE(4194304), CHAT_BYPASS_CHAT_THROTTLE(268435456),
    CHAT_MODERATE_MESSAGES(8388608), SEND_PRIVATE_MESSAGE(16777216), MANAGE_POLLS(33554432),
    MANAGE_GIVEAWAYS(67108864), CHAT_EDIT_OTHER_MESSAGES(134217728);

    private long value;

    GroupPermissions (long value) {
        this.value = value;
    }

    @Nonnull
    @Override
    public Long getValue () {
        return value;
    }
    }
