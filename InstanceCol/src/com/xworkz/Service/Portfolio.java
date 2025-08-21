package com.xworkz.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Portfolio {
    private String userName;
    private int NoOfSKills;
    private String website;
    private String degree;
    private Department department;
}
