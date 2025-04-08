package Inheritence.Runner;

import Inheritence.Internal.*;

public class MainRunner {
    public static void main(String[] args) {
        Place place= new Place();
        place.Distance();
        place.Location();
        place.Lake();
        place.Nature();
        place.OffRoad();

        Ladakh ladakh = new Ladakh();
        ladakh.Distance();
        ladakh.Lake();
        ladakh.Location();
        ladakh.OffRoad();
        ladakh.Nature();

        Maldives maldives = new Maldives();
        maldives.Distance();
        maldives.Lake();
        maldives.Location();
        maldives.OffRoad();
        maldives.Nature();

        Goa goa = new Goa();
        goa.Beach();
        goa.Rave();
        goa.Party();
        goa.Nightout();
        goa.Massage();
        System.out.println("");
        Place place1 = new Place();
        Goa goa1 = new Goa();
        GoaDetails goaDetails = new GoaDetails();
        goaDetails.details(goa1);

        Kedarnath kedarnath = new Kedarnath();
        kedarnath.Method1();
        kedarnath.Method2();
        kedarnath.Method3();
        kedarnath.Method4();
        kedarnath.Method5();

        System.out.println("");
        Place place2 = new Place();
        Kedarnath kedarnath1 = new Kedarnath();
        KedarnathDetails kedarnathDetails = new KedarnathDetails();
        kedarnathDetails.detail(kedarnath1);

        ladakh.Lake();
        ladakh.Location();
        ladakh.OffRoad();
        ladakh.Nature();

        Vrindhvan vrindhvan = new Vrindhvan();
        ladakh.Distance();
        ladakh.Lake();
        ladakh.Location();
        ladakh.OffRoad();
        ladakh.Nature();

    }


}
