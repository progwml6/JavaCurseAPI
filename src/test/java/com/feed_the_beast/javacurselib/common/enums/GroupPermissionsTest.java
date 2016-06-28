package com.feed_the_beast.javacurselib.common.enums;

import com.feed_the_beast.javacurselib.utils.EnumSetHelpers;
import com.google.common.collect.Sets;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.EnumSet;
import java.util.Set;

public class GroupPermissionsTest {
    // numbers based on Curse's default role permission. Do not assume they are stable
    @Test
    public void owner() throws Exception {
        //roleID 1, rank 1
        Set<GroupPermissions> set = EnumSetHelpers.deserialize(-1, GroupPermissions.class);
        assertEquals(GroupPermissions.ALL, set);
    }

    @Test
    public void moderator() throws Exception {
        //roleID 2, rank 2
        Set<GroupPermissions> set = EnumSetHelpers.deserialize(296743969, GroupPermissions.class);
        //TODO: add some tests
    }

    @Test
    public void everyone() throws Exception {
        //roleID 3, rank 1000
        Set<GroupPermissions> set = EnumSetHelpers.deserialize(19341313, GroupPermissions.class);
        // TODO: add some tests
    }

    @Test
    public void everyonePlusMentionEveryone() throws Exception {
        Set<GroupPermissions> set = EnumSetHelpers.deserialize(19341313, GroupPermissions.class);
        Set<GroupPermissions> setMorePowers = EnumSetHelpers.deserialize(23535617, GroupPermissions.class);

        Sets.SetView<GroupPermissions> diff = Sets.difference(setMorePowers, set);

        // test that we have one exact permission remaining
        assertEquals(1, diff.size());
        assertTrue(diff.contains(GroupPermissions.CHAT_MENTION_EVERYONE));
    }

    @Test
    public void toStrings() throws Exception {
        assertEquals("[]", GroupPermissions.NONE.toString());
        assertTrue(GroupPermissions.ALL.toString().length() > 500);
        assertTrue(EnumSetHelpers.deserialize(3, GroupPermissions.class).toString().contains(", "));
    }

    @Test
    public void max() throws Exception {
        Set<GroupPermissions> set = EnumSet.copyOf(GroupPermissions.ALL);
        set.remove(GroupPermissions.ACCESS);
        assertEquals(GroupPermissions.ALL.size() - 1, set.size());
    }

    @Test
    public void serialization() throws Exception {
        assertEquals(-1, EnumSetHelpers.serialize(EnumSetHelpers.deserialize(-1, GroupPermissions.class), GroupPermissions.class));
        assertEquals(1, EnumSetHelpers.serialize(EnumSetHelpers.deserialize(1, GroupPermissions.class), GroupPermissions.class));
        assertEquals(0, EnumSetHelpers.serialize(EnumSetHelpers.deserialize(0, GroupPermissions.class), GroupPermissions.class));
        assertEquals(666, EnumSetHelpers.serialize(EnumSetHelpers.deserialize(666, GroupPermissions.class), GroupPermissions.class));
        assertEquals(90210, EnumSetHelpers.serialize(EnumSetHelpers.deserialize(90210, GroupPermissions.class), GroupPermissions.class));
        assertEquals(123456789, EnumSetHelpers.serialize(EnumSetHelpers.deserialize(123456789, GroupPermissions.class), GroupPermissions.class));
        /*
         * this is value represents long which have bit on for every GroupPermssions enum
         * this test is kind of stupid because -1 aka EnumSet.allOf(GroupPermissions.class) is the same things
         * current code converts 536870911 to EnumSet.allOf(GroupPermissions.class) which will be serialez as -1
         */
        //assertEquals(536870911, EnumSetHelpers.serialize(EnumSetHelpers.deserialize(536870911, GroupPermissions.class), GroupPermissions.class));

        // this are
        try {
            assertEquals(0, EnumSetHelpers.serialize(EnumSetHelpers.deserialize(536870912, GroupPermissions.class), GroupPermissions.class));
            fail();
        } catch (IllegalStateException e) {
            //e.printStackTrace();
        }

        try {
            assertEquals(0, EnumSetHelpers.serialize(EnumSetHelpers.deserialize(536870913, GroupPermissions.class), GroupPermissions.class));
            fail();
        } catch (IllegalStateException e) {
            //e.printStackTrace();
        }
    }

    @Test
    public void buildFromEmpty() throws Exception {
        Set<GroupPermissions> set = EnumSet.of(GroupPermissions.ACCESS);
        set.add(GroupPermissions.ACCESS);

    }

    @Test
    public void testEquals() throws Exception {
        EnumSet<GroupPermissions> all = EnumSet.allOf(GroupPermissions.class);
        assertFalse(all == GroupPermissions.ALL);
        assertTrue(all.equals(GroupPermissions.ALL));
        assertTrue(GroupPermissions.ALL.equals(all));

        all.remove(GroupPermissions.ACCESS);
        all.add(GroupPermissions.ACCESS);
        assertTrue(all.equals(GroupPermissions.ALL));
        assertTrue(GroupPermissions.ALL.equals(all));

        all = EnumSet.copyOf(GroupPermissions.ALL);
        all.remove(GroupPermissions.ACCESS);
        all.add(GroupPermissions.ACCESS);
        assertTrue(all.equals(GroupPermissions.ALL));
        assertTrue(GroupPermissions.ALL.equals(all));
    }
}
