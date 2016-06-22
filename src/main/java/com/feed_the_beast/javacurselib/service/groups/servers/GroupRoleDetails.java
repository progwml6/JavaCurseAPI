package com.feed_the_beast.javacurselib.service.groups.servers;

import com.feed_the_beast.javacurselib.common.enums.GroupPermissions;
import com.feed_the_beast.javacurselib.service.contacts.contacts.GroupRoleNotification;
import com.feed_the_beast.javacurselib.utils.CurseGUID;

import java.util.Map;
import java.util.Set;

public class GroupRoleDetails {
    public GroupRoleNotification role;
    public Map<CurseGUID, Integer> effectivePermissions;
    public Map<CurseGUID, Map<Set<GroupPermissions>, GroupPermissionsState>> permissions;
}
