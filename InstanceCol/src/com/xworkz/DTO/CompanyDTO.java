package com.xworkz.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CompanyDTO {
    private String name;
    private int members;
    private String field;
    private String location;
    private List<OwnerDTO> ownerDTO;
}
