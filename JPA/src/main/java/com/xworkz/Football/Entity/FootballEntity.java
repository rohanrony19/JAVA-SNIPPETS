package com.xworkz.Football.Entity;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="football_details")

public class FootballEntity {
    @Id
    private int id;

    @Column(name="TeamName")
    private String Teamname;

    @Column(name = "CountryName")
    private String CountryName;

    @Column(name = "NumberofPlayers")
    private int numberPlayers;

    @Column(name = "CaptainName")
    private String Captain;

    @Column(name = "MatchesWOn")
    private int matchesWon;

    public int getNumberPlayers() {
        return numberPlayers;
    }

    public void setNumberPlayers(int numberPlayers) {
        this.numberPlayers = numberPlayers;
    }

    public String getCaptain() {
        return Captain;
    }

    public void setCaptain(String captain) {
        Captain = captain;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return Teamname;
    }

    public void setTeamName(String teamName) {
        Teamname = teamName;
    }

    public String getCountryName() {
        return CountryName;
    }

    public void setCountryName(String countryName) {
        CountryName = countryName;
    }


    public FootballEntity(int id, String teamname, String countryName, int numberPlayers, String captain, int matchesWon) {
        this.id = id;
        Teamname = teamname;
        CountryName = countryName;
        this.numberPlayers = numberPlayers;
        Captain = captain;
        this.matchesWon = matchesWon;
    }

    @Override
    public String toString() {
        return "FootballEntity{" +
                "id=" + id +
                ", Teamname='" + Teamname + '\'' +
                ", CountryName='" + CountryName + '\'' +
                ", numberPlayers=" + numberPlayers +
                ", Captain='" + Captain + '\'' +
                ", matchesWon=" + matchesWon +
                '}';
    }
}
