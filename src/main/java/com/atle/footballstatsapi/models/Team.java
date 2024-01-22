package com.atle.footballstatsapi.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Team {
    private String name;
    private Country country;
    private String homePage;
    private String address;
    private boolean clubTeam;
    private String gender;
    private int attendanceRecord;
    private String dateFounded;
    private String comment;
    private City city;
    private boolean placeHolder;
    private Image logo;
    private Image teamPhoto;
    private List<Stadium> stadiums;
    private List<Name> names;
    private List<Kit> kits;
    private List<Honour> honours;
    private List<Player> players;
}
