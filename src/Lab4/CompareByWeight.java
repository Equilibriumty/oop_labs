package Lab4;

import java.util.Comparator;

public class CompareByWeight implements Comparator<Inventory> {
    @Override
    public int compare(Inventory o1, Inventory o2) {
        return o1.Weight - o2.Weight;
    }
}
