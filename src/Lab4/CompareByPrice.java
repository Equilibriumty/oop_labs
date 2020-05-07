package Lab4;

import java.util.Comparator;

public class CompareByPrice implements Comparator<Inventory> {
    @Override
    public int compare(Inventory o1, Inventory o2) {
        return o2.Price - o1.Price;
    }
}
