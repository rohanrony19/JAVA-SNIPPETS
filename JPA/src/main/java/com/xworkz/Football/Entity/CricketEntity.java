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

    @Column(name="")
    private String teamName;

    private String country;

    private int noOfPlayers;

    private String captainName;

    private int matchesWon;
}
