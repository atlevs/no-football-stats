package com.atle.footballstatsapi.models;

import lombok.Data;

@Data
public class Stadium {
    private String name;
    private int capacity;
    private int sittingCapacity;
    private int pitchLength;
    private int pitchWidth;
    private String openedDate;
    private boolean hasFloodlights;
    private boolean hasUnderSoilHeating;
    private boolean hasRunningTrack;
    private boolean hasRoof;
    private boolean hasRetractablePitch;
    private boolean isIndoorArena;
    private String stadiumAddress;
    private String comment;
    private String surface;
    private int attendanceRecord;
    private Place place;
    private Country country;
    private Image image;
    private String dateFrom;
    private String dateTo;
    private String type;
    private String uid;
    private int id;
}
