package com.ammarnaji.nbaapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;


@JsonIgnoreProperties(ignoreUnknown = true)
public class GameDTO {
    @JsonProperty("data")
    private Game[] games;

    public Game[] getGames() {
        return games;
    }

    public void setGames(Game[] games) {
        this.games = games;
    }

    @Override
    public String toString() {
        return "GameDTO{" +
                "games=" + Arrays.toString(games) +
                '}';
    }
}
