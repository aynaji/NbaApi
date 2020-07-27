package com.ammarnaji.nbaapi.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;

public class PlayerDTO {
    @JsonProperty("data")
    private Player[] players;

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "PlayerDTO{" +
                "players=" + Arrays.toString(players) +
                '}';
    }
}
