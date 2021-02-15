package attractions;

import behaviours.IReviewed;

public class Dodgems extends Attraction {

    public Dodgems(String name, int rating) {
        super(name, rating);
    }



    public int getRating() {
        return 10;
    }

    public String getName() {
       return "name";
    }
}
