package attractions;

public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }

    public int getRating() {
    return 10;
    }

    public String getName() {
    return "Name";
    }
}
