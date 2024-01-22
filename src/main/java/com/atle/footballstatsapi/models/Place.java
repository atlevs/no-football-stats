package com.atle.footballstatsapi.models;

import lombok.Data;

@Data
public class Place {
    private String name;
    private String type;
    private String uid;
    private int id;
    private Object externalIds;
}
