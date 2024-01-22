package com.atle.footballstatsapi.controllers;

import com.atle.footballstatsapi.models.Team;
import com.atle.footballstatsapi.services.HttpRequestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/api")

public class MainController {
    @Autowired
    HttpRequestServiceImpl HttpRequestServiceImpl;

    @GetMapping("/team/{id}")
    public Mono<Team> getTeam(@PathVariable int id) {
        return HttpRequestServiceImpl.getTeam(id);

    }

    @GetMapping("/teams")
    public Flux<Team> getTeams(@RequestParam(required = false) boolean women) {
        System.out.println("inlcudeWomen: " + women + " test");
        return HttpRequestServiceImpl.getTeams(women);
    }

    @GetMapping("/teams/eliteserien")
    public Flux<Team> getTeamsEliteserien() {
        return HttpRequestServiceImpl.getTeamsEliteserien();
    }
}
