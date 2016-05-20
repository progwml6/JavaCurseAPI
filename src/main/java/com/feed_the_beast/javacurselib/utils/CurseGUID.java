package com.feed_the_beast.javacurselib.utils;

import javax.annotation.Nonnull;
import java.util.UUID;


public class CurseGUID {
    public enum Type {
        UUID(0), INT(1), TWO_INTS(1);

        private long value;

        Type(int value) {
            this.value = value;
        }
    }

    private UUID uuid;
    private long intLeft;
    private long intRight;
    private Type type;

    public UUID getUuid() {
        if (type != Type.UUID) {
            throw new IllegalStateException("An object instance does not contain UUID object");
        }
        return uuid;
    }

    public long getIntLeft() {
        if (type == Type.UUID) {
            throw new IllegalStateException("An object instance does not contain int");
        }
        return intLeft;
    }

    public long getIntRight() {
        if (type != Type.TWO_INTS) {
            throw new IllegalStateException("An object instance does not contain int");
        }
        return intRight;
    }

    public Type getType() {
        return type;
    }

    private CurseGUID() {
    }

    private CurseGUID(@Nonnull UUID uuid) {
        this.type = Type.UUID;
        this.uuid = uuid;
    }

    private CurseGUID(long intLeft) {
        this.type = Type.INT;
        this.intLeft = intLeft;
    }

    private CurseGUID(long intLeft, long intRight) {
        this.type = Type.TWO_INTS;
        this.intLeft = intLeft;
        this.intRight = intRight;
    }

    public static CurseGUID newFromUUIDString(String s) {
        CurseGUID result = new CurseGUID(UUID.fromString(s));
        return result;
    }

    public static CurseGUID newFromUUID(UUID u) {
        CurseGUID result = new CurseGUID(u);
        return result;
    }

    public static CurseGUID newFromLong(long l) {
        CurseGUID result = new CurseGUID(l);
        return result;
    }

    public static CurseGUID newFromLong(long l, long r) {
        CurseGUID result = new CurseGUID(l, r);
        return result;
    }

    public static CurseGUID newRandomUUID() {
        CurseGUID result = new CurseGUID(UUID.randomUUID());
        return result;
    }

    public static CurseGUID newFromZeroUUID() {
        CurseGUID result = new CurseGUID(new UUID(0,0));
        return result;
    }

    public String serialize() {
        switch (getType()) {
            case UUID:
                return getUuid().toString();
            case INT:
                return Long.toString(getIntLeft());
            case TWO_INTS:
                return Long.toString(getIntLeft()) + ":" + Long.toString(getIntRight());
        }
        return null;
    }

    public static CurseGUID deserialize(String s) {
        CurseGUID result;
        if (s.matches("[a-f0-9]{8}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{4}-[a-f0-9]{12}")) {
            result = CurseGUID.newFromUUIDString(s);
        } else if (s.matches("[0-9]*")) {
            long l = Long.parseLong(s);
            result = CurseGUID.newFromLong(l);
        } else if (s.matches("[0-9]*:[0-9]*")) {
            String[] splitted = s.split(":");
            long l = Long.parseLong(splitted[0]);
            long r = Long.parseLong(splitted[1]);
            result = CurseGUID.newFromLong(l, r);
        } else {
            throw new IllegalStateException();
        }
        return result;
    }

    @Override
    public String toString() {
        switch (type) {
            case UUID:
                return uuid.toString();
            case INT:
                return Long.toString(intLeft);
            case TWO_INTS:
                return Long.toString(intLeft) + ":" + Long.toString(intRight);
        }
        return "ERROR?";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CurseGUID curseGUID = (CurseGUID) o;

        if (type != curseGUID.type) return false;
        switch (type) {
            case UUID:
                return uuid.equals(curseGUID.uuid);
            case INT:
                return intLeft == curseGUID.intLeft;
            case TWO_INTS:
                return intLeft == curseGUID.intLeft
                        && intRight == curseGUID.intRight;
        }
        return false;
    }

    @Override
    public int hashCode() {
        int result = uuid.hashCode();
        result = 31 * result + (int) (intLeft ^ (intLeft >>> 32));
        result = 31 * result + (int) (intRight ^ (intRight >>> 32));
        result = 31 * result + type.hashCode();
        return result;
    }
}
