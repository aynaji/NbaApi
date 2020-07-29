package com.ammarnaji.nbaapi.service;

import com.ammarnaji.nbaapi.model.*;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;


@Service
public class NbaService {

    private final WebClient webClient;

    public NbaService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder
                .baseUrl("https://free-nba.p.rapidapi.com")
                .defaultHeader("x-rapidapi-key", "92db3be041msh927a40d36b202bfp18ae92jsnbe3ed84e90dd").build();
    }

    public Mono<GameDTO> getAllGames() {
        return this.webClient.get().uri("/games").retrieve().bodyToMono(GameDTO.class);
    }

    public Mono<TeamDTO> getAllTeams() {
        return this.webClient.get().uri("/teams").retrieve().bodyToMono(TeamDTO.class);
    }

    public Mono<PlayerDTO> getAllPlayer() {
        return this.webClient.get().uri("/players").retrieve().bodyToMono(PlayerDTO.class);
    }

    public Mono<Game> getGameById(String id) {
        return this.webClient.get().uri("/games/" +id).retrieve().bodyToMono(Game.class);
    }

    public Mono<Player> getPlayerById(String id) {
        return this.webClient.get().uri("/players/" +id).retrieve().bodyToMono(Player.class);
    }

    public Mono<Team> getTeamById(String id) {
        return this.webClient.get().uri("/teams/" +id).retrieve().bodyToMono(Team.class);
    }
}
