package com.atle.footballstatsapi.services;

import com.atle.footballstatsapi.models.Team;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class HttpRequestServiceImpl implements HttpRequestService {

    private  final WebClient webClient;

    public HttpRequestServiceImpl(WebClient.Builder webClientBuilder,  @Value("${football-stats-api.nifs.url}") String baseUrl) {
        this.webClient = webClientBuilder.baseUrl(baseUrl)
                .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
                .build();
    }

    public Mono<Team> getTeam(int id) {
        return webClient.get()
                .uri("teams/" + id +"/")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(Team.class)
                .doOnError(error -> System.out.println("Error: " + error));
        }

    public Flux<Team> getTeamsEliteserien() {
        return webClient.get()
                .uri("/stages/1/teams/")
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToFlux(Team.class)
                .doOnError(error -> System.out.println("Error: " + error));
    }

    public Flux<Team> getTeams(boolean women) {
            return webClient.get()
                    .uri("/countries/1/teams/?gender=" + (women ? "women" : "men"))
                    .accept(MediaType.APPLICATION_JSON)
                    .retrieve()
                    .bodyToFlux(Team.class)
                    .doOnError(error -> System.out.println("Error: " + error));
        }
}
