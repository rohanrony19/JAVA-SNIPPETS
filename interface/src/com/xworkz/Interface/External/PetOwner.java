package com.xworkz.Interface.External;

import com.xworkz.Interface.Internal.Animal;

public class PetOwner {
    private Animal animal;

    public PetOwner(Animal animal) {
        this.animal = animal;
        System.out.println("Assigning animal instance to PetOwner");
    }

    public void callPet() {
        if (this.animal != null) {
            this.animal.speak();
            System.out.println("Calling pet in PetOwner");
        } else {
            System.out.println("null");
        }
    }
}
