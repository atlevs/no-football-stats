package com.atle.footballstatsapi.services;

import com.atle.footballstatsapi.models.Team;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface HttpRequestService {

    public Mono<Team> getTeam(int id);

    Flux<Team> getTeamsEliteserien();
}
