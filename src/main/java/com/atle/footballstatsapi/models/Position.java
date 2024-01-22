package com.atle.footballstatsapi.models;

import lombok.Data;

@Data
public class Position {
    private String position;
    private Integer x;
    private Integer y;
    private String type;
    private String uid;
    private int id;
}
