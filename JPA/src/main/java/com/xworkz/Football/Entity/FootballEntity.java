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

    private String CountryName;

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

    public FootballEntity(int id, String teamName, String countryName) {
        this.id = id;
        Teamname = teamName;
        CountryName = countryName;
    }

    @Override
    public String toString() {
        return "FootballEntity{" +
                "id=" + id +
                ", TeamName='" + Teamname + '\'' +
                ", CountryName='" + CountryName + '\'' +
                '}';
    }
}
