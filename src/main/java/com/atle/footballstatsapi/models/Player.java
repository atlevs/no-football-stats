package com.atle.footballstatsapi.models;

import lombok.Data;

import java.util.List;

@Data
public class Player {

    private String name;
    private String birthDate;
    private String fromDate;
    private String toDate;
    private boolean active;
    private int employmentId;
    private Integer contractTypeId;
    private int shirtNumber;
    private Position position;
    private Country country;
    private Place birthPlace;
    private int height;
    private boolean isAReferee;
    private String gender;
    private Image profilePicture;
    private List<Image> profilePictures;
    private boolean hiddenPersonInfo;
    private String type;
    private String uid;
    private int id;
    private ExternalIds externalIds;
    private int sportId;
}
