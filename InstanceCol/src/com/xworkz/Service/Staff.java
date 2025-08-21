package com.xworkz.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Staff {
    private String name;
    private int age;
    private String profession;
    private int salary;
    private Detail detail;
}
