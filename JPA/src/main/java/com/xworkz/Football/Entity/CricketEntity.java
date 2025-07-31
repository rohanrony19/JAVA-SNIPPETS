package com.xworkz.Football.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cricket_details")
public class CricketEntity {
    @Id
    private int id;

    @Column(name="teamName")
    private String teamName;

    @Column(name = "country")
    private String country;

    @Column(name = "NumberofPlayers")
    private int noOfPlayers;

    @Column(name = "CaptainName")
    private String captainName;

    @Column(name = "MatchesWon")
    private int matchesWon;

    public CricketEntity(int id, String teamName, String country, int noOfPlayers, String captainName, int matchesWon) {
        this.id = id;
        this.teamName = teamName;
        this.country = country;
        this.noOfPlayers = noOfPlayers;
        this.captainName = captainName;
        this.matchesWon = matchesWon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getCaptainName() {
        return captainName;
    }

    public void setCaptainName(String captainName) {
        this.captainName = captainName;
    }

    public int getMatchesWon() {
        return matchesWon;
    }

    public void setMatchesWon(int matchesWon) {
        this.matchesWon = matchesWon;
    }

    @Override
    public String toString() {
        return "CricketEntity{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", country='" + country + '\'' +
                ", noOfPlayers=" + noOfPlayers +
                ", captainName='" + captainName + '\'' +
                ", matchesWon=" + matchesWon +
                '}';
    }
}
