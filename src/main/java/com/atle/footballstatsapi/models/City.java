package com.atle.footballstatsapi.models;

import lombok.Data;

@Data
public class City {
    private String name;
    private Country country;
    private String type;
    private String uid;
    private int id;
}
