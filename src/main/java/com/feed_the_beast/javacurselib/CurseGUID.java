package com.feed_the_beast.javacurselib;

import javax.annotation.Nonnull;
import java.util.UUID;


public class CurseGUID {
    public enum Type {
        UUID(0), INT(1), TWO_INTS(1);

        private int value;

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

    public static CurseGUID newFromString(String s) {
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

    public static CurseGUID newRandomGUID() {
        CurseGUID result = new CurseGUID(UUID.randomUUID());
        return result;
    }

    @Override
    public String toString() {
        return "CurseGUID{" +
                "uuid=" + uuid +
                ", intLeft=" + intLeft +
                ", intRight=" + intRight +
                ", type=" + type +
                '}';
    }
}
