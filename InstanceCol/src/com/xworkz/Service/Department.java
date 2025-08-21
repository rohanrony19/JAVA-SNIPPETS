package com.xworkz.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Department {
    private String branch;
    private int classes;
    private int NoOfStuffs;
    private String head;
    private HeadOfDepartment headOfDepartment;

}
