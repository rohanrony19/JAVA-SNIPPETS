package com.xworkz.Array.Runner;

//import com.xworkz.Collection.dto.BileDTO;

import com.xworkz.Array.dto.BikeDTO;

import java.util.ArrayList;
import java.util.Collection;

public class BikeRunner {
    public static void main(String[] args) {
        Collection<BikeDTO> bike = new ArrayList<>();
        bike.add(new BikeDTO("Himalayan", "Royal Enfield", "White", "Adventure", "450CC", "KA14EN7845", "Skanda"));
        bike.add(new BikeDTO("Duke 390", "KTM", "Orange", "Sports", "390CC", "KA01AB1234", "Ravi"));
        bike.add(new BikeDTO("Classic 350", "Royal Enfield", "Black", "Cruiser", "350CC", "KA02CD5678", "Manoj"));
        bike.add(new BikeDTO("Pulsar NS200", "Bajaj", "Blue", "Naked", "200CC", "KA03EF9012", "Kiran"));
        bike.add(new BikeDTO("Apache RTR 160", "TVS", "Red", "Street", "160CC", "KA04GH3456", "Deepak"));
        bike.add(new BikeDTO("FZ-S", "Yamaha", "Matte Green", "Street", "150CC", "KA05IJ7890", "Suresh"));
        bike.add(new BikeDTO("Gixxer", "Suzuki", "Grey", "Naked", "155CC", "KA06KL1122", "Ramesh"));
        bike.add(new BikeDTO("CBR 250R", "Honda", "Repsol", "Sports", "250CC", "KA07MN3344", "Arjun"));
        bike.add(new BikeDTO("Interceptor 650", "Royal Enfield", "Silver", "Cruiser", "650CC", "KA08OP5566", "Varun"));
        bike.add(new BikeDTO("MT-15", "Yamaha", "Black", "Naked", "155CC", "KA09QR7788", "Prashanth"));
        System.out.println("Bike Details:");
        for(BikeDTO bikeDTO : bike) {
            System.out.println("Differnt Type Of Bike Names:" + bikeDTO.getName());
            System.out.println("");  
            System.out.println("Brand Name: "+ bikeDTO.getBrand());
            System.out.println("");
            System.out.println("Bike Color: "+ bikeDTO.getColor());
            System.out.println("");
            System.out.println("Bike Type: "+ bikeDTO.getType());
            System.out.println("");
            System.out.println("Bike Capacity: "+ bikeDTO.getCapacity());
            System.out.println("");
            System.out.println("Bike Number: "+ bikeDTO.getNumber());
            System.out.println("");
            System.out.println("Bike Owner: "+ bikeDTO.getOwner());
        }


    }
}
