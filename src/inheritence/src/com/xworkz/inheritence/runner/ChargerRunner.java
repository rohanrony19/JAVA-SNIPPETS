package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.charger.Charger;
import com.xworkz.inheritence.internal.charger.Wire;

public class ChargerRunner {
    public static void main(String[] args) {
        Charger charger=new Wire();
        charger.cPin();
        charger.phone();
        charger.plug();
        charger.small();
        charger.white();

        System.out.println("---------");
        Wire wire=new Wire();
        wire.cPin();
        wire.plug();
        wire.phone();
        wire.small();
        wire.white();

    }

}
