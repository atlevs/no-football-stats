package com.atle.footballstatsapi.models;

import lombok.Data;

@Data
public class Tournament {
    private String name;
    private String level;
    private String type;
    private String uid;
    private int id;
    private int sportId;
}
