package com.ammarnaji.nbaapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


@JsonIgnoreProperties(ignoreUnknown = true)
public class Player {
    private int id;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("height_feet")
    private byte heightFeet;
    @JsonProperty("height_inches")
    private byte heightInches;
    @JsonProperty("last_name")
    private String lastName;
    private String position;
    private Team team;
    @JsonProperty("weight_pounds")
    private int weightPounds;

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", heightFeet=" + heightFeet +
                ", heightInches=" + heightInches +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", team=" + team +
                ", weightPounds=" + weightPounds +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(byte heightFeet) {
        this.heightFeet = heightFeet;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(byte heightInches) {
        this.heightInches = heightInches;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getWeightPounds() {
        return weightPounds;
    }

    public void setWeightPounds(int weightPounds) {
        this.weightPounds = weightPounds;
    }
}
