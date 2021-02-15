package attractions;


import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster extends Attraction implements ISecurity, ITicketed {


    @Override
    public double defaultPrice() {
        return 8.40;
    }

    @Override
    public double priceFor(Visitor visitor) {
        return 0;
    }

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    @Override
    public boolean isAllowedTo(Visitor visitor) {

        if (visitor.getHeight() > 145 && visitor.getAge() > 12) {
            return true;
        }
        return false;
    }

    public int getRating() {
        return 10;
    }

    public String getName() {
        return "name";
    }
}
