package com.feed_the_beast.javacurselib.common.enums;

import com.google.common.collect.Sets;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.TreeSet;

public class GroupPermissionsTest {
    // numbers based on Curse's default role permission. Do not assume they are stable
    @Test
    public void owner() throws Exception {
        //roleID 1, rank 1
        Set<GroupPermissions> set = GroupPermissions.deserialize(-1);
        assertEquals(GroupPermissions.ALL, set);
    }

    @Test
    public void moderator() throws Exception {
        //roleID 2, rank 2
        Set<GroupPermissions> set = GroupPermissions.deserialize(296743969);

    }

    @Test
    public void everyone() throws Exception {
        //roleID 3, rank 1000
        Set<GroupPermissions> set = GroupPermissions.deserialize(19341313);
    }

    @Test
    public void everyonePlusMentionEveryone() throws Exception {
        Set<GroupPermissions> set = GroupPermissions.deserialize(19341313);
        Set<GroupPermissions> setMorePowers = GroupPermissions.deserialize(23535617);

        Sets.SetView<GroupPermissions> diff = Sets.difference(setMorePowers, set);
        assertEquals(1, diff.size());
        assertTrue(diff.contains(GroupPermissions.CHAT_MENTION_EVERYONE));
    }

    @Test
    public void toStrings() throws Exception {
        assertEquals("[]", GroupPermissions.NONE.toString());
        assertTrue(GroupPermissions.ALL.toString().length() > 500);
        assertTrue(GroupPermissions.deserialize(3).toString().contains(", "));
    }

    @Test
    public void max() throws Exception {
        Set<GroupPermissions> set = EnumSet.copyOf(GroupPermissions.ALL);
        set.remove(GroupPermissions.ACCESS);
        assertEquals(GroupPermissions.ALL.size() - 1, set.size());
    }

    @Test
    public void serialization() throws Exception {
        // current max value 536870910 + 1
        assertEquals(-1, GroupPermissions.serialize(GroupPermissions.deserialize(-1)));
        assertEquals(1, GroupPermissions.serialize(GroupPermissions.deserialize(1)));
        assertEquals(0, GroupPermissions.serialize(GroupPermissions.deserialize(0)));
        assertEquals(666, GroupPermissions.serialize(GroupPermissions.deserialize(666)));
        assertEquals(90210, GroupPermissions.serialize(GroupPermissions.deserialize(90210)));
        assertEquals(123456789, GroupPermissions.serialize(GroupPermissions.deserialize(123456789)));
        assertEquals(536870911, GroupPermissions.serialize(GroupPermissions.deserialize(536870911)));

        // this are
        try {
            assertEquals(0, GroupPermissions.serialize(GroupPermissions.deserialize(536870912)));
            fail();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            assertEquals(0, GroupPermissions.serialize(GroupPermissions.deserialize(536870913)));
            fail();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void buildFromEmpty() throws Exception {
        Set<GroupPermissions> set = EnumSet.of(GroupPermissions.ACCESS);
        set.add(GroupPermissions.ACCESS);

    }
}
