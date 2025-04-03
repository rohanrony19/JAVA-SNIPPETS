package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.planet.Planet;
import com.xworkz.inheritence.internal.planet.Earth;

public class PlanetRunner {
    public static void main(String[] args) {
        Planet planet = new Earth();
        planet.orbitsSun();
        planet.hasGravity();
        planet.hasAtmosphere();
        planet.supportsLife();
        planet.hasOceans();

        System.out.println("-----------");

        Earth earth = new Earth();
        earth.orbitsSun();
        earth.hasGravity();
        earth.hasAtmosphere();
        earth.supportsLife();
        earth.hasOceans();
    }
}
