package com.atle.footballstatsapi.models;

import lombok.Data;

import java.util.List;

@Data
public class ExternalIds {
    private List<Integer> fiks;
    private List<Integer> tv2;
}
