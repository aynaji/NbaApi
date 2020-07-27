package com.ammarnaji.nbaapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;


@JsonIgnoreProperties(ignoreUnknown = true)
public class TeamDTO {
    @JsonProperty("data")
   private Team[] teams;

    public Team[] getTeams() {
        return teams;
    }

    public void setTeams(Team[] teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "TeamDTO{" +
                "teams=" + Arrays.toString(teams) +
                '}';
    }
}
