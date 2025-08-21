package com.xworkz.Runner;

import com.xworkz.DTO.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Runner {
    public static void main(String[] args) {

     //product-->company-->list<owner>

   ProductDTO productDTO1= getProduct("CPU","Intel","owner2@gmail.com","owner3@gmail.com");
   ProductDTO productDTO2=getProduct("Keyboard","Google","owner3@gmail.com","owner3@gmail.com");
   ProductDTO productDTO3=getProduct("Wire","Lenovo","owner4@gmail.com","owner3@gmail.com");

   Collection<ProductDTO> productDTOS=new ArrayList<>();
   productDTOS.add(productDTO1);
   productDTOS.add(productDTO2);
   productDTOS.add(productDTO3);

   //filters

        productDTOS
                .stream()
                .filter(productDTO->productDTO.getCompanyDTO().getName().equals("Google"))
                .findAny().ifPresent(e-> System.out.println(e));

        System.out.println("=============");

        productDTOS
                .stream()
                .filter(product-> {
                 List<OwnerDTO> ownerDTOS=   product.getCompanyDTO().getOwnerDTO();
                 return ownerDTOS
                         .stream()
                         .filter(owner->owner.getEmail().equals("owner3@gmail.com"))
                         .findAny().isPresent();
                })
                .forEach(product-> System.out.println(product));


    }

    private static ProductDTO getProduct(String productName,String companyName,String ownerEmail1,String ownerEmail2) {
        OwnerDTO ownerDTO1=new OwnerDTO("Rohan",1,ownerEmail1,23);
        OwnerDTO ownerDTO2=new OwnerDTO("Roshan",2,ownerEmail2,23);

        List<OwnerDTO> ownerDTOS1=new ArrayList<>();
        ownerDTOS1.add(ownerDTO1);
        ownerDTOS1.add(ownerDTO2);

        CompanyDTO  companyDTO=
                new CompanyDTO(companyName,200,"Tech","USA",ownerDTOS1);//last is ref of LIST


        ProductDTO productDTO=new ProductDTO(productName,34,"ELE",20000,companyDTO);
    return  productDTO;
    }
}
