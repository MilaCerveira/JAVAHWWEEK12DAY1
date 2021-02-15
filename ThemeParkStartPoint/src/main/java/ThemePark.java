import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;

import java.util.ArrayList;
import java.util.List;

public class ThemePark {
    private List<IReviewed> attractionsAndStalls = new ArrayList<>();

    public List<IReviewed> getAllReviewed () {
        return attractionsAndStalls;
    }
}


