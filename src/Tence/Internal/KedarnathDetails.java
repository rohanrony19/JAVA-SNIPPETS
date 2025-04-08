package Inheritence.Internal;

public class KedarnathDetails {
    public void detail(Place place) {
        {
            place.Distance();
            place.Lake();
            place.Location();
            place.Nature();
            place.OffRoad();

            if (place instanceof Kedarnath) {
                Kedarnath kedarnath = (Kedarnath) place;
                kedarnath.God();
            }
        }
    }
}
