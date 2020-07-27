package com.ammarnaji.nbaapi.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Arrays;
import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {

    private int id;
    private String date;
    @JsonProperty("home_team")
    private Team homeTeam;
    @JsonProperty("home_team_score")
    private int homeTeamScore;
    private short period;
    @JsonProperty("postseason")
    private boolean postSeason;
    private int season;
    private String status;
    private String time;
    @JsonProperty("visitor_team")
    private Team visitorTeam;
    private int visitor_team_score;

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", date=" + date +
                ", homeTeam=" + homeTeam +
                ", homeTeamScore=" + homeTeamScore +
                ", period=" + period +
                ", postSeason=" + postSeason +
                ", season=" + season +
                ", status='" + status + '\'' +
                ", time='" + time + '\'' +
                ", visitorTeam=" + visitorTeam +
                ", visitor_team_score=" + visitor_team_score +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Team getHomeTeam() {
        return homeTeam;
    }

    public void setHomeTeam(Team homeTeam) {
        this.homeTeam = homeTeam;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

    public void setHomeTeamScore(int homeTeamScore) {
        this.homeTeamScore = homeTeamScore;
    }

    public short getPeriod() {
        return period;
    }

    public void setPeriod(short period) {
        this.period = period;
    }

    public boolean isPostSeason() {
        return postSeason;
    }

    public void setPostSeason(boolean postSeason) {
        this.postSeason = postSeason;
    }

    public int getSeason() {
        return season;
    }

    public void setSeason(int season) {
        this.season = season;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Team getVisitorTeam() {
        return visitorTeam;
    }

    public void setVisitorTeam(Team visitorTeam) {
        this.visitorTeam = visitorTeam;
    }

    public int getVisitor_team_score() {
        return visitor_team_score;
    }

    public void setVisitor_team_score(int visitor_team_score) {
        this.visitor_team_score = visitor_team_score;
    }
}
