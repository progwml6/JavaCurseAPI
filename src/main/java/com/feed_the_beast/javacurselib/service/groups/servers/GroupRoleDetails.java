package com.feed_the_beast.javacurselib.service.groups.servers;

import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupRoleNotification;
import com.feed_the_beast.javacurselib.utils.CurseGUID;

import java.util.Map;

public class GroupRoleDetails {
    public GroupRoleNotification role;
    public Map<CurseGUID, Integer> effectivePermissions;
    public Map<CurseGUID, Map<GroupPermissions, GroupPermissionsState>> permissions;
}
