package com.atle.footballstatsapi.models;

import lombok.Data;

import java.util.List;

@Data
public class Kit {
    private List<String> colorCodes;
    private int kitTypeId;
    private String numberColor;
    private int patternId;
    private String type;
    private String uid;
    private int id;
    private int sportId;
}
