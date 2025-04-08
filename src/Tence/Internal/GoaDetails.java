package Inheritence.Internal;

public class GoaDetails {
    public void details(Place place)
    {
        place.Distance();
        place.Lake();
        place.Location();
        place.Nature();
        place.OffRoad();

        if(place instanceof Goa)
        {
            Goa goa =(Goa)place;
            goa.loction();
        }
    }
}
