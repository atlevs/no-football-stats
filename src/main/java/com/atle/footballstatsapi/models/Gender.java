package com.atle.footballstatsapi.models;

public enum Gender {
    MEN, WOMEN;

    private String key;

    public static Gender getGender(String name) {
        if (name.startsWith("m")) return MEN;
        return WOMEN;
    }
}
