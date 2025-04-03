package com.xworkz.inheritence.runner;

import com.xworkz.inheritence.internal.caboard.Caboard;
import com.xworkz.inheritence.internal.caboard.Door;

public class CaboardRunner {
    public static void main(String[] args) {
        Caboard caboard=new Door();
        caboard.close();
        caboard.key();
        caboard.lock();
        caboard.handle();
        caboard.open();

        System.out.println("-----------");
        Door door=new Door();
        door.close();
        door.key();
        door.handle();
        door.open();
        door.lock();

    }

}
