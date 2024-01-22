package com.atle.footballstatsapi.models;

import lombok.Data;

@Data
public class Honour {
    private String name;
    private int honourTypeId;
    private Tournament tournament;
    private int stageId;
    private int year;
    private String title;
    private String type;
    private String uid;
    private int id;
    private int sportId;
}
