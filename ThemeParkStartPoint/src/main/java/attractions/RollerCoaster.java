package attractions;


import behaviours.IReviewed;
import behaviours.ISecurity;

public class RollerCoaster  extends Attraction implements ISecurity {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }
}
